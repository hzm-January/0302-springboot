package com.hzm.five;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import javax.sound.midi.Soundbank;

/**
 * Package: com.hzm.five
 * Description： TODO
 * Author: houzm@pssyun.com
 * Date: Created in 2018/4/2 21:11
 * Company: 景眭
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 */
@Service
public class DemoService {

    private DeferredResult<String> deferredResult;

    @Async
    public DeferredResult<String> getDeferredResult() {
        System.out.println("=============start==============");
        deferredResult = new DeferredResult<String>();
        return deferredResult;
    }

    @Scheduled(fixedDelay = 5000)
    public void async(){
        System.out.println("-------------------");
        System.out.println(deferredResult);
        if (deferredResult!=null){
            deferredResult.setResult(System.currentTimeMillis()+"");
            System.out.println(deferredResult.getResult());
        }
    }
}
