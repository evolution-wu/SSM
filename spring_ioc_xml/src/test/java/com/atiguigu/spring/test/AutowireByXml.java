package com.atiguigu.spring.test;

import com.atiguigu.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByXml {
    @Test
    public void test(){
        ApplicationContext IOC = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = IOC.getBean(UserController.class);
        System.out.println(userController);
        userController.saveUser();
    }
}
