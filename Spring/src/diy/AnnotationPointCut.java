package diy;
//AOP方式三：利用注解实现AOP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //注解后，这个类就是切面了
public class AnnotationPointCut {
    @Before("execution(* service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=========方法执行前(方式三：注解)==========");
    }
    @After("execution(* service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=========方法执行后(方式三：注解)==========");
    }

    //在环绕增强中，可以给定一个参数，代表要获取处理切入的点

    @Around("execution(* service.UserServiceImpl.*(..))")

    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前：");
/*        Signature signature = joinPoint.getSignature();
        System.out.println("signature:"+signature);*/
        //执行方法
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后：");

    }
}
