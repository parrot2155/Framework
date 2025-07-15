package com.mvc.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mvc.board.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private RowMapper<BoardDto> rowMapper = (rs, rowNum) -> {
		return new BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5));
	};

	@Override
	public List<BoardDto> selectList() {
		String sql = "SELECT * FROM TESTBOARD ORDER BY TESTNO DESC";
		return jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public BoardDto selectOne(int testno) {
		String sql = "SELECT * FROM TESTBOARD WHERE TESTNO = ?";
		return jdbcTemplate.queryForObject(sql, rowMapper, testno);
	}

	@Override
	public int insert(BoardDto dto) {
		String sql = "INSERT INTO TESTBOARD (TESTNO, TESTNAME, TESTTITLE, TESTCONTENT, TESTDATE) VALUES (SEQ_BOARD.NEXTVAL, ?, ?, ?, SYSDATE)";
		return jdbcTemplate.update(sql, dto.getTestname(), dto.getTesttitle(), dto.getTestcontent());
	}

	@Override
	public int update(BoardDto dto) {
		String sql = "UPDATE TESTBOARD SET TESTNAME = ?, TESTTITLE = ?, TESTCONTENT = ? WHERE TESTNO = ?";
		return jdbcTemplate.update(sql, dto.getTestname(), dto.getTesttitle(), dto.getTestcontent(), dto.getTestno());
	}

	@Override
	public int delete(int testno) {
		String sql = "DELETE FROM TESTBOARD WHERE TESTNO = ?";
		return jdbcTemplate.update(sql, testno);
	}

}
