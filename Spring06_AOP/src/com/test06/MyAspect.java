package com.test06;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Pointcut("execution(public * *(..))")
	public void myClass() {
	}
	
	@Before("myClass()")
	public void before() {
		System.out.println("컴퓨터를 켠다.");
	}
	
	@After("myClass()")
	public void after() {
		System.out.println("집에 갈거다.");
	}
	
	@AfterReturning(pointcut="myClass()", returning="returnVal")
	public void afterReturn(Object returnVal) {
		System.out.println(returnVal+"배고프다.");
	}
}
