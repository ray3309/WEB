<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div {width: 300px; margin: auto;}
	ul { text-decoration: none; list-style: none;}
</style>
</head>
<body>
	<div>
		<h2>Map방식의 EL표기</h2>
		<p> Map일때 key = \${map.key, } </p>
		<ul>
			<li>차량명 : ${Car.cname}</li>
			<li>제조사 : ${Car.maker }</li>
		</ul>
	</div>
</body>
</html>