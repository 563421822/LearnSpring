package annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import org.springframework.stereotype.Component;

@Aspect
@Component(value = "a1")
public class AnnotationAdvice {
    /**
     * 注解版的前置增强
     */
    @Before(value = "execution(* annotation.StudentImpl.*(..))")
    public void before() {
        System.out.println("这是前置增强");
    }

    @AfterReturning(value = "execution(* annotation.StudentImpl.*(..))")
    public void afterReturning() {
        System.out.println("这是后置增强");
    }

    @Around("execution(* annotation.StudentImpl.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕的前置增强");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕的后置增强");
        return proceed;
    }

    @AfterThrowing(value = "execution(* annotation.StudentImpl.*(..))")
    public void afterThrowing() {
        System.out.println("这是异常抛出呀");
    }

    @After(value = "execution(* annotation.StudentImpl.*(..))")
    public void after() {
        System.out.println("这是最终增强");
    }

}
