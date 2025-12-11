package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MyAdvices {
	@Before("execution(* com.demo.beans.M*.m*(..))")
	public void beforeAdvice() {
		
		System.out.println("Before Advice methode");
	}
	
	@After("execution (* com.demo.beans.M*.m*(..))")
	public void AfterAdvices() {
		System.out.println("After Advices methode");
	}
	
	@Around("execution (* com.demo.beans.M*.m*(..))")
	public Object aroundAdvice(ProceedingJoinPoint jPoint) throws Throwable{
		
		System.out.println("in around Advice before function call");
		Object ob=jPoint.proceed();
		System.out.println("in around Advice after function call");
		
		
		return ob;
	}

}
