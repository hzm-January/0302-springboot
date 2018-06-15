package com.hzm.three;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Package: com.hzm.three
 * Description： Spring MVC 常用注解
 * Author: houzm@pssyun.com
 * Date: Created in 2018/3/28 19:55
 * Company: 景眭
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 */
@Api(value = "hzmtest")
@Controller
public class DemoDetailController {

    private Logger logger = LoggerFactory.getLogger(DemoDetailController.class);

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping(value = "/hzm/{id}")
    @ResponseBody
    @ApiOperation(value = "showId")
    public User getUser(@PathVariable Integer id, HttpServletRequest request){
        return new User("张学友", "man", 12);
    }

    @RequestMapping(value = {"hzm/get/param", "hzm/get/paramlast"})
    public @ResponseBody User showParam(@RequestParam String name, HttpServletRequest request){
        return new User("李建", "man", 12);
    }

    @PostMapping(value = "/hzm/post")
    public @ResponseBody User showPost(@RequestBody User user, HttpServletRequest request) throws JsonProcessingException {
        return new User("李建2", "man", 13);
    }


    @PostMapping(value = "/hzm/post/utf8", produces = "application/json;charset=UTF-8")
    public @ResponseBody User showPostUTF8(@RequestBody User user, HttpServletRequest request) throws JsonProcessingException {
        return new User("文强3", "man", 112);
    }




}
