package com.mvc.member.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mvc.member.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<MemberDto> rowMapper = (rs, rowNum) -> {
        MemberDto dto = new MemberDto();
        dto.setMemid(rs.getString("MEMID"));
        dto.setMempw(rs.getString("MEMPW"));
        dto.setMemname(rs.getString("MEMNAME"));
        return dto;
    };
	
	@Override
	public List<MemberDao> selectList() {
		
		return null;
	}

	@Override
	public MemberDto selectOne(String memid) {
		String sql = "SELECT * FROM MEMBER WHERE MEMID = ?";
        MemberDto res = jdbcTemplate.queryForObject(sql, rowMapper, memid);
		return res;
	}

	@Override
	public int insert(MemberDto dto) {
		String sql = "INSERT INTO MEMBER VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?)";
		int res = jdbcTemplate.update(sql, dto.getMemid(), dto.getMempw(), dto.getMemname());
		return res;
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
