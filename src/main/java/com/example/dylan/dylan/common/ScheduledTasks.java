package com.example.dylan.dylan.common;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/2.
 */
@Component
public class ScheduledTasks {//定时任务类
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)//设置定时时间
    public void reportCurrentTime() {

        System.out.println("now time:"+dateFormat.format(new Date()));
    }


}
