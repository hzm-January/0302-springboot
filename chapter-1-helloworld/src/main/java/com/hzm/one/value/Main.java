package com.hzm.one.value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.awt.SunHints;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ValueConfig.class);
        ValueConfig valueConfig = (ValueConfig) applicationContext.getBean("valueConfig");
        valueConfig.outputResource();
        applicationContext.close();
    }
}
