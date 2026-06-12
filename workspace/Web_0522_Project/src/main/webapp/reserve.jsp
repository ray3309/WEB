<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/Common/header.jsp"%>

<link rel="stylesheet" href="css/style.css">

<main class="contents">
	<h2>예약 신청 목록</h2>

	<table class="reserve-table">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>이메일</th>
				<th>연락처</th>
				<th>국가</th>
				<th>날짜</th>
				<th>기간</th>
				<th>희망 액티비티</th>
			</tr>
		</thead>
		<tbody id="reserveBody">
		</tbody>
	</table>

	<script>
		const data = localStorage.getItem("reserveList");
		const reserveList = JSON.parse(data) || [];
	
		const reserveBody = document.getElementById("reserveBody");
	
		let html = "";
	
		if (reserveList.length === 0) {
			html += "<tr>";
			html += "<td colspan='8'>예약 데이터가 없습니다.</td>";
			html += "</tr>";
		} else {
			reserveList.forEach(function(item, index) {
				html += "<tr>";
				html += "<td>" + (index + 1) + "</td>";
				html += "<td>" + item.name + "</td>";
				html += "<td>" + item.email + "</td>";
				html += "<td>" + item.phone + "</td>";
				html += "<td>" + item.country + "</td>";
				html += "<td>" + item.date + "</td>";
				html += "<td>" + item.days + "</td>";
				html += "<td>" + item.activities + "</td>";
				html += "</tr>";
			});
		}
	
		reserveBody.innerHTML = html;
	</script>
</main>

<%@ include file="/Common/footer.jsp"%>