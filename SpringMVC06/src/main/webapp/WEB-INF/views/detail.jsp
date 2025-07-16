<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상세보기</h2>
	<table>
		<tr>
			<th>번호</th>
			<td>${dto.testno}</td>
		</tr>
		<tr>
			<th>이름</th>
			<td>${dto.testname}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${dto.testtitle}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea cols="40" rows="10" readonly="readonly">${dto.testcontent}</textarea></td>
		</tr><tr>
			<th>작성일</th>
			<td>${dto.testdate}</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="수정하기" onclick="location.href='updateform/${dto.testno}'">
				<input type="button" value="삭제하기" onclick="location.href='delete/${dto.testno}'">
			</td>
		</tr>
		
	</table>
</body>
</html>