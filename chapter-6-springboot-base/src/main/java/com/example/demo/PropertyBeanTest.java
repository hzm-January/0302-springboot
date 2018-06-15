package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Package: com.example.demo
 * Description： TODO
 * Author: houzm@pssyun.com
 * Date: Created in 2018/4/4 21:11
 * Company: 景眭
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 */
@Component
@ConfigurationProperties(prefix = "book")
public class PropertyBeanTest {

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
