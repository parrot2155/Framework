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
	<h1>MEMBER LIST</h1>
	<table border="1">
	<col width="50"><col width="200"><col width="200">
		<tr>
			<th>MEMBERNO</th>
			<th>MEMBERID</th>
			<th>MEMBERNAME</th>
		</tr>
		<c:forEach items="${list }" var="dto">
			<tr>
				<td>${dto.memberno }</td>
				<td><a href="/mymember/detail?memberno=${dto.memberno}" >${dto.memberid }</a></td>
				<td>${dto.membername }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="4">
				<input type="button" value="글쓰기" onclick="location.href='/mymember/insertform'">
			</td>
		</tr>
	</table>
</body>
</html>