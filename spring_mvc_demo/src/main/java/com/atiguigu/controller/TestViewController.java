package com.atiguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestViewController {
    @RequestMapping("/test/view/thymeleaf")
    public String testthmyview(){
        return "success";
    }
    @RequestMapping("/test/view/forward")
    public String testInternalResourceView(){
        return "forward:/test/model";
    }
    @RequestMapping("/test/view/redirect")
    public String getRedirectView(){
        return "redirect:/test/model";
    }
}
