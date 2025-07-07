package com.test04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engineer {
	
	@Autowired
	@Qualifier("park")
	private Emp emp;
	@Value("기술팀")
	private String dept;
	
	@Override
	public String toString() {
		return emp + "\t 부서 : " + dept;
	}
	
	
	
}
