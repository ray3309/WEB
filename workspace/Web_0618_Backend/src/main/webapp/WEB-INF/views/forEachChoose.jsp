<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forEachChoose</title>
</head>
<body>
	<div style="width:450px; margin: 20px auto;">
		<h1>RequestScope로 받기 / Forward방식</h1>
			<table>
				<c:forEach begin="${start}" end="${end}" step="1" var="i">
					<c:choose>					
						<c:when test="${i%range==0}">
							<tr><td style="background-color: orange;">${i}</td></tr>
						</c:when>
						<c:when test="${i%range!=0}">
							<tr><td style="background-color: skyblue;">${i}</td></tr>
						</c:when>					
					</c:choose>
				</c:forEach>
			</table>
	
	</div>
	
</body>
</html>