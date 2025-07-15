<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>INDEX</h1>
	
	<!-- get방식 데이터 요청.-->
	<h3><a href="restdto">1. selectList</a></h3>
	<h3><a href="restdto/1">2. selectOne</a></h3>
	<hr>
	<!-- post -->
	<form action="restdto" method="post">
		ID : <input type="text" name="restid"><br>
		PW : <input type="text" name="restpw"><br>
		NAME : <input type="text" name="restname"><br>
		<input type="submit" value="insert">
	</form>
	<hr>
	
	<!-- delete -->
	<form action="restdto/1" method="post">		<!-- html에서는 method="delete"지원 안함. 강제적으로 변환해주는 작업 필요. -->
		<input type="hidden" name="_method" value="delete">
		<input type="submit" value="delete">	
	</form>
	
	<!-- put -->
	<!-- put메소드로 요청을 보내 2번 게시글의 pw값을 db에서 수정하자. -->
	<form action="restdto/2" method="post">
		<input type="hidden" name="_method" value="put">
		변경할 비밀번호 : <input type="text" name="restpw"><br>
		<input type="submit" value="update">
	</form>
	
	
	
	
	
</body>
</html>














 