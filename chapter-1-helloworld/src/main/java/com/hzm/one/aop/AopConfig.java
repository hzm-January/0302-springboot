package com.hzm.one.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.hzm.one.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
