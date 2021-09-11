package com.telefonica.queryclient.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class AspectManagement {

    private static final Logger LOGGER = LogManager.getLogger();

    @Before(value = "execution(* com.telefonica.queryclient.web.*.*(..))")
    public void before(JoinPoint joinPoint) {
        LOGGER.info("after execution of {}", joinPoint);
    }

    @Around("execution(* com.telefonica.queryclient.web.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        long timeTaken = System.currentTimeMillis() - startTime;
        LOGGER.info("Time Taken by {} is {} ms", joinPoint, timeTaken);
        return proceed;
    }
    @After(value = "execution(* com.telefonica.queryclient.web.*.*(..))")
    public void after(JoinPoint joinPoint) {
        LOGGER.info("after execution of {}", joinPoint);
    }

    @AfterReturning(value = "execution(* com.telefonica.queryclient.web.*.*(..))",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        LOGGER.info("{} returned with value {}", joinPoint, result);
    }


}
