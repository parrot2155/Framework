package com.test02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
public class School {
	

	@Qualifier("park")
	@Autowired
	private Student person;
	
	@Value("2")
	
	private int grade;
	public School() {
		super();
	}
	public School(Student person, int grade) {
		super();
		this.person = person;
		this.grade = grade;
	}
	public Student getPerson() {
		return person;
	}
	public void setPerson(Student person) {
		this.person = person;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "School [person=" + person + ", grade=" + grade + "]";
	}
	
	
}
