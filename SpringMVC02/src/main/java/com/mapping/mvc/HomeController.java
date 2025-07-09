package com.mapping.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mapping.mvc.dto.AddressDto;
import com.mapping.mvc.dto.BoardDto;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/command.do", method=RequestMethod.GET)
	public String getCommand(Model model, String name, @RequestParam("addr")String address, String phone) {
		model.addAttribute("dto", new AddressDto(name, address, phone));
		
		return "getcommand";
	}
	
	@RequestMapping(value="/command.do", method=RequestMethod.POST)
	public String postCommand(Model model, @ModelAttribute AddressDto dto) {	//필드명이 파라미터이름이랑 같으면 스프링이 알아서 담아준다.
		System.out.println("postCommand");
		System.out.println(dto.getName());
		System.out.println(dto.getAddr());
		System.out.println(dto.getPhone());
		
		model.addAttribute("dto",dto);
		
		return "postcommand";
	}
	
	//[2] board.do 요청을 받아 처리하는 메소드 작성
	//입력받은 값은 BoardDto 객체로 받는다.
	//boardres.jsp페이지로 응답하고 입력받은 데이터를 출력해 확인한다.
	@RequestMapping("/board.do")
	public String board(Model model, @ModelAttribute BoardDto dto) {
		model.addAttribute("dto",dto);
		return "baordres";
	}
	
}














