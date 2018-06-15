package com.hzm.one.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {

    @Autowired
    private FunctionService functionService;

    public String sayHello(String world){
        return functionService.sayHello(world);
    }

}
