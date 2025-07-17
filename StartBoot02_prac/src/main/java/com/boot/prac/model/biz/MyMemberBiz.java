package com.boot.prac.model.biz;

import java.util.List;

import com.boot.prac.model.dto.MyMemberDto;

public interface MyMemberBiz {
	public List<MyMemberDto> selectAll();
	public MyMemberDto selectOne(int memberno);
	public int insert(MyMemberDto dto);
	public int udpate(MyMemberDto dto);
	public int delete(int memberno);
}
