package com.hzm.seven;

import com.mydemo.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.hzm.seven
 * Description： TODO
 * Author: houzm@pssyun.com
 * Date: Created in 2018/4/7 16:08
 * Company: 景眭
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 */
@RestController
public class MyTestController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/test/mystarter")
    public String getMessage(){
        return helloService.getMsg();
    }
}
