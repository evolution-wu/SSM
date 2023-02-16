package com.atiguigu.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class ValidateAspect {
   // @Before("execution(* com.atiguigu.spring.aop.annotation.CalculatorImpl.*(..))")

    @Before("com.atiguigu.spring.aop.annotation.LoggerAspect.pointCut()")
    public void beforemethod(){
        System.out.println("validateAscpect前置通知");
    }
}
