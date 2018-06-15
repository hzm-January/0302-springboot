package com.hzm.one.ioc.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = (UseFunctionService) applicationContext.getBean("useFunctionService");
        String world = useFunctionService.sayHello("world");
        System.out.println(world);
    }
}
