package com.mvc.member.dao;

import java.util.List;

import com.mvc.member.dto.MemberDto;

public interface MemberDao {
	public List<MemberDao> selectList();
	public MemberDto selectOne(String memid);
	public int insert(MemberDto dto);
	public int update(MemberDto dto);
	public int delete(MemberDto dto);
	
}
