package com.atiguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class TestScopeController {
    @RequestMapping("/test/mav")
    public ModelAndView getMAV(){
        /**
         * ModelAndView有Model和View的功能
         * Model主要用于向请求域共享数据
         * View主要用于设置视图，实现页面跳转
         */
        ModelAndView modelAndView = new ModelAndView();
        //向请求域共享数据
        modelAndView.addObject("testRequestScope", "hello,ModelAndView");
        //设置视图，实现页面跳转
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/test/model")
    public String getmodel(Model model){
        model.addAttribute("testRequestScope","hello,Model");
        return "success";
    }
    @RequestMapping("/test/modelmap")
    public String getmodelMAP(ModelMap modelMap) {
        modelMap.addAttribute("testRequestScope", "hello,ModelMAP");
        return "success";
    }
    @RequestMapping("/test/map")
    public String getmap(Map<String,Object> map) {
        map.put("testRequestScope","hello,MAP");
        return "success";
    }
    @RequestMapping("/test/session")
    public String getsession(HttpSession httpSession){
        httpSession.setAttribute("testSessionScope","hello,Session");
        return "success";
    }

    @RequestMapping("/test/application")
    public String getapplication(HttpSession httpSession){
        ServletContext application = httpSession.getServletContext();
        application.setAttribute("testApplicationScope", "hello,application");
        return "success";
    }
}
