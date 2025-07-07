package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		//spring bean config file을 통해
		//MyNickName클래스의 bean을 생성하여
		//main에서확인
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		MyNickName nick = factory.getBean("myNickName", MyNickName.class);
		System.out.println(nick);
		

	}

}
