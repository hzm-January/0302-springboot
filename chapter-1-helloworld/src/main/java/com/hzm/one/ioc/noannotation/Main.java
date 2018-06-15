package com.hzm.one.ioc.noannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = applicationContext.getBean(UseFunctionService.class);
        String world = useFunctionService.sayHello("world");
        System.out.println(world);
    }
}
