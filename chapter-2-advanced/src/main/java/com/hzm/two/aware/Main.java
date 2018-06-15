package com.hzm.two.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareConfig.class);
        ResourceAwareDemo awareDemo = applicationContext.getBean(ResourceAwareDemo.class);
        awareDemo.show();
    }
}
