package com.hzm.two.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.hzm.two.condition")
public class ConditionConfig {


    @Bean
    @Conditional(value = WindowsCondition.class)
    public ConditionService windowCondition(){
        return new WindowsConditionService();
    }
    @Bean
    @Conditional(value = LinuxCondition.class)
    public ConditionService linuxCondition(){
        return new LinuxConditionService();
    }

}
