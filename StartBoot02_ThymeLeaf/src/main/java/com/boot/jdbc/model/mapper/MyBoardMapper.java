package com.boot.jdbc.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.boot.jdbc.model.dto.MyDto;

@Mapper
public interface MyBoardMapper {
	
	@Select(" SELECT * FROM MYBOARD ORDER BY MYNO DESC ")
	List<MyDto> selectList();	//result 타입, 이름이 메퍼의 아이디라고 생각하면 됨.
	
	@Select(" SELECT * FROM MYBOARD WHERE MYNO=#{myno}")
	MyDto selectOne(int myno);
	
	@Insert(" INSERT INTO MYBOARD VALUES( SEQ_MY.NEXTVAL, #{myname}, #{mytitle}, #{mycontent}, SYSDATE)")
	int insert(MyDto dto);
	
	@Update(" UPDATE MYBOARD SET MYNAME=#{myname}, MYTITLE=#{mytitle}, MYCONTENT=#{mycontent} WHERE MYNO=#{myno} ")
	int update(MyDto dto);
	
	@Delete(" DELETE FROM MYBOARD WHERE MYNO=#{myno}")
	int delete(int myno);
	
	
	
	
	
	
	
	
	
	
	
}
