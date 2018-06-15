package com.hzm.one.profile;

import com.hzm.one.scope.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//        applicationContext.getEnvironment().addActiveProfile("pro");
        applicationContext.getEnvironment().addActiveProfile("dev");
        applicationContext.register(BeanConfig.class);
        applicationContext.refresh();
        DemoBean demoBean = applicationContext.getBean(DemoBean.class);
        System.out.println(demoBean.getContext());
        applicationContext.close();
    }
}
