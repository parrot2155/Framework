package com.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hello.service.HelloService;

@Controller
public class HelloController {
	
	
	@Autowired
	private HelloService service;
	
	@RequestMapping(value="/hello.do")
	public String getHello(Model model) {
		String res = service.getHello();
		model.addAttribute("msg",res);
		return "/WEB-INF/views/hello.jsp";
	}
	
	/*@RequestMapping(value="/bye.do")
	public String getBye(@RequestParam("name")String myName) {
		System.out.println(myName);
		return "/WEB-INF/views/hello.jsp";
	}*/
	
	@RequestMapping(value="/bye.do")	
	public ModelAndView getBye(String name) {	//파라미터랑 매개변수 이름 다르면 못받아온다. 같아야 받아올 수 있음.
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/WEB-INF/views/bye.jsp");
		mav.addObject("msg","bye, "+name);
		
		return mav;
	}
	
	@RequestMapping("/res.do")
	public String getRes(String name,String addr,Model model) {
//		ModelAndView mav = new ModelAndView();
		
		model.addAttribute("resMsg",name+":"+addr);
		
//		mav.setViewName("/WEB-INF/views/res.jsp");
//		mav.addObject("name",name);
//		mav.addObject("addr",addr);
		return "/WEB-INF/views/res.jsp";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

















