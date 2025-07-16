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
    
    

    @RequestMapping("/detail/updateform/{boardno}")
    public String updateForm(@PathVariable int boardno, Model model) {
        model.addAttribute("dto", service.selectOne(boardno));
        return "updateform";
    }

    @RequestMapping("/detail/updateform/update")
    public String update(BoardDto dto) {
        int res = service.update(dto);
        
        if(res>0) {
        	System.out.println("업데이트 성공");
        	return "redirect:/board/list";
        }else {
        	System.out.println("업데이트 실패");
        	return "redirect:/board/list";
        }
    }
    
    @RequestMapping("detail/delete/{testno}")
    public String delete(@PathVariable int testno) {
    	int res = service.delete(testno);
    	
    	if(res>0) {
    		System.out.println("삭제 성공");
    		return "redirect:/board/list";
    	}else {
    		System.out.println("삭제 실패");
    		return "redirect:/board/list";
    	}
    }
    
    
    

}
