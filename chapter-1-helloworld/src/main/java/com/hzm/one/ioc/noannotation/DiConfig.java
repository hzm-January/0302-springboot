package com.hzm.one.ioc.noannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiConfig {

    @Bean
    public  FunctionService getFunctionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService getUseFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(this.getFunctionService());
        return useFunctionService;
    }

}
