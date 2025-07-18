package com.test01.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyNickName {
	
	@Autowired
	private NickName nickName;

	public MyNickName() {
		super();
	}

	public MyNickName(NickName nickName) {
		super();
		this.nickName = nickName;
	}

	public NickName getNickName() {
		return nickName;
	}

	public void setNickName(NickName nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "MyNickName: " + nickName;
	}
	
	
	
}
