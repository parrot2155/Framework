package com.boot.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.jdbc.model.biz.MyBiz;
import com.boot.jdbc.model.dto.MyDto;

import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/myboard")
public class MyBoardController {
	
	@Autowired
	private MyBiz biz;
	
	
	//mybatis에 mapper랑 xml파일 안만들거다
	
	@GetMapping("/list")
	public String selectList(Model model) {
		System.out.println("[selectList]");
		List<MyDto> res = biz.selectList();
		model.addAttribute("list", res);
		return "myboardlist";
	} 
	 
	@GetMapping("/detail")
	public String selectOne(int myno, Model model) {
		System.out.println("[selectOne]"+myno);
		MyDto res = biz.selectOne(myno);
		model.addAttribute("dto",res);
		return "myboarddetail";
	}
	
	@GetMapping("/insertform")
	public String insertform() {
		System.out.println("[insertform]");
		return "myboardinsert";
	}
	@PostMapping("/insert")
	public String insert(MyDto dto) {
		System.out.println("[insert]");
		int res = biz.insert(dto);
		
		if(res>0) {
			System.out.println("insert 성공");
			return "redirect:/myboard/list";
		}else {
			System.out.println("insert 실패");
			return "redirect:/myboard/insertform"; 
		}
		
	}
	@GetMapping("/updateform")
	public String updateform(int myno, Model model) {
		System.out.println("[updateform]"); 
		MyDto dto = biz.selectOne(myno);
		model.addAttribute("dto",dto);
		return "myboardupdate";
	}
	
	@PostMapping("/update")
	public String update(MyDto dto) {
		System.out.println("[update]");
		int res = biz.update(dto);
		if(res>0) {
			System.out.println("update 성공");
			return "redirect:/myboard/list";
		}else {
			System.out.println("insert 실패");
			return "redirect:/myboard/updateform?myno="+dto.getMyno(); 
		}
	}
	
	@GetMapping("/delete")
	public String delete(int myno) {
		System.out.println("[delete]");
		int res = biz.delete(myno);
		if(res>0) {
			System.out.println("delete 성공");
			return "redirect:/myboard/list";
		}else {
			System.out.println("delete 실패");
			return "redirect:/myboard/detail?myno="+myno;
		}
	}
	
	
}
