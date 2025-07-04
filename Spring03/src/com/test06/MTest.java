package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test06/applicationContext.xml");
		
		Developer leetw = factory.getBean("leetw", Developer.class);
		Engineer kimtw = factory.getBean("kimtw", Engineer.class);
		
		System.out.println(leetw);
		System.out.println(kimtw);
	}

}	
