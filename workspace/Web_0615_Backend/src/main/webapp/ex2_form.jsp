<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1>JSP내장 객체 실습</h1>
<body>
<!--  동기식 방식으로 submit버튼을 클릭하면  ex2_request.jsp 데이터를 전송-->
<form action="ex2_request.jsp" method="post">
	<p>숫자1:<input type="number" name="num1" value="10" step="10"></p>
	<p>숫자2:<input type="number" name="num2" value="10" step="10"></p>
	
	<input type="submit" value="send">
</form>
</body>
</html>