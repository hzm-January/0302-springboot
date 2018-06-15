package com.hzm.one.initdestory;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jrs250Service {

    @PostConstruct
    public void init(){
        System.out.println("jsr250 service init");
    }

    public Jrs250Service() {
        super();
        System.out.println("jsr250 service constructor");
    }

    public void sayHi(){
        System.out.println("jsr250 service sayHi");
    }

    @PreDestroy
    public void destory(){
        System.out.println("jsr250 service destory");
    }
}
