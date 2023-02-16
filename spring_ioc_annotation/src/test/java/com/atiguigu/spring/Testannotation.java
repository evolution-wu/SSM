package com.atiguigu.spring;

import com.atiguigu.spring.controller.UserController;
import com.atiguigu.spring.dao.UserDao;
import com.atiguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testannotation {
    @Test
    public void test(){
        //默认情况
        //类名首字母小写就是bean的id。例如：UserController类对应的bean的id就是userController。
        //自定义bean的id
        //        可通过标识组件的注解的value属性设置自定义的bean的id
        //@Service("userService")//默认为userServiceImpl public class UserServiceImpl implements UserService {}
        ApplicationContext IOC = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = IOC.getBean(UserController.class);
        userController.saveUser();
    }
}
