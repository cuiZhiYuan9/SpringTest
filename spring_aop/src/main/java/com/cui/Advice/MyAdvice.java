package com.cui.Advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyAdvice {
    public void beforeAdvice(){
        System.out.println("增强前");
    }
    public void afterAdvice(){
        System.out.println("增强后");
    }
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        joinPoint.proceed();
        System.out.println("环绕后");
    }
    public void AfterT(Throwable th){
        System.out.println("异常对象是"+th+"异常信息是"+th.getMessage());
    }
    public void After(){
        System.out.println("则是最后的通知");
    }

}
