package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		
		Person s = factory.getBean("student",Person.class);
		Person t = factory.getBean("teacher",Person.class);
		
		System.out.println("[학생]");
		s.classWork();
		System.out.println("----------------");
		System.out.println("[강사]");
		t.classWork();
		
		System.out.println("----------------");
		//AOP 적용 X
//		Test test = new Test();
//		test.classWork();
		
		Person test = factory.getBean("test",Person.class);
		test.classWork();
		((Test)test).test();//스프링에서 aop가 작동되고 있는 상황에선 이렇게 형변환이 안먹힌다. 프록시는 가상의 객체이기 때문이다.
		
	}

}
