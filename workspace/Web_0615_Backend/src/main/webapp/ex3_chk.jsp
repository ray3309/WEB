<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex3_chk.jsp</title>
</head>
<body>
<%
	//checkbox 그룹으로 받는 방법
	//request.getParameterValues("파라미터이름"):String[]
	String[] hbs = request.getParameterValues("hb");
%>
<ul>
<% for(String e : hbs){ %>
	<li><%=e %></li>
<%} %>
</ul>
</body>
</html>

