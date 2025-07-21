package com.boot.jpa.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.jpa.model.dao.JpaDao;
import com.boot.jpa.model.entity.JpaEntity;

@Controller
@RequestMapping("/board")
public class JpaController {
	
	@Autowired
	private JpaDao dao;
	
	@GetMapping("/list")
	public String selectAll(Model model) {
		System.out.println("list");
		
		List<JpaEntity> list = dao.findAll();
		
		//System.out.println(list.get(1).getMytitle());
		
		model.addAttribute("list",list);
		
		
 		return "jpalist";
	}
	
	@GetMapping("/detail")
	public String selectOne(int myno, Model model) {
		System.out.println("[detail]");
		
		JpaEntity dto = dao.findByMyno(myno); 
		
		//findBy필드이름 : 필드 이름을 기반으로 조회. 기본제공 아님
		
		model.addAttribute("dto",dto);
		
		return "jpadetail";
	}
	
	@GetMapping("/insertform")
	public String insertform() {
		System.out.println("[insertform]");
		return "jpainsert";
	}
	
	@PostMapping("/insert")
	public String insert(JpaEntity dto) {
		System.out.println("[insert]");
		dto.setMydate(new Date());
		
		JpaEntity res = dao.save(dto);
		
		System.out.println(res.getMyno());
		System.out.println(res.getMyname());
		
		return "redirect:list";
	}
	
	@GetMapping("/updateform")
	public String updateForm(int myno, Model model) {
		System.out.println("[updateform]");
		
		model.addAttribute("dto",dao.findByMyno(myno));
		return "jpaupdate";
	}
	
}
