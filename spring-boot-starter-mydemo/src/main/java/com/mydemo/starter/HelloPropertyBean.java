package com.mydemo.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Package: PACKAGE_NAME
 * Description： TODO
 * Author: houzm@pssyun.com
 * Date: Created in 2018/4/7 15:14
 * Company: 景眭
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 */
@ConfigurationProperties(prefix = "hello")
public class HelloPropertyBean {

    private static final String MSG = "world";
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
