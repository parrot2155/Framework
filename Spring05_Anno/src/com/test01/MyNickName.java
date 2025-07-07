package com.test01;

public class MyNickName {
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
