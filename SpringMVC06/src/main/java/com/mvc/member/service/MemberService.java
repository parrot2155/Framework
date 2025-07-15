package com.mvc.member.service;

import java.util.List;

import com.mvc.member.dao.MemberDao;
import com.mvc.member.dto.MemberDto;

public interface MemberService {
	public List<MemberDao> selectList();
	public MemberDto selectOne(String memid);
	public int insert(MemberDto dto);
	public int update(MemberDto dto);
	public int delete(MemberDto dto);
	
}
