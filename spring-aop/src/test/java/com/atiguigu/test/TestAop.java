package com.atiguigu.test;

import com.atiguigu.spring.aop.annotation.Calculator;
import com.atiguigu.spring.aop.annotation.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void testaop(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annatation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(1,2);
    }
}
