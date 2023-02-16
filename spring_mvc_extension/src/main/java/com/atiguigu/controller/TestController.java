package com.atiguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test/hello")
    private String testhello(){
        System.out.println(1/0);
        return "success";
    }
}
