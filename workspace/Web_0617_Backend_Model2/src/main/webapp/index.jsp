<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String userid = (String) session.getAttribute("userid");
String username = (String) session.getAttribute("username");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(null != userid) { %>
	<h2>Welcome, <%=username%>님</h2>
	<a href="logoutProcess">로그아웃</a>
<% }else{ 
	//no session value, before login(Not Saved Session Value)
%>
 	<h2>Required Login</h2>
	<a href="LoginForm.jsp">Login Page Move</a>
<% } %>
</body>
</html>