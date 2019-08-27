package model;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
@Aspect
public class dtaspect {
	
	
	@ExceptionHandler
	public void sss(Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	@Pointcut("execution(public * *Name(..))")
    public void anyMethod() {    }
	@Before(value = "anyMethod()")
    public void exe(JoinPoint p) throws Throwable{
		System.out.println("前置.......");
	}
	@After(value = "anyMethod()")
    public void exe1(JoinPoint p) throws Throwable{
		System.out.println("后置.......");
	}
	@AfterReturning(value = "anyMethod()",returning="o")
    public void exe2(JoinPoint p,Object o) throws Throwable{
		System.out.println("后置1.......");
	}	
	@Around(value = "anyMethod()")
    public void exe34(ProceedingJoinPoint p) throws Throwable{
		System.out.println("h前置.......");
		p.proceed();
		System.out.println("h后置.......");
	}	
	@AfterThrowing(value = "anyMethod()",throwing="o")
    public void exe2(JoinPoint p,Throwable o) throws Throwable{
		System.out.println("错误......."+o.getMessage());
	}
}