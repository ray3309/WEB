<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div {width: 300px; margin: auto;}
	ul { text-decoration: none; list-style: none;}
</style>
</head>
<body>
	<div>
		<h2>List, Array방식 EL표기2 (ForEach문 사용)</h2>
		<p>List, Array key = \${list[idx].property}</p>
		
		<!-- 1. items에는 서블릿에서 setAttribute한 정확한 key값인 "cList"를 대소문자 맞춰 적습니다. -->
		<!-- 2. var에는 반복문 안에서 꺼내 쓸 객체 하나당 부여할 변수명(예: cust)을 지정합니다. -->
		
		<h2>List ForEach</h2>
		<c:forEach var="cust" items="${cList}">
		<ul>
			<!-- 3. let에서 지정한 변수명 뒤에 .멤버변수명을 적어 출력합니다. -->
			<li>번호: ${cust.num}</li>
			<li>이름: ${cust.name}</li>
			<li>이메일: ${cust.email}</li>
			<li>전화번호: ${cust.phone}</li>
			<li>날짜: ${cust.date}</li>
		</ul>
		</c:forEach>
	</div>
</body>
</html>