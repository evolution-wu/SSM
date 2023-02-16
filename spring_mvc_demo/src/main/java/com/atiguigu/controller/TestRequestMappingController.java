package com.atiguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {
    //@RequestMapping注解的value属性是一个字符串类型的数组，表示该请求映射能够匹配多个请求地址所对应的请求
    //@RequestMapping注解的method属性通过请求的请求方式（get或post）匹配请求映射
    //@RequestMapping注解的method属性是一个RequestMethod类型的数组，表示该请求映射能够匹配多种请求方式的请求
    //若当前请求的请求地址满足请求映射的value属性，但是请求方式不满足method属性，则浏览器报错
    //405：Request method 'POST' not supported
    @RequestMapping(
            value = {"/hello","/abc"},
            method = RequestMethod.GET)
    public String hello(){
        return "success";
    }
}
//@RequestMapping标识一个类：设置映射请求的请求路径的初始信息
//
//@RequestMapping标识一个方法：设置映射请求请求路径的具体信息