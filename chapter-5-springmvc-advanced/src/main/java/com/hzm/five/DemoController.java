package com.hzm.five;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Package: com.hzm.five
 * Description： TODO
 * Author: houzm@pssyun.com
 * Date: Created in 2018/4/2 19:03
 * Company: 景眭
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    /**
     * 测试上传
     * @param file
     * @return
     */
    @PostMapping(value = "/test/upload")
    public String upload(MultipartFile file){
        try {
            FileUtils.writeByteArrayToFile(new File(file.getOriginalFilename()), file.getBytes());
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 测试自定义媒体类型测试
     * @param user
     * @return
     */
    @PostMapping(value = "/test/messageconverter", produces = {"application/x-wisely"})
    public User demoSy(@RequestBody User user){
        return user;
    }

    /**
     * 服务端推送技术
     * 实现1 SSE(Server Send Email服务端发送事件)
     * 要求：必须新式浏览器，好多就是浏览器不支持
     */
    @PostMapping(value = "pushSSE", produces = {"text/event-stream"})
    public String pushSSE(){
        Random rd = new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return rd.nextInt()+"";
    }
    /**
     * 服务端推送技术
     * 实现2 Servelt3.0+的异步方法
     * 无要求
     */
    @GetMapping(value = "pushAsync")
    public DeferredResult<String> pushAsync(){
        return demoService.getDeferredResult();
    }
}
