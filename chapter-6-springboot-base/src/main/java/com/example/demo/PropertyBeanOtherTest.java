package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Package: com.example.demo
 * Description： TODO
 * Author: houzm@pssyun.com
 * Date: Created in 2018/4/4 21:24
 * Company: 景眭
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 */

/**
 * spring boot 1.5 @ConfigurationProperties去掉了location属性
 * 如果想加载其他自定义properties文件中的属性，可以使用@PropertySource来指定位置
 * spring开发者并不认为将properties文件和bean绑定在一起是一件好事
 * https://github.com/spring-projects/spring-boot/issues/6726
 */
@Component
@ConfigurationProperties(prefix = "logo")
@PropertySource(value = "classpath:demo/logo.properties")
public class PropertyBeanOtherTest {
    private String name;
    private String auther;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }
}
