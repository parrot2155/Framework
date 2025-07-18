package com.mvc.rest.model.service;

import java.util.List;

import com.mvc.rest.model.dto.RestDto;

public interface RestService {
	public List<RestDto> selectList();
	public RestDto selectOne(int restno);
	public int insert(RestDto dto);
	public int update(RestDto dto);
	public int delete(int restno);
}
