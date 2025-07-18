package com.mvc.board.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BoardDto {
	public int testno;
	public String testname;
	public String testtitle;
	public String testcontent;
	public Date testdate;
}