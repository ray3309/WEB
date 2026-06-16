<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//name="num1" , name="num2"
	//request.getParameter():String
		int num1 =  Integer.parseInt(request.getParameter("num1"));
		int num2 =  Integer.parseInt(request.getParameter("num2"));
	%>
	<h1>jsp 내장 객체로 파라미터 받고 출력하기</h1>
	<%=num1 %> / <%=num2 %>
</body>
</html>