package com.mydemo.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Package: PACKAGE_NAME
 * Description： TODO
 * Author: houzm@pssyun.com
 * Date: Created in 2018/4/7 15:18
 * Company: 景眭
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 */
@Configuration
@EnableConfigurationProperties(value = HelloPropertyBean.class)
@ConditionalOnClass(HelloService.class)
@ConditionalOnProperty(prefix = "hello", matchIfMissing = true, value = "enable")
public class HelloAutoConfig {

    @Autowired
    private HelloPropertyBean helloPropertyBean;

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService getHelloService(){

        HelloService helloService = new HelloService();
        helloService.setMsg(helloPropertyBean.getMsg());
        return helloService;
    }
}
