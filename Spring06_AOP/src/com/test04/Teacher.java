package com.test04;

public class Teacher implements Person{

	@Override
	public String classWork() {
		String s = null;
		s.length();			//예외처리 테스트를 위해 에러코드 강제로 넣어보겠습니다.
						
		
		System.out.println("줌 회의를 시작한다.");
		return "Spring";
	}

}
