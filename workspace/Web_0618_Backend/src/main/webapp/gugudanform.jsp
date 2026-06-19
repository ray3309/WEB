<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>guguForm</title>
</head>
<body>
	<div style="width: 450px; margin: auto">
		<h2 style="text-align: center;">구구단 설정</h2>
		<form action="gugudanServlet" method="post" style="width: 300px; margin: auto;">
			<p>
				<label>단 :</label> <input type="number" name="dan" required>
			</p>
			<p>
				<label>범위:</label> <select name="limit">
					<option value="3">3</option>
					<option value="5">5</option>
					<option value="7">7</option>
					<option value="9">9</option>
				</select>
			</p>
			<p>
				<label>색상:</label> <input type="color" name="color" value="#ff0000">
			</p>
			<p style="text-align: center;">
				<input type="submit" value="구구단 출력">
			</p>
		</form>
	</div>
</body>
</html>