package com.test03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class MTest {

	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("com/test03/beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);		//호출되는 시점이 다르다.
		
		//lazy loading이라고도 함.
		
		
		//ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		
		MessageBean bean = (MessageBean) factory.getBean("korean");
		bean.sayHello("스프링");
		
		
		bean = (MessageBean) factory.getBean("english");
		bean.sayHello("Spring");
		
	}

}
