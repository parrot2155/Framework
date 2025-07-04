package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test01.AbstractTest;

public class MTest {

	public static void main(String[] args) {
		//Emp클래스를 이용하여 bean2개 생성
		
		//하나는 생성자를 통해, 하나는 sette를 통해
		//초기화하여 빈이 생성되고,
		//생성된 빈을 main에서 getBean으로 확인
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		Emp emp1 = factory.getBean("emp1", Emp.class);	//형변환하는 새로운 방법
		Emp emp2 = factory.getBean("emp2",Emp.class);
		
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
