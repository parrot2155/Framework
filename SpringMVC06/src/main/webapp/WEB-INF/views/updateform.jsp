<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수정하기</h1>
	<form action="update" method="post">
	<input type="hidden" value="${dto.testno }" name="testno">
	<input type="hidden" value="${sessionScope.loginMember.memname}" name="testname">
		<table>
			<tr>
				<th>번호</th>
				<td>${dto.testno }</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td>${dto.testname }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" value="${dto.testtitle }" name="testtitle"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea cols="40" rows="10"  name="testcontent">${dto.testcontent }</textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정하기">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>