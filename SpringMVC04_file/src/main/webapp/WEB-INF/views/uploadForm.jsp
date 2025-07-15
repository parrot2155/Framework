<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Upload Form</h1>
	<!-- 
		enctype 속성
		- application/www-form-urlencoded : (default) 문자 <- 이게 기본값으로 원래 넘어가는거였음
		- multipart/form-data : 파일 <- 이제 파일을 전달할 수 있음
	 -->
	 
	 <!-- Spring MVC에서 제공하는 Spring Form Tag Library
	 	  HTML 폼처리 + Spring의 유효성 검사, 데이터 바인딩, 오류메시지 표시
	  -->
	
	<form:form action="upload" method="post" enctype="multipart/form-data" modelAttribute="uploadFile">
		<h3> 업로드할 파일 선택</h3><br>
		파일 : <input type="file" name="mpfile"><br>
		<p style="color:red; font-weight:bold;"><form:errors path="mpfile"/></p>
		설명 : <br>
		<textarea rows="10" cols="40" name="desc"></textarea><br>
		<input type="submit" value="전송">
	</form:form>							<!-- 그냥 파일 데이터만 넘길려면 form이면 된다. -->
		
	
</body>
</html>