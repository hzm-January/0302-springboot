package com.hzm.two.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScheduleConfig.class);
        ScheduleDemo scheduleDemo = applicationContext.getBean(ScheduleDemo.class);
    }
}
