package com.example.demospringaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserServiceAspect {
    @Before(value = "execution(* com.example.demospringaop.service.UserService.*(..)) && args(name, uid)")
    public void beforeAdvice(JoinPoint joinPoint, String name, Long uid) {
        System.out.println("Before: " + joinPoint.getSignature());
    }

    @After(value = "execution(* com.example.demospringaop.service.UserService.*(..)) && args(name, uid)")
    public void afterAdvice(JoinPoint joinPoint, String name, Long uid) {
        System.out.println("After: " + joinPoint.getSignature());
    }
}
