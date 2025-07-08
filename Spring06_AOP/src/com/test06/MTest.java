package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		//
		//before, after, afterreturning 어드바이스를 적절히 작성하고
		//타겟(classWork()) 이 호출될때 실행이 잘 될 수 있ㄱ데 설정하자.
		//이때 bean생성은 모두 어노테이션으로 처리한다.(주의, xml파일에 네임스페이스 잘 추가합시다.)
		//마지막으로 메인메소드에서 타겟실행하여 aop잘 적용되는 모습을 확인한다.

		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test06/applicationContext.xml");
		
		Person s = factory.getBean("student", Person.class);
		Person t = factory.getBean("teacher", Person.class);
		System.out.println("학생");
		s.classWork();
		System.out.println("------------");
		System.out.println("강사");
		t.classWork();
	}

}
