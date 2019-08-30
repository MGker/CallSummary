package com.callsummary.Task;

import com.callsummary.mapper.CallMapper;
import com.callsummary.model.Call;
import com.callsummary.service.CallSummaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Auther: fujian
 * @Date: 2019-8-9 17:58
 * @Description:
 */
@Component
public class CompletionDataTask {
    private Logger logger = LoggerFactory.getLogger(CompletionDataTask.class);
    @Resource
    private CallMapper callMapper;
    @Autowired
    private CallSummaryService callSummaryService;
    private Date startDate;
//    @Scheduled(cron = "0 0 23 * * ?")//每天23点执行一次
    public void completionData(){
        logger.info("开始执行 数据完整性 定时任务");
        Calendar calendar = Calendar.getInstance();
        Date endDate = calendar.getTime();
        if(startDate==null){
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            startDate = calendar.getTime();
        }
        List<Call> callList = callMapper.selectNotHasSummaryCallList(startDate.getTime(),endDate.getTime());
        logger.info("任务扫描到需要 完整性操作的录音记录条数:[{}]",callList.size());
        callSummaryService.writeCallSummaryInfo(callList);
        logger.info("数据完整性 定时任务 执行完成");
        startDate = endDate;
    }
}
