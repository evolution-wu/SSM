package com.atiguigu.spring.test;

import com.atiguigu.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {
    @Test
    public void test(){
        //获取IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-factory.xml");
        User user = (User) ac.getBean(User.class);
        System.out.println(user);
    }
}
