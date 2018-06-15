package com.hzm.one.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoMethodService demoMethod = applicationContext.getBean(DemoMethodService.class);
        DemoAnnotationService demoAnnotation = applicationContext.getBean(DemoAnnotationService.class);
        demoMethod.add();
        demoAnnotation.add();
        applicationContext.close();
    }
}
