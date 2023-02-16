package com.atiguigu.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
//将当前类表示为异常处理的组件
public class ExceptionController {
    @ExceptionHandler(ArithmeticException.class)
    public String handleException(Throwable ex, Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
