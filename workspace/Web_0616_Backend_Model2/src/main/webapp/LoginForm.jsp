<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginForm</title>
</head>
<body>
	<div style="width: 200px; margin: auto;">
		<h1>HttpSession Object Use Login example</h1>
		<form method="post" action="loginProcess">
			<p>ID : <input type="text" name="userid"></p>
			<p>Password : <input type="password" name="password"></p>
			<p>
			<input type="submit" value="login">
			</p>
		</form>
	</div>
</body>
</html>