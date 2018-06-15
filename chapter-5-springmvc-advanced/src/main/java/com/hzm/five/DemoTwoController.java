package com.hzm.five;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.hzm.five
 * Description： TODO
 * Author: houzm@pssyun.com
 * Date: Created in 2018/4/2 21:36
 * Company: 景眭
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 */
@RestController
public class DemoTwoController {

    @GetMapping(value = "test/get")
    public String getTest(){
//        return "test-get";
        return "test+get";
    }
}
