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
	String msg = request.getParameter("msg");
	String hiddenmsg = request.getParameter("hmsg");
%>
<p><%=msg%></p>
<p>hidden:<%=hiddenmsg%></p>
<form method="post">
	<!-- input의 hidden타입은 사용자에게 보이지 않는 상태에서 서버로 값을 전송할때 주로 사용함 -->
	<input type="hidden" name="hmsg" value="HiddenValue">
	Message: <input type="text" name="msg">
	<input type="submit" value="send">
</form>
</body>
</html>