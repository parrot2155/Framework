package com.boot.jpa.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
		
		List<JpaEntity> list = dao.findAll(Sort.by(Sort.Direction.DESC, "myno"));
		
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
	
	@PostMapping("/update")
	public String update(JpaEntity dto) {
		System.out.println("[update]");
		System.out.println(dto.getMyno());
		System.out.println(dto.getMytitle());	//따로 dao에서 받아주는 메소드가 필요 없다.
		dao.save(dto);
		//jpa에서 save()는  => insert or update 작업을 진행한다.
		
		//1. id가 null이면 insert 실행
		//2. id가 존재, db에 id와 일치하는 데이터 존재 => update 실행			=> jpa가 판단하고 실행한다.
		
		//jpaEntity 에서 updatable이 false로 설정되어 있기 때문에 이름과 날짜는 수정되지 않는다.
		return "redirect:/board/detail?myno="+dto.getMyno();  
	}
	
	@GetMapping("/delete")
	public String delete(int myno) {
		System.out.println("[delete]");
		//dao.deleteById(myno);	//이미 정의되어있는 메서드.
		
		//dao.deleteByMyno(myno);
		
		//내가 쿼리문을 직접 만들어서 실행하려는 의도
		dao.delBoard(myno);
		
		return "redirect:list";		//따로 dao에서 받아주는 메소드가 필요 없다.
	}
	
}
