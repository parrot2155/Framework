package com.mvc.upgrade.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.upgrade.model.dao.BoardDao;
import com.mvc.upgrade.model.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao dao;
	
	@Override
	public List<BoardDto> selectList() {
		return dao.selectList();
	}

	@Override
	public BoardDto selectOne(int myno) {
		
		return dao.selectOne(myno);
	}

	@Override
	public int insert(BoardDto dto) {
		
		return dao.insert(dto);
	}

	@Override
	public int update(BoardDto dto) {
		
		return dao.update(dto);
	}

	@Override
	public int delete(int myno) {
		
		return dao.delete(myno);
	}

	@Override
	@Transactional
	public String test() {
		dao.insert(new BoardDto(0,"transaction2","test2","insert2",null));
		String str = dao.test();
		
		//null.length()=>insert 후에 문제가 생긴다.
		str.length();
		
		return null;
	}

}
