<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String[] imgs = {"aespa1.jpg","aespa2.jpg","aespa1.jpg"};
	String[] names = {"카리나","지젤","닝닝"};
	String[] jobs = {"기획자","개발자","디자이너"};
%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex11_myAespa</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
<link rel="stylesheet" href="css/teams.css">
</head>
<body>
<div id="container">
	<h1>My 에스파</h1>
	<%-- 에스파 1 시작 --%>
	<div class="row">
	<div class="column">
		<div class="card">
			<div class="img-container">
				<img alt="카리나" src="images/aespa1.jpg">
			</div>
			<h2>카리나</h2>
			<p>메인가수</p>
			<div class="social">
			            <a href="#"><i class="fa-brands fa-twitter"></i></a>
			            <a href="#"><i class="fa-brands fa-linkedin"></i></a>
			            <a href="#"><i class="fa-brands fa-github"></i></a>
			            <a href="#"><i class="fa-solid fa-envelope"></i></a>
			</div>
		</div>
	</div>
	<%-- 에스파 1 끝 --%>
	<%-- 에스파 2 시작 --%>
	<div class="column">
		<div class="card">
			<div class="img-container">
				<img alt="지젤" src="images/aespa2.jpg">
			</div>
			<h2>지젤</h2>
			<p>메인가수2</p>
			<div class="social">
			            <a href="#"><i class="fa-brands fa-twitter"></i></a>
			            <a href="#"><i class="fa-brands fa-linkedin"></i></a>
			            <a href="#"><i class="fa-brands fa-github"></i></a>
			            <a href="#"><i class="fa-solid fa-envelope"></i></a>
			</div>
		</div>
	</div>
	<%-- 에스파 2 끝 --%>
	<%-- 에스파 3 시작 --%>
	<div class="column">
		<div class="card">
			<div class="img-container">
				<img alt="닝닝" src="images/aespa3.jpg">
			</div>
			<h2>닝닝</h2>
			<p>메인가수3</p>
			<div class="social">
			            <a href="#"><i class="fa-brands fa-twitter"></i></a>
			            <a href="#"><i class="fa-brands fa-linkedin"></i></a>
			            <a href="#"><i class="fa-brands fa-github"></i></a>
			            <a href="#"><i class="fa-solid fa-envelope"></i></a>
			</div>
		</div>
	</div>
	<%-- 에스파 3 끝 --%>
	</div> <%-- row  --%>
</div>
</body>
</html>