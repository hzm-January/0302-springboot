package com.hzm.one.profile;

import org.springframework.stereotype.Component;

public class DemoBean {

    private String context;

    public DemoBean(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
