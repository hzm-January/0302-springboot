package com.hzm.one.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan(value = "com.hzm.one.profile")
public class BeanConfig {

    @Bean
    @Profile("pro")
    public DemoBean proDemoBean(){
        return new DemoBean("product demo bean");
    }

    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("develop demo bean");
    }

}
