package com.hzm.one.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoPrototypeService demoPrototypeService = applicationContext.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2 = applicationContext.getBean(DemoPrototypeService.class);
        DemoSingletonService demoSingletonService = applicationContext.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService2 = applicationContext.getBean(DemoSingletonService.class);
        System.out.println("prototype："+(demoPrototypeService == demoPrototypeService2)); //false
        System.out.println("singleton："+(demoSingletonService == demoSingletonService2)); //true
    }
}
