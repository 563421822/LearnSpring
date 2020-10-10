package aopAdvice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopAdvice {
    public void before() {
        System.out.println("这是前置增强");
    }

    public void afterReturning() {
        System.out.println("这是后置增强");
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕的前置增强");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕的后置增强");
        return proceed;
    }


    public void afterThrowing() {
        System.out.println("这是异常抛出呀");
    }

    public void after() {
        System.out.println("这是最终增强");
    }

}
