package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		
		Address lee = (Address)factory.getBean("lee");
		Address kim = (Address)factory.getBean("kim");
		
		Member user01 = (Member)factory.getBean("user01");
		Member user02 = (Member)factory.getBean("user02");
		Member user03 = (Member)factory.getBean("user03");
				
		System.out.println(lee);
		System.out.println(kim);
		
		System.out.println(user01);
		System.out.println(user02);
		System.out.println(user03);
		
		
		
	}

}
