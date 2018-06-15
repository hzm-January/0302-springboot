package com.hzm.two.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ConditionService conditionService = applicationContext.getBean(ConditionService.class);
        String systemName = applicationContext.getEnvironment().getProperty("os.name");
        String list = conditionService.show();
        System.out.println(systemName+"  "+list);
    }
}
