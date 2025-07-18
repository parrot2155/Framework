package com.boot.jdbc.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	@Override			//인터셉터 추가하기
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new CheckInterceptor())
		.addPathPatterns("/myboard/**")			//별 두개는 하위까지 다 의미한다.
		.excludePathPatterns("/myboard/test");	//제외할 명령어
	}
	
	
}
