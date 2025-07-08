package com.test04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(public * com.test04.*.*(..))")
	public void before(JoinPoint join) {
		System.out.println(join.getTarget().getClass().getSimpleName());
		System.out.println(join.getSignature().getName());
		System.out.println(join.getArgs());
		System.out.println("컴퓨터를 켠다.");
	}
	
	@After("execution(public * *(..))")
	public void after(JoinPoint join) {
		System.out.println("집에 간다.");
	}
	
	@AfterReturning(pointcut="execution(public * *(..))",returning="returnVal")	//pointcut 생략된거임 원래 있음. returning : 매개변수로 리턴값을 받아올거임.
	public void returning(Object returnVal) {	//returning값이랑 매개변수 값이랑 이름 일치시키기.
		System.out.println(returnVal + "공부 하는 날입니다.");
	}
	
	@AfterThrowing(pointcut="execution(public * *(..))")	//에러가 뜨더라도 처리한다.
	public void throwing() {
		System.out.println("쉬는 날이었다.");
	}
	
}
















