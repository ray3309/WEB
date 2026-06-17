<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	String ct = request.getParameter("ct");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PasswordCheckForm</title>
</head>
<body>
	<div style="width: 300px; margin: auto;">
		<h1>번호 : <%=no %> / 유형 : <%=ct %></h1>
		<form action="passwordCheck.jsp" method="post">
			<input type="hidden" name="no" value=<%=no%>>
			<input type="hidden" name="ct" value=<%=ct%>>
			<p>
				Input Password : <input type="password" name="pwd" id="pwd">
				<button>OK</button>
			</p>
		</form>
	</div>
</body>
</html>