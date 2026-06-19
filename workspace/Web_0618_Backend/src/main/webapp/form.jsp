<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
<div style="width: 350px; margin: 50px auto">
	<div>
		<form action="servlet" method="post">
			<p>Num1: <input type="number" name="start"></p>
			<p>Num2: <input type="number" name="end"></p>
			<p>Range: <input type="number" name="range"></p>
			<p><input type="submit" value="send"></p>
		</form>
	</div>
</div>
</body>
</html>