package com.boot.prac.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.prac.model.dto.MyMemberDto;
import com.boot.prac.model.mapper.MyMemberMapper;

@Service
public class MyMemberBizImpl implements MyMemberBiz{

	@Autowired
	private MyMemberMapper mapper;
	
	@Override
	public List<MyMemberDto> selectAll() {

		return mapper.selectAll();
	}

	@Override
	public MyMemberDto selectOne(int memberno) {

		return mapper.selectOne(memberno);
	}

	@Override
	public int insert(MyMemberDto dto) {

		return mapper.insert(dto);
	}

	@Override
	public int udpate(MyMemberDto dto) {

		return 0;
	}

	@Override
	public int delete(int memberno) {

		return 0;
	}

}
