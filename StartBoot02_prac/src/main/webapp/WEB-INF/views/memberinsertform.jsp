<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>INSERT FORM<</h1>
	<form action="/mymember/insert" method="post">
		<table>
			<tr>
				<th>MemberId</th>
				<td><input type="text" name="memberid"></td>
			</tr>
			<tr>
				<th>MemberPW</th>
				<td><input type="text" name="memberpw"></td>
			</tr>
			<tr>
				<th>MemberName</th>
				<td><input type="text" name="membername"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="글쓰기">
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>