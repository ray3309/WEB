<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
	<div>
		<table>
			<c:forEach var="customer" items="${vo}">
				<ul>
					<!-- 3. var에서 지정한 변수명 뒤에 .멤버변수명을 적어 출력합니다. -->
					<li>번호: ${customer.num}</li>
					<li>이름: ${customer.name}</li>
					<li>이메일: ${customer.email}</li>
					<li>전화번호: ${customer.phone}</li>
					<li>날짜: ${customer.date}</li>
				</ul>
			</c:forEach>
		</table>		
	</div>
</body>
</html>