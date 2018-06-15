package com.hzm.one.initdestory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DiConfig.class);
//        BeanWayService beanWayService = (BeanWayService) applicationContext.getBean(BeanWayService.class);
//        Jrs250Service jrs250Service = (Jrs250Service) applicationContext.getBean(Jrs250Service.class);

        BeanWayService beanWayService = (BeanWayService) applicationContext.getBean("beanWayService");
        Jrs250Service jrs250Service = (Jrs250Service) applicationContext.getBean("jrs250Service");
        applicationContext.close();

    }
}
