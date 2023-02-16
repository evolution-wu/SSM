package com.atiguigu.spring.test;

import com.atiguigu.spring.pojo.Clazz;
import com.atiguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testsrping_ioc {
    @Test
    public void test(){
        ApplicationContext IOC = new ClassPathXmlApplicationContext("spring_ioc.xml");
        //获取bean的三种方式
        /*1、通过id
        Student studentOne = (Student) IOC.getBean("studentOne");
        System.out.println(studentOne);*/

         /*2、通过类型获取  当根据类型获取bean时，要求IOC容器中指定类型的bean有且只能有一个
         NoUniqueBeanDefinitionException  多个bean匹配时报错
         NoSuchBeanDefinitionException    无bean匹配时候报错
        Student studentOne = (Student) IOC.getBean(Student.class);
        System.out.println(studentOne);*/

        //3、通过ID和类型获取
        Student studentOne = IOC.getBean("studentOne", Student.class);
        System.out.println(studentOne);
    }

    @Test
    public void testzhuru(){
        ApplicationContext IOC = new ClassPathXmlApplicationContext("spring_ioc.xml");
        //3、通过ID和类型获取
        Student studentOne = IOC.getBean("studentSeven", Student.class);
        System.out.println(studentOne);
    }

    @Test
    public void testzhurulist(){
        ApplicationContext IOC = new ClassPathXmlApplicationContext("spring_ioc.xml");
        //3、通过ID和类型获取
        Clazz clazzOne = IOC.getBean("clazzOne", Clazz.class);
        System.out.println(clazzOne);
    }
}
