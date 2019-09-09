package com.callsummary.service;

import com.alibaba.fastjson.JSONObject;
import com.callsummary.mapper.CallMapper;
import com.callsummary.mapper.CallSummaryMapper;
import com.callsummary.model.Call;
import com.callsummary.model.CallExample;
import com.callsummary.model.CallSummary;
import com.callsummary.model.CallSummaryExample;
import com.callsummary.utils.HttpUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Auther: fujian
 * @Date: 2019-8-9 16:43
 * @Description:
 */
@PropertySource("file:config.properties")
@Service
public class CallSummaryService {
    private Logger logger = LoggerFactory.getLogger(CallSummaryService.class);

    @Resource
    private CallMapper callMapper;
    @Resource
    private CallSummaryMapper callSummaryMapper;

    @Value("${request.url}")
    private String requestUrl;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    /**
     * 获取录音记录的电话小结信息并入库
     *
     * @param callList
     */
    @Transactional
    public void writeCallSummaryInfo(List<Call> callList) {
        if (callList == null) return;
        Map<String, String> param = new HashMap<>();
        for (Call call : callList) {
            if(StringUtils.isEmpty(call.getCticallid())){//该录音记录还没有获取到cti流水号则跳过
                logger.warn("该录音记录还没有获取到CTI流水号。录音流水号:[{}]",call.getCallreference());
                continue;
            }
            param.put("cti_no", call.getCticallid());
            String result = "{}";
            try {
                result = HttpUtil.doGet(requestUrl, param);
            } catch (Exception e) {
                logger.error("请求电话小结接口失败，接口地址：[{}]", requestUrl, e);
                logger.warn("程序退出.请修复接口地址后再重启程序");
                System.exit(0);//退出程序
            }
            logger.info("获取到CTI流水号([{}]) 的电话小结接口请求返回值:[{}]",call.getCticallid(),result);
            JSONObject resultJson = JSONObject.parseObject(result);
            if ("0".equals(resultJson.getString("status"))) {//请求成功
                String dataStr = resultJson.getString("data");
                try {
                    CallSummary callSummary = JSONObject.parseObject(dataStr, CallSummary.class);

                    callSummary.setCallreference(call.getCallreference());
                    //判断该通话流水号对应的电话小结记录是否已经存在
                    CallSummaryExample summaryExample =  new CallSummaryExample();
                    summaryExample.createCriteria().andCALLREFERENCEEqualTo(call.getCallreference());
                    List<CallSummary> summaries = callSummaryMapper.selectByExample(summaryExample);
                    if(summaries.size()>0){//存在则更新
                        CallSummary summary = summaries.get(0);
                        callSummary.setId(summary.getId());
                        callSummaryMapper.updateByPrimaryKey(callSummary);
                    }else{//不存在则插入
                        callSummaryMapper.insert(callSummary);
                    }
                } catch (Exception e) {
                    logger.error("[{}]：获取到的电话小结信息格式不正确。CTI流水号:[{}] , 接口请求返回值:[{}]",e.getMessage(),call.getCticallid(),resultJson);
                }
            } else {//请求失败
                logger.warn("获取电话小结失败。录音流水号：[{}]",call.getCallreference());
            }

        }
    }


    /**
     * 处理指定时间范围内的录音记录 电话小结信息并入库
     *
     * @param startTime
     * @param endTime
     */
    @Transactional
    public void writeTimeDurationCallSummaryInfo(Date startTime, Date endTime) {
        CallExample callExample = new CallExample();
        List<String> directionList = new ArrayList();
        directionList.add("I");
        directionList.add("1");
        BigDecimal startTimeVal = new BigDecimal(startTime.getTime());
        BigDecimal endTimeVal = new BigDecimal(endTime.getTime());
        callExample.createCriteria().andInserttimeBetween(startTimeVal, endTimeVal)//指定时间段
                .andCticallidIsNotNull()//有Cti流水号
                .andDirectionIn(directionList);//电话呼入的记录

        //查询时间范围内录音记录
        List<Call> callList = callMapper.selectByExample(callExample);
        logger.info("指定时间范围[{}] [{}]内查到的记录数有:[{}]",sdf.format(startTime),sdf.format(endTime),callList.size());
        writeCallSummaryInfo(callList);
    }

}
