package com.atiguigu.spring.test;

import com.atiguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testsope {
    @Test
    public void test(){
        ApplicationContext IOC = new ClassPathXmlApplicationContext("spring-scope.xml");
        Student student1 = IOC.getBean(Student.class);
        Student student2 = IOC.getBean(Student.class);
        System.out.println(student1==student2);

    }
}
