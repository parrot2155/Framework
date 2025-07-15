package com.mvc.board.service;

import java.util.List;

import com.mvc.board.dto.BoardDto;

public interface BoardService {
	public List<BoardDto> selectList();
	public BoardDto selectOne(int testno);
	public int insert(BoardDto dto);
	public int update(BoardDto dto);
	public int delete(int testno);
}
