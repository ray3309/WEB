<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="li" uri="http://java.sun.com/jsp/jstl/core" %>    
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
		<h2>List, Array방식 EL표기</h2>
		<p>List, Array key => \${list[idx].property}</p>
		<ul>
			<li>${productList[0]}</li>
			<li>${productList[1]}</li>
			<li>${productList[2]}</li>
		</ul>
		<hr>
		<h2>cusList[idx] = customer, clist 도 동일 출력</h2>		
		<ul>
			<li>${cusList[0].name} / ${cusList[0].email}<li>
			<li>${cusList[1].name}<li>
			<li>${cusList[2].name}<li>
		</ul>
		<ul>
			<li>${clist[0].name}<li>
			<li>${clist[1].name}<li>
			<li>${clist[2].name}<li>
		</ul>
	</div>
</body>
</html>