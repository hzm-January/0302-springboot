package com.hzm.one.ioc.annotation;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {

    public String sayHello(String world){
        return "Hello "+ world + "!";
    }

}
