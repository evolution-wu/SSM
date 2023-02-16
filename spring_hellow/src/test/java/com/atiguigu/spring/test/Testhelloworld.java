package com.atiguigu.spring.test;

import com.atiguigu.spring.pojo.HelloWorld;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testhelloworld {
    @Test
    public void test(){
        //获取IOC容器
        ApplicationContext IOC = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IOC容器中的bean对象
        HelloWorld helloworld = (HelloWorld) IOC.getBean("Helloworld");
        helloworld.sayHello();
    }
}
