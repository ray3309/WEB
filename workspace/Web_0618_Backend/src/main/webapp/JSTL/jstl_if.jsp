<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex4_jstl_if</title>
<style>
	table { margin: 10px auto; border-collapse: collapse;}
	td { border: 1px solid #999; padding: 8px; text-align: center;}
</style>
</head>
<body>
	<p>
	<%-- jstl_if.jsp?type=guest --%>
		request param : ${param.type} / 
		${param.type eq 'guest' } / ${param.type == 'guest' }
	</p>
	<h2>JSTL IF문 조건 사용</h2>		
	<c:if test = "${param.type eq 'guest'}">
		<b>Welcome ${param.type} 님 회원 가입 하세요</b>
	</c:if>
</body>
</html>