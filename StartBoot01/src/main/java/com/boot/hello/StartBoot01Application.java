package com.boot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	//컨트롤러로도 만들어주자.
@SpringBootApplication
//@Configuration + @EnableAutoConfiguration + @ComponentScan		//이 클래스는 설정클래스입니다를 설정해주는 + 자동 생성 +현재 패키지부터 하위 패키지들 모두 빈 생성
public class StartBoot01Application {

	public static void main(String[] args) {
		SpringApplication.run(StartBoot01Application.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		System.out.println("controller hello method");
		return "test";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
