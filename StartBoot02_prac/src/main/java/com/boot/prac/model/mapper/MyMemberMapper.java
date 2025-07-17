package com.boot.prac.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.boot.prac.model.dto.MyMemberDto;

@Mapper
public interface MyMemberMapper {
	
	@Select(" SELECT * FROM MYMEMBER ORDER BY MEMBERNO DESC ")
	List<MyMemberDto> selectAll();
	
	@Select(" SELECT * FROM MYMEMBER WHERE MEMBERNO=#{memberno} ")
	MyMemberDto selectOne(int memberno);
	
	@Insert(" INSERT INTO MYMEMBER VALUES( SEQ_MYMEMBER.NEXTVAL, #{memberid}, #{memberpw}, #{membername}) ")
	int insert(MyMemberDto dto);
}
