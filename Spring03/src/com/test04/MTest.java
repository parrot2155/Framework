package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/beans.xml");
		
		Developer parktw = factory.getBean("parktw", Developer.class);
		
		Engineer kim = factory.getBean("kim", Engineer.class);
		
		
		System.out.println(parktw);
		System.out.println(kim);

	}

}
