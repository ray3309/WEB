<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력처리</title>
</head>
<body>
<div>
	<form method="post" action="board.ict">
		<input type="hidden" name="cmd" value="boardAdd">
		<input type="hidden" name="reip" value="<%=request.getRemoteAddr()%>">
		<p>제목:<input type="text" name="title"></p>
		<p>작성자:<input type="text" name="writer"></p>
		<p>내용:<textarea rows="10" cols="10" name="content"></textarea></p>
		<p>비밀번호:<input type="password" name="pwd"></p>	
		<p><input type="submit" value="글작성"></p>
	</form>
</div>
</body>
</html>
