package com.boot.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.jpa.model.dao.MemberDao;
import com.boot.jpa.model.entity.JpaEntity;
import com.boot.jpa.model.entity.MemberEntity;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberDao dao;
	
	@GetMapping("/list")
	public String findAll(Model model) {
		System.out.println("list");
		
		List<MemberEntity> list = dao.findAll(Sort.by(Sort.Direction.DESC, "memberno"));
		
		//System.out.println(list.get(1).getMytitle());
		
		model.addAttribute("list",list);
		
		
 		return "memberlist";
	}
	
	//테스트 추가. 전체조회 쿼리문으로 해보기
	@GetMapping("/test")
	public String selectAll() {
		System.out.println("list");
		
		List<MemberEntity> res = dao.selectAll();
		
		MemberEntity dto = res.get(1);
		System.out.println(dto.getMemberid());
		System.out.println(dto.getMemberpw());
		System.out.println(dto.getMembername());
		System.out.println(dto.getMemberno());
		
		
		
		
 		return "memberlist";
	}
	
	
	@GetMapping("/detail")
	public String detail(int memberno, Model model) {
		System.out.println("[detail]");
		MemberEntity dto = dao.findByMemberno(memberno);
		model.addAttribute("dto", dto);
		return "memberdetail";
	}
	
	@GetMapping("/insertform")
	public String insertform() {
		System.out.println("[memberinsert]");
		return "memberinsert";
	}
	
	@PostMapping("/insert")
	public String insert(MemberEntity dto) {
		System.out.println("[insert]");
		dao.save(dto);
		return "redirect:list";
	}
	
	@GetMapping("/updateform")
	public String updateform(int memberno, Model model) {
		System.out.println("[updateform]");
		model.addAttribute("dto", dao.findByMemberno(memberno));
		return "memberupdate";
	}
	
	@PostMapping("/update")
	public String update(MemberEntity dto) {
		dao.save(dto);
		return "redirect:/member/detail?memberno="+dto.getMemberno();
	}
	//udpate 까지 완성. delete 하면 됨.
}
