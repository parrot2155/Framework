package com.boot.jdbc.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class CheckInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse reesponse, Object handler) {
		System.out.println("╰(*°▽°*)╯인터셉터를 출력하고 확인, 요청 URI"+request.getRequestURI());
		return true;
	}

}
