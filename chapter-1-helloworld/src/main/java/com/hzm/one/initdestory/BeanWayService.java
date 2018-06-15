package com.hzm.one.initdestory;

import org.springframework.stereotype.Service;

public class BeanWayService {

    public void init(){
        System.out.println("bean way service init");
    }

    public BeanWayService() {
        super();
        System.out.println("bean way service constructor");
    }

    public void sayHi(){
        System.out.println("bean way service sayHi");
    }

    public void destory(){
        System.out.println("bean way service destory");
    }

}
