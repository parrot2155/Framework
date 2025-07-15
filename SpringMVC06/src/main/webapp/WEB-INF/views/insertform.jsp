<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<%@ page import="com.mvc.member.dto.MemberDto" %>
<%
    MemberDto loginDto = (MemberDto) session.getAttribute("loginMember");
    String memname = loginDto != null ? loginDto.getMemname() : "알 수 없음";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<h1>글쓰기</h1>
	<form action="insert" method="post">
		<table>
			<tr>
				<th>작성자</th>
				<td><input type="text" value="<%= memname %>" readonly="readonly" name="testname"></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="testtitle" required></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="testcontent" rows="10" cols="50" required></textarea></td>
			</tr>
			<tr>
				<td colspan="2" >
					<input type="submit" value="등록">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
