package com.mvc.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.member.dao.MemberDao;
import com.mvc.member.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao dao;
	
	@Override
	public List<MemberDao> selectList() {
		
		return null;
	}

	@Override
	public MemberDto selectOne(String memid) {
		
		return dao.selectOne(memid);
	}

	@Override
	public int insert(MemberDto dto) {
		
		return dao.insert(dto);
	}

	@Override
	public int update(MemberDto dto) {
		
		return 0;
	}

	@Override
	public int delete(MemberDto dto) {
		
		return 0;
	}

}
