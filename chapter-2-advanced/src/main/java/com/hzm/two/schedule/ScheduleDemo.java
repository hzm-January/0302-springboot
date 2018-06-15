package com.hzm.two.schedule;

import org.joda.time.DateTime;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleDemo {

    /**
     * 周期性调度
     * 工作日每五秒
     */
    @Scheduled(cron = "*/5 * * * * MON-FRI")
    public void showCron() {
        System.out.println("\n\n===正在执行定时cron:"+ DateTime.now().toString("yyyy-MM-dd HH:mm:ss")+"--threadId:"+Thread.currentThread().getId()+"--threadName:"+Thread.currentThread().getName());
    }

    /**
     * 固定速率 fixedRate
     */
    @Scheduled(fixedRate = 10000)
    public void showFixedRate() {
        System.out.println("\n\n***正在执行定时fixedRate:"+ DateTime.now().toString("yyyy-MM-dd HH:mm:ss")+"--threadId:"+Thread.currentThread().getId()+"--threadName:"+Thread.currentThread().getName());
    }

    /**
     * 固定延迟 fixedDelay
     */
    @Scheduled(fixedDelay = 20000)
    public void showFixedDelay() {
        System.out.println("\n\n+++正在执行定时fixedDelay:"+ DateTime.now().toString("yyyy-MM-dd HH:mm:ss")+"--threadId:"+Thread.currentThread().getId()+"--threadName:"+Thread.currentThread().getName());
    }

    /**
     * 初始延迟 initialDelay
     * 固定延迟 fixedDelay
     */
    @Scheduled(initialDelay = 100000, fixedDelay = 5000)
    public void showFixedDelayInitialDelay() {
        System.out.println("\n\n正在执行定时fixedDelayinitialDelay:"+ DateTime.now().toString("yyyy-MM-dd HH:mm:ss")+Thread.currentThread().getId()+"--"+Thread.currentThread().getName());
    }
}
