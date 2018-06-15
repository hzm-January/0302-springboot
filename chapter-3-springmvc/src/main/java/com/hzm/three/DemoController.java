package com.hzm.three;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @GetMapping("/hzm")
    @ResponseBody
    public String hello(){
        return "hzm hello world...";
    }

    @GetMapping(value = "gogogo")
    public @ResponseBody String gogogo(@ModelAttribute(value = "msg") String msg, User user){
        throw new IllegalArgumentException("非常抱歉，参数有误/"+"来自@ModelAtrribute："+msg);
    }
}

