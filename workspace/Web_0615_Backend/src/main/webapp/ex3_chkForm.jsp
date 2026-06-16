<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex3_chkForm.jsp</title>
</head>
<body>
	<div style="width: 450px; margin: auto">
	<h1>JSP 내장객체 :checkbox파라미터 처리</h1>
	
	 <form method="post" action="ex3_chk.jsp">
		<h2>checkBox 파라미터</h2>
		<input type="checkbox" name="hb" value="1">1유형
		<input type="checkbox" name="hb" value="2">2유형
		<input type="checkbox" name="hb" value="3">3유형
		<input type="checkbox" name="hb" value="4">4유형
		<input type="checkbox" name="hb" value="5">5유형
		<hr>
		<input type="submit" value="send">
	</form>	
	</div>
</body>
</html>
