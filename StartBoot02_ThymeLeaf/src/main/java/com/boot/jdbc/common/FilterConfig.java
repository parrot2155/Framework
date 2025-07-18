package com.boot.jdbc.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration		//설정 클래스라는것을 선언
public class FilterConfig {
	
	
	@Bean 	//이 객체가 빈으로 등록
	public FilterRegistrationBean<Filter> checkFilter(){
		
		FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<Filter>();
		
		//필터 클래스를 만들어도 되고 여기서 익명으로 구현할 수도 있다.
		registrationBean.setFilter(new Filter() {

			@Override
			public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
					throws IOException, ServletException {
				System.out.println("🦟 필터 실행");
				chain.doFilter(request, response);
				
			}});
		
		registrationBean.addUrlPatterns("/myboard/*");//필터를 적용할 경로
		
		return registrationBean;		//boot는 어노테이션 기반
	}
	
	
	
	
}
