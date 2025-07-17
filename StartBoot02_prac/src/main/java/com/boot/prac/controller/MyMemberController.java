package com.boot.prac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.prac.model.biz.MyMemberBiz;
import com.boot.prac.model.dto.MyMemberDto;

import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/mymember")
public class MyMemberController {
	
	@Autowired
	private MyMemberBiz biz;
	
	@GetMapping("/list")
	public String selectAll(Model model){ 
		System.out.println("list");
		List<MyMemberDto> res = biz.selectAll();
		model.addAttribute("list",res);
		return "memberlist";
	}
	@GetMapping("/detail")
	public String detail(int memberno, Model model) {
		MyMemberDto res = biz.selectOne(memberno);
		model.addAttribute("dto", res);
		return "memberdetail";
	}  
	@GetMapping("/insertform")
	public String insertForm() {
		return "memberinsertform";
	}
	
	@PostMapping("/insert")
	public String insert(MyMemberDto dto) {
		int res = biz.insert(dto);
		if(res>0) {
			return "redirect:/mymember/list";
		}else {
			return "redirect:/mymember/insertform";
		}
	}
	
	
}
