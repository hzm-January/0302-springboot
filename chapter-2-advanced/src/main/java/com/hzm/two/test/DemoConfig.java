package com.hzm.two.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DemoConfig {

    @Bean
    @Profile("dev")
    public DemoContent devContent(){
        return new DemoContent("develop content");
    }

    @Bean
    @Profile("prod")
    public DemoContent proContent(){
        return new DemoContent("product content");
    }

}
