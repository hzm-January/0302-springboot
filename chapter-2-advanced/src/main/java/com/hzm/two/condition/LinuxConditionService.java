package com.hzm.two.condition;

import org.springframework.stereotype.Component;

public class LinuxConditionService implements ConditionService{

    @Override
    public String show() {
        return "ls";
    }
}
