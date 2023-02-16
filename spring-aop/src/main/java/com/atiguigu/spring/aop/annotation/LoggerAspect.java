package com.atiguigu.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect //将当前组件视为切面
public class LoggerAspect {
    @Pointcut("execution(* com.atiguigu.spring.aop.annotation.CalculatorImpl.*(..))")
    public void pointCut(){}

    @Before("execution(* com.atiguigu.spring.aop.annotation.CalculatorImpl.*(..))")
   public void beforeAdvice(JoinPoint joinPoint){
        //获取连接点对应的方法名
        Signature signature = joinPoint.getSignature();
        //获取连接点对应的方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("aspect前置通知："+signature.getName()+"  参数:"+ Arrays.toString(args));
  }
  @After("pointCut()")
  public void afterAdvice(JoinPoint joinPoint){
      //获取连接点对应的方法名
      Signature signature = joinPoint.getSignature();
      System.out.println("aspect 方法" +signature.getName() + "后置通知"+" ，执行完毕");
  }
  @AfterReturning(value = "pointCut()",returning = "result")
  //@AfterReturning中的属性returning，用来将通知方法的某个形参，接收目标方法的返回值
  public void afterReturntest(JoinPoint joinPoint ,Object result){
      //获取连接点对应的方法名
      Signature signature = joinPoint.getSignature();
      System.out.println("ascpect 返回通知 方法："+ signature.getName()+" 结果："+result);
  }
  @AfterThrowing(value = "pointCut()",throwing = "ex")
  public void afterTrowingtest(JoinPoint joinPoint ,Throwable ex){
      //获取连接点对应的方法名
      Signature signature = joinPoint.getSignature();
      System.out.println("ascpect 异常通知 方法："+ signature.getName()+" 异常："+ex);
  }

    @Around("pointCut()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint){
        Object result =  null;
        try {
            System.out.println("环绕通知-->目标对象方法执行之前");
            //表示目标对象方法的执行
            result = joinPoint.proceed();
            System.out.println("环绕通知-->目标对象方法执行之后");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知-->目标对象方法异常通知");
        }finally {
            System.out.println("环绕通知-->目标对象方法后置通知");
        }
        return result;
    }

}
