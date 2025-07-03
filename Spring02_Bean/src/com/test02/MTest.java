package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test01.MessageBean;

public class MTest {

	public static void main(String[] args) {
		//박태욱, 서울시 강남구, 010-1111-1111
		//김태욱, 경기도 수원시, 010-2222-2222
		//위와 같은 값으로 초기화된 빈을 생성하여 main에서 확인
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Address add1 = (Address)factory.getBean("add1");
		System.out.println(add1.toString());
		
		Address add2 = (Address)factory.getBean("add2");
		System.out.println(add2.toString());
		
		
	}

}
