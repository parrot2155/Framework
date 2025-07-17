package com.boot.jdbc.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.jdbc.model.dao.MyDao;
import com.boot.jdbc.model.dto.MyDto;

@Service
public class MyBizImpl implements MyBiz{
	
	@Autowired
	private MyDao dao;
	
	@Override
	public List<MyDto> selectList() {

		return null;
	}

	@Override
	public MyDto selectOne(int myno) {
	
		return null;
	}

	@Override
	public int insert(MyDto dto) {

		return 0;
	}

	@Override
	public int update(MyDto dto) {

		return 0;
	}

	@Override
	public int delete(int myno) {

		return 0;
	}

}
