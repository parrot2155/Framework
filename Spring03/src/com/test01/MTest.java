package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		AbstractTest today = (AbstractTest)factory.getBean("test");
		System.out.println("오늘은 "+today.dayInfo());
	}
}
