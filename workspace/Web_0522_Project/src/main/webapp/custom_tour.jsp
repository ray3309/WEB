<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- hedaer jsp 파일 포함 -->
<%@include file="Common/header.jsp"%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>

<!-- 슬라이더 영역
<div id="carouselExampleInterval" class="carousel slide"
	data-bs-ride="carousel">
	<div class="carousel-inner">
		<div class="carousel-item active" data-bs-interval="1000">
			<img src="img/gugugaga1.jpg" class="d-block w-100 banner-img"
				alt="...">
		</div>
		<div class="carousel-item" data-bs-interval="2000">
			<img src="img/gugugaga2.jpg" class="d-block w-100 banner-img"
				alt="...">
		</div>
		<div class="carousel-item">
			<img src="img/gugugaga3.jpg" class="d-block w-100 banner-img"
				alt="...">
		</div>
	</div>
	<button class="carousel-control-prev" type="button"
		data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
		<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="visually-hidden">Previous</span>
	</button>
	<button class="carousel-control-next" type="button"
		data-bs-target="#carouselExampleInterval" data-bs-slide="next">
		<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="visually-hidden">Next</span>
	</button>
</div>
슬라이더 영역 끝 -->

<main class="contents">
	<form class="custom-form" action="<%=request.getContextPath()%>/reserve" method="post">
		<h2>맞춤 여행 신청</h2>
		<label for="name">이름 : </label> <input type="text" id="name"
			name="name" required> <label for="email">이메일 : </label> <input
			type="email" id="email" name="email" required> <label
			for="phone">연락처 : </label> <input type="tel" id="phone" name="phone"
			required> <label for="country">여행 희망 국가</label> <select
			id="country" name="country">
			<option value="일본">일본</option>
			<option value="중국">중국</option>
			<option value="미국">미국</option>
			<option value="영국">영국</option>
		</select> <label for="date">여행 희망 날짜</label> <input type="date" id="date"
			name="date"> <label for="days">여행 기간</label> <select
			id="days" name="days">
			<option value="2박3일">2박 3일</option>
			<option value="4박5일">4박 5일</option>
			<option value="9박10일">9박 10일</option>
			<option value="기타">기타</option>
		</select> <label for="activities">희망 액티비티</label>
		<textarea id="activities" name="activities" rows="4"
			placeholder="예: 패러글라이딩, 요트 체험, 올레길 트레킹 등"></textarea>
		<button type="submit">신청하기</button>
	</form>

	<script>
	const form = document.querySelector(".custom-form");

	form.addEventListener("submit", function(e) {
		e.preventDefault();

		const obj = {
			name: document.getElementById("name").value,
			email: document.getElementById("email").value,
			phone: document.getElementById("phone").value,
			country: document.getElementById("country").value,
			date: document.getElementById("date").value,
			days: document.getElementById("days").value,
			activities: document.getElementById("activities").value
		};

		let reserveList = JSON.parse(localStorage.getItem("reserveList")) || [];

		reserveList.push(obj);

		localStorage.setItem("reserveList", JSON.stringify(reserveList));

		form.submit();
	});	
	</script>
</main>

<!-- footer jsp 파일 포함 -->
<%@include file="Common/footer.jsp"%>