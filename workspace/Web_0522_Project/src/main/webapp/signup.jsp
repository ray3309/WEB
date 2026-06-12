<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/Common/header.jsp"%>

<%@ page import="java.time.LocalDate"%>
<%@ page import="java.time.format.DateTimeFormatter"%>

<main class="contents">
	<form class="singup-form" action="singup" method="post">
		<h2>회원 가입</h2>
		<label for="id">아이디 : </label> <input type="text" id="id" name="id" autocomplete="username" required>		 
		<label for="email">이메일 : </label> <input type="email" id="email" name="email" autocomplete="email" required>
		<label for="phone">연락처 : </label> <input type="tel" id="phone" name="phone" autocomplete="tel" required>

		<button type="submit">회원가입</button>
	</form>
	
	<table class="singup-table">
		<thead>
			<tr>
				<th>번호</th>
				<th>아이디</th>
				<th>신청일</th>				
			</tr>
		</thead>
		<tbody id="singupBody">
		</tbody>
	</table>

	<script>
	const form = document.querySelector(".singup-form");

	form.addEventListener("submit", function(e) {
		e.preventDefault();

		const obj = {
			id: document.getElementById("id").value,
			email: document.getElementById("email").value,
			phone: document.getElementById("phone").value,
			rdate: new Date().toLocaleString("ko-KR")
		};

		let singupList = JSON.parse(localStorage.getItem("singupList")) || [];

		singupList.push(obj);

		localStorage.setItem("singupList", JSON.stringify(singupList));

		form.submit();
	});
	
	const data = localStorage.getItem("singupList");
	const singupList = JSON.parse(data) || [];

	const singupBody = document.getElementById("singupBody");

	let html = "";

	if (singupList.length === 0) {
		html += "<tr>";
		html += "<td colspan='8'>가입대기 데이터가 없습니다.</td>";
		html += "</tr>";
	} else {
		singupList.forEach(function(item, index) {
			html += "<tr>";
			html += "<td>" + (index + 1) + "</td>";
			html += "<td>" + item.id + "</td>";
			html += "<td>" + item.rdate + "</td>";
			html += "</tr>";
		});
	}
	singupBody.innerHTML = html;
	</script>
</main>

<!-- footer jsp 파일 포함 -->
<%@include file="/Common/footer.jsp"%>