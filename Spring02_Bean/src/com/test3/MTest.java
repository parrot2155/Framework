package com.test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test02.Address;

public class MTest {

	public static void main(String[] args) {
		//홍ㄹ길동, 90, 70, 50
		//김길동, 80, 50, 20
		//박길동
		//4개 빈을 생성하여 main에서 확인(필요한 경우 코드 추가)
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test3/applicationContext.xml");
		
		Score score1 = (Score)factory.getBean("score1");
		System.out.println(score1.toString());
		
		Score score2 = (Score)factory.getBean("score2");
		System.out.println(score2.toString());
		
		Score score3 = (Score)factory.getBean("score3");
		System.out.println(score3.toString());
		
		Score score4 = (Score)factory.getBean("score4");
		System.out.println(score4.toString());
		
	}

}
