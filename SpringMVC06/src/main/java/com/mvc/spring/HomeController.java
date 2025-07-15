package com.mvc.spring;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.member.dto.MemberDto;
import com.mvc.member.service.MemberService;


@Controller
public class HomeController {
	
	@Autowired
	private MemberService service;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(MemberDto dto, HttpSession session, Model model) {
	    logger.info("Log in : " + dto.getMemid());

	    MemberDto loginMember = service.selectOne(dto.getMemid());
	    	
	    if (loginMember != null && loginMember.getMempw().equals(dto.getMempw())) {
	        session.setAttribute("loginMember", loginMember);
	        return "redirect:board/list";
	    } else {
	    	System.out.println("로그인 실패");
	        return "index";
	    }
	}
	
	@RequestMapping(value = "/signupform", method = RequestMethod.POST)
	public String signupForm() {
	    return "signupform";
	}
	
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String insert(MemberDto dto) {
		int res = service.insert(dto);
		
		if(res>0) {
			System.out.println("회원가입 성공");
			return "redirect:index.jsp";
		}else {
			System.out.println("회원가입 실패");
			return "index";
		}
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
	    session.invalidate();
	    return "redirect:/index.jsp";
	}
	
}
