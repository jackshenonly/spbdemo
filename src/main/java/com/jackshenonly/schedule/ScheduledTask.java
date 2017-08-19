package com.jackshenonly.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jackshenonly on 17/8/14.
 */
@Component
//@EnableScheduling //开启定时任务
public class ScheduledTask {
    public static  final Logger log = LoggerFactory.getLogger(ScheduledTask.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void printTime(){
        log.info("=======>>" + dateFormat.format(new Date()));
    }
}
