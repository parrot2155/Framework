package com.boot.jdbc.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.boot.jdbc.model.dto.MyDto;

@Mapper
public interface MyBoardMapper {
	
	@Select(" SELECT * FROM MYBOARD ORDER BY MYNO DESC ")
	List<MyDto> selectList();	//result 타입, 이름이 메퍼의 아이디라고 생각하면 됨.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
