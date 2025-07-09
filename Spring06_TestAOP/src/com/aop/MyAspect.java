package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("public ")
	public void before() {
		System.out.println("도형의 넓이를 구한다.");
	}

	public void after() {
		System.out.println("도형의 넓이를 출력한다.");
	}
}
