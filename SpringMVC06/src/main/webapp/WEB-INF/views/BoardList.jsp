<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ✅ 상단: 로그인한 사용자 이름 및 로그아웃 버튼 -->
	<div>
		<c:if test="${not empty sessionScope.loginMember}">
			<b>${sessionScope.loginMember.memname}</b> 님 |
			<input type="button" value="로그아웃" onclick="location.href='/spring/logout'">
			<input type="button" value="회원 탈퇴" onclick="location.href='/spring/deletemem'">
		</c:if>
	</div>
	<h1>List</h1>
	<table>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성일</th>
		</tr>
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.testno}</td>
				<td>${dto.testname}</td>
				<td>${dto.testtitle}</td>
				<td><a href="detail/${dto.testno}">${dto.testcontent}</a></td>
				<td>${dto.testdate}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="4"><input type="button"
				onclick="location.href='insertform'" value="새 글 작성"></td>
		</tr>
	</table>
</body>
</html>