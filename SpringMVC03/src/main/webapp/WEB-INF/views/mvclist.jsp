<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	<!-- 이미 자동으로 추가되어있음 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>List</h1>
<table>
	<colgroup>
		<col width="50">
		<col width="100">
		<col width="300">
		<col width="100">
	</colgroup>
	<tr>
		<th>No</th>
		<th>Writer</th>
		<th>Title</th>
		<th>Date</th>
	</tr>
	<c:choose>
		<c:when test="${empty list }">
			<tr>
				<td colspan="4" align="center">작성된 글이 없습니다.</td>
			</tr>
		</c:when>
		<c:otherwise>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.myno }</td>
					<td>${dto.myname }</td>
					<td><a href="detail.do?myno=${dto.myno }">${dto.mytitle }</a></td>
					<td><fmt:formatDate value="${dto.mydate}" pattern="yyyy년 MM월 dd일 hh시 mm분" /></td>
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>
	<tr>
		<td colspan="4" align="right">
			<input type="button" value="글작성" onclick="location.href='insertform.do'"/>
			<!-- 해당 버튼을 클릭하면 요청을 잘 처리해서 mvcinsert.jsp로 응답하는 내용을 구현 -->
		</td>
	</tr>
</table>
</body>
</html>