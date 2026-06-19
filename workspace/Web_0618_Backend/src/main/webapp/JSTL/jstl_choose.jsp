<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_choose</title>
</head>
<body>
	<%--jstl_choose.jsp?type=guest, member, vip --%>
	<div style="width: 300px; margin: auto">
		<c:choose>
			<c:when test="${param.type eq 'guest' }">
				<p style="color:magenta;">Hello guest customer!</p>
			</c:when>
			
			<c:when test="${param.type eq 'member' }">
				<p style="color:blue;">Hello member customer!</p>
			</c:when>
			
			<c:when test="${param.type eq 'vip' }">
				<p style="color:orange;">Hello vip customer!</p>
			</c:when>
			
			<c:otherwise>
				<p style="color:red;">Not Correct path!</p>
			</c:otherwise>		
		</c:choose>
	</div>
</body>
</html>