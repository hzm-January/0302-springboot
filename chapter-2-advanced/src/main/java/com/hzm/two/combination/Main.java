package com.hzm.two.combination;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Combination.class);
        DemoRun demoRun = applicationContext.getBean(DemoRun.class);
        demoRun.show();
    }
}
