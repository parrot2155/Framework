package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		//Engineer, Developer클래스 bean생성하여
		//main에서 확인.
		//해당 클래스의 필드는 초기화되어있어야 하며, 
		//toString을 통해 필드값 확인
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		Engineer engineer = factory.getBean("engineer",Engineer.class);
		Developer developer = factory.getBean("developer", Developer.class);
		
		System.out.println(engineer);
		System.out.println(developer);
		
		
		
		Emp emp1 = factory.getBean("emp1", Emp.class);
		System.out.println(emp1);
		
		Developer lee = factory.getBean("developer", Developer.class);
		System.out.println(lee);
		
		
		
		
		
		
		
	}

}
