package com.mvc.rest.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mvc.rest.model.dto.RestDto;

@Repository
public class RestDaoImpl implements RestDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private RowMapper<RestDto> rowMapper = (rs, rowNum)->{	// re : resultset				//람다식
		return new RestDto(rs.getInt(1),rs.getNString(2),rs.getNString(3),rs.getNString(4));
	};
	
//	RowMapper<RestDto> rowMap = new RowMapper<RestDto>() {		//익명함수
//		public RestDto(Resultset rs, int rowNum) {
//			return new RestDto();
//		}
//	};
	
	
	
	@Override
	public List<RestDto> selectList() {
		List<RestDto> res = new ArrayList<>();
		String sql = " SELECT * FROM RESTBOARD ";
		res = jdbcTemplate.query(sql, rowMapper); 			//sql 출력값을 자바 객체로 매핑하며 담아줄 맵퍼
		return res;									//로우맵퍼작성방법 1.익명함수 2.람다식
	}

	@Override
	public RestDto selectOne(int restno) {
		String sql = " SELECT * FROM RESTBOARD WHERE RESTNO=? ";
		RestDto res = jdbcTemplate.queryForObject(sql, rowMapper, restno);	//<-물음표를 채울 값
		
		return res;
	}

	@Override
	public int insert(RestDto dto) {
		String sql = " INSERT INTO RESTBOARD VALUES(SEQ_REST.NEXTVAL, ?, ?, ?) ";
		int res = jdbcTemplate.update(sql, dto.getRestid(), dto.getRestpw(), dto.getRestname());
		return res;
	}

	@Override
	public int update(RestDto dto) {
		String sql =" UPDATE RESTBOARD SET RESTPW=? WHERE RESTNO=? ";
		int res = jdbcTemplate.update(sql, dto.getRestpw(),dto.getRestno());
		return res;
	}

	@Override
	public int delete(int restno) {
		String sql = " DELETE FROM RESTBOARD WHERE RESTNO=? ";
		int res = jdbcTemplate.update(sql,restno);
		return res;
	}

}
