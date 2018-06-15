package com.hzm.four;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

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

    @GetMapping(value = "/hzm/{id}", produces = "application/json;charset=UTF-8")
    @ResponseBody
    @ApiOperation(value = "showId")
    public User showId(@PathVariable Integer id, HttpServletRequest request){
        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject("http://localhost:8080/hzm/{id}", User.class, 12);
        return user;
    }

    @GetMapping(value = {"hzm/get/param", "hzm/get/paramlast"})
    public @ResponseBody ResponseEntity<User> showParam(@RequestParam String name, HttpServletRequest request) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("name", "ninhao");
        ResponseEntity<User> forEntity = restTemplate.getForEntity("http://localhost:8080/hzm/get/param?name="+name, User.class);
        logger.info(objectMapper.writeValueAsString(forEntity.getBody()));
        return forEntity;
    }

    @PostMapping(value = "/hzm/post/{type}")
    public @ResponseBody ResponseEntity<User> showPost(@RequestBody User user, @PathVariable String type, HttpServletRequest request) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User> userResponseEntity = restTemplate.postForEntity("http://localhost:8080/hzm/post", user, User.class, type);
        return userResponseEntity;
    }

    @PostMapping(value = "/hzm/post/utf8/{type}", produces = "application/json;charset=UTF-8")
    public @ResponseBody ResponseEntity<User> showPostUTF8(@RequestBody User user, @PathVariable String type, HttpServletRequest request) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> map = new HashMap<String, String>();
        map.put("type", type);
        ResponseEntity<User> userResponseEntity = restTemplate.postForEntity("http://localhost:8080/hzm/post/utf8", user, User.class, map);
        return userResponseEntity;
    }




}
