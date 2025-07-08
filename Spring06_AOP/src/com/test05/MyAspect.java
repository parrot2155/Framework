package com.test05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
	@Pointcut("execution(public * *(..))")
	public void myClass() {
	}
	
//	@Pointcut("execution(public String *(..))")
//	public void yourClass() {					//포인트 컷을 어러개 해서 각기 다른 포인트컷을 적용시킬 수도 있다.
//	}
	
	@Before("myClass()")
	public void before(JoinPoint join) {
		System.out.println("컴퓨터를 켠다.");
	}
	
	@After("myClass()")
	public void after(JoinPoint join) {
		System.out.println("집에 간다.");
	}
	
}














