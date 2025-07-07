package com.test04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(name="emp1")
	public Emp emp1() {
		return new Emp("최태욱",30);
	}
	@Bean(name="emp2")
	public Emp emp2() {
		return new Emp("이태욱",30);
	}
}
