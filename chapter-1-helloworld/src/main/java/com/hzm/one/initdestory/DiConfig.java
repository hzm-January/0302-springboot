package com.hzm.one.initdestory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.hzm.one.initdestory")
public class DiConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")
    public BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    public Jrs250Service jrs250Service(){
        return new Jrs250Service();
    }

}
