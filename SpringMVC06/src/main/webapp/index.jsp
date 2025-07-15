<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>LOG IN</h1>
	<form action="login" method="post">
		<table>
			<tr>
				<th>아이디 : </th>
				<td><input type="text" name="memid"></td>
			</tr>
			<tr>
				<th>비밀번호 : </th>
				<td><input type="text" name="mempw"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="로그인">
				</td>
			</tr>
		</table>
	</form>
	<form action="signupform" method="post">
		<input type="submit" value="회원가입">
	</form>
	

</body>
</html>