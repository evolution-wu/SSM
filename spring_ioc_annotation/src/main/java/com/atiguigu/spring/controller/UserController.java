package com.atiguigu.spring.controller;

import com.atiguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    public UserService userService;

    public void saveUser(){
        userService.saveUser();
    }
}
