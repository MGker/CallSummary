package com.callsummary.Task;

import com.callsummary.service.CallSummaryService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: fujian
 * @Date: 2019-8-9 11:47
 * @Description: 录音小结 定时任务类
 */
@PropertySource("classpath:config.properties")
@Component
public class CallSummaryTask extends TimerTask {
    private Logger logger = LoggerFactory.getLogger(CallSummaryTask.class);
    private ScheduledExecutorService scheExec = Executors.newScheduledThreadPool(20);
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private Calendar calendar = Calendar.getInstance();
    /**
     * 查询记录的开始时间
     */
    private Date startTime;

    @Autowired
    private CallSummaryService callSummaryService;


    @Value("${task.duration:100}")
    private Integer taskDuration;
    @Value("${search.start.time}")
    private String searchStartTimeStr;

    @PostConstruct
    private void init() {
        if (StringUtils.isEmpty(searchStartTimeStr)) {//没有配置查询的开始时间，则默认使用当前时间前10分钟
            calendar.setTime(new Date());
            calendar.add(Calendar.MINUTE, -10);//前十分钟
            startTime = calendar.getTime();
        } else {//配置了查询开始时间则使用
            try {
                startTime = sdf.parse(searchStartTimeStr);
            } catch (ParseException e) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.MINUTE, -10);//前十分钟
                startTime = calendar.getTime();
                logger.warn("配置的开始时间格式不正确:[{}]，现已默认使用当前时间前10分钟作为开始时间,值为:[{}]", searchStartTimeStr, sdf.format(startTime));
            }
        }

        if (taskDuration < 60) {//任务执行间隔最小60s
            logger.warn("定时任务间隔时间不能小于60s,现已默认使用最小时间60s.填写的值为：[{}]",taskDuration);
            taskDuration = 60;
        }
    }

    @Override
    public void run() {
        calendar.setTime(new Date());
//        calendar.add(Calendar.MINUTE, -1);//查询的结束时间为当前时间前1分钟
        Date endTime = calendar.getTime();
        logger.info("定时任务执行:[{}-{}]",sdf.format(startTime),sdf.format(endTime));
        callSummaryService.writeTimeDurationCallSummaryInfo(startTime, endTime);

        logger.info("本次定时任务结束:[{}-{}]",sdf.format(startTime),sdf.format(endTime));
        startTime = endTime;

    }

    public void task() {
        scheExec.scheduleWithFixedDelay(this, 0, taskDuration, TimeUnit.SECONDS);

    }

}

