package com.techgeeknext.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAfterAspectExample {
    private static final Logger LOGGER = LogManager.getLogger(BeforeAfterAspectExample.class);

    @Before("execution(* com.techgeeknext..*(..)))")
    public void logBeforeAllMethodCall(JoinPoint joinPoint) throws Throwable {

        LOGGER.info("======TECHGEEKNEXT - Spring Boot AOP Before Advice Example ");
        LOGGER.info("=====Started with method "
                + joinPoint.getSignature().getName()); // Method Name
    }

    @After("execution(* com.techgeeknext..*(..)))")
    public void logAfterAllMethodCall(JoinPoint joinPoint) throws Throwable {

        LOGGER.info("=====TECHGEEKNEXT - Spring Boot AOP After Advice Example ");
        LOGGER.info("======Completed execution of method "
                + joinPoint.getSignature().getName()); // Method Name
    }
}
