package com.mvc.spring.BoardController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.board.dto.BoardDto;
import com.mvc.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService service;

    @RequestMapping("/list")
    public String list(Model model) {
        List<BoardDto> list = service.selectList();
        model.addAttribute("list", list);
        return "BoardList";
    }


    @RequestMapping("/insertform")
    public String insertForm() {
        return "insertform";
    }

    @PostMapping("/insert")
    public String write(BoardDto dto) {
        int res = service.insert(dto);
        if(res>0) {
        	System.out.println("글쓰기 성공");
        	return "redirect:/board/list";
        }else {
        	return "BoardList";
        }
        
    }
    
    @RequestMapping("/detail/{testno}")
    public String detail(@PathVariable int testno, Model model) {
        BoardDto dto = service.selectOne(testno);
        model.addAttribute("dto", dto);
        return "detail"; 
    }
    
    

    @RequestMapping("/update/{boardno}")
    public String updateForm(@PathVariable int boardno, Model model) {
        model.addAttribute("dto", service.selectOne(boardno));
        return "update";
    }

    @RequestMapping("/update")
    public String update(BoardDto dto) {
        service.update(dto);
        return "redirect:/board/list";
    }
    
    
    

}
