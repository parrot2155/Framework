<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>MEMBER DETAIL</h1>
	<table border="1">
		<tr>
			<th>MemberNo</th>
			<td>${dto.memberno }</td>
		</tr>
		<tr>
			<th>MemberID</th>
			<td>${dto.memberid }</td>
		</tr>
		<tr>
			<th>MemberPW</th>
			<td>${dto.memberpw }</td>
		</tr>
		<tr>
			<th>MemberName</th>
			<td>${dto.membername }</td>
		</tr>
	</table>
</body>
</html>