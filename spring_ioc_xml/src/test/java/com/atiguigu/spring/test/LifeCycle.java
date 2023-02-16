package com.atiguigu.spring.test;

import com.atiguigu.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycle {
    @Test
    public void test(){
        //
        //ConfigurableApplicationContext是ApplicationContext的子接口，其中扩展了刷新和关闭容器的方法
        ConfigurableApplicationContext IOC = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = IOC.getBean(User.class);
        System.out.println(user);
        IOC.close();
    }
}
