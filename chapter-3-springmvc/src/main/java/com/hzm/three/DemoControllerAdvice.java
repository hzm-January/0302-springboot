package com.hzm.three;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Package: com.hzm.three
 * Description： TODO
 * Author: houzm@pssyun.com
 * Date: Created in 2018/4/2 15:41
 * Company: 景眭
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 */
@ControllerAdvice
public class DemoControllerAdvice {

    /**
     * 统一异常处理
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String deelException(Exception exc, HttpServletRequest request, HttpServletResponse response){
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        response.setContentType("application/json");
        response.setContentType("UTF-8");
        response.setHeader("Cache-Control", "no-cache, must-revalidate");
        System.out.println(exc.getMessage());
        return exc.getMessage();
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields("id2");
    }

    @ModelAttribute
    public void addAttribute(Model model){
        model.addAttribute("msg", "额外信息");
    }

}
