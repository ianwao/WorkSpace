package com.ianw.exce.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.lang.reflect.Array;
import java.util.List;

@Aspect
public class Myaop {

    @Pointcut("execution(* com.ianw.exce.service.*.*(..))")
    public void sAll(){}

    @Before("sAll()")
    public void beforeAdvice(){
        System.out.println("前置代码");
    }
     @After("sAll()")
    public void afterAdvice(){
        System.out.println("最终代码");
    }
    @AfterReturning("sAll()")
    public void afterReturnAdvice(){
        System.out.println("后置代码");
    }
    @AfterThrowing(value = "sAll()",throwing = "e")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception e){
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        //开始打log
        System.out.println("异常:" + e.getMessage());
        System.out.println("异常所在类：" + className);
        System.out.println("异常所在方法：" + methodName);
        System.out.println("异常中的参数：");
        System.out.println(methodName);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i].toString());
        }
    }
    @Around("sAll()")
    public void asAround(ProceedingJoinPoint pj){
        System.out.println("这是环绕前置增强");

        try {
            pj.proceed();
        } catch (Throwable e) {
            //抓捕异常
            e.printStackTrace();
        }
        System.out.println("这是环绕后置增强");
    }

}
