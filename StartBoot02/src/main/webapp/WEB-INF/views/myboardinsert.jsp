<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>INSERT</h1>
	<form action="/myboard/insert" method="post">
		<table>
			<tr>
				<th>Myname</th>
				<td><input type="text" name="myname"></td>
			</tr>
			<tr>
				<th>Mytitle</th>
				<td><input type="text" name="mytitle"></td>
			</tr>
			<tr>
				<th>Mycontent</th>
				<td><textarea rows="10" cols="40" name="mycontent"></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="작성완료">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>