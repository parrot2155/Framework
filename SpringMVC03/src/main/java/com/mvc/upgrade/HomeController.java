package com.mvc.upgrade;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.upgrade.model.dto.BoardDto;
import com.mvc.upgrade.model.service.BoardService;


@Controller

public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private BoardService service;
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		logger.info("SELECT LIST");
		
		List<BoardDto> res = service.selectList();
		
		model.addAttribute("list",res);
		
		return "mvclist";
	}

	@RequestMapping("/detail.do")
	public String detail(int myno, Model model) {
		logger.info("SELECT ONE");
		BoardDto res = service.selectOne(myno);
		
		model.addAttribute("dto",res);
		
		return "mvcdetail";
	}
	
	@RequestMapping("/insertform.do")
	public String insertForm() {
		logger.info("INSERT FORM");
		return "mvcinsert";
	}
	
	@RequestMapping("/insert.do")
	public String insert(BoardDto dto, Model model) {
		logger.info("INSERT");
		
		int res = service.insert(dto);
		
		return "list.do";
	}
	
}





















