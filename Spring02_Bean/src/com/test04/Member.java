package com.test04;

public class Member {
	private String no;
	private String pw;
	private String name;
	private String phone;
	
	
	public Member() {}


	public Member(String no, String pw, String name, String phone) {
		super();
		this.no = no;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}


	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "[no=" + no + ", pw=" + pw + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
}
