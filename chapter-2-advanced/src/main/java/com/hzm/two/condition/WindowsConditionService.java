package com.hzm.two.condition;

import org.springframework.stereotype.Component;

public class WindowsConditionService implements ConditionService  {

    @Override
    public String show() {
        return "dir";
    }

}
