<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
<style>
	table { width:100%; bodrder-collapse: collapse;} td,th {border: 1px solid #ccc;}
</style>
</head>
<body>
<div>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>내용</th>
				<th>조회수</th>
				<th>날짜</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="e" items="${blist}">
			<tr>
				<td>${e.no}</td>
				<%-- ?param=값  : 상세보기, 수정, 삭제 특정값 다루는 것 : PK--%>
				<td><a href="board.ict?cmd=boardDetail&no=${e.no}">${e.title}</a></td>
				<td>${e.writer}</td>
				<td>${e.content}</td>
				<td>${e.hit}</td>
				<td>${e.regdate}</td>
			</tr>
			</c:forEach>	
		</tbody>		
		<tfoot>
			<tr><td colspan="6">
				<button onclick="location='board.ict?cmd=boardForm'">글작성</button>
			</td></tr>
		</tfoot>
	</table>
</div>
</body>
</html>