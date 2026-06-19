<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>info.jsp</title>
<style>
	table { width:100%; bodrder-collapse: collapse;} td,th {border: 1px solid #ccc;}
</style>
</head>
<body>
	<div style="width:450px; margin: auto;">
	<table>
		<tbody>
			<tr>
				<th>번호</th><td>${vo.no }</td>
			</tr>
				
			<tr>
				<th>제목</th><td>${vo.title }</td>
			</tr>
			
			<tr>
				<th>작성자</th><td>${vo.writer }</td>
			</tr>
			
			<tr>
				<th>내용</th><td>${vo.content }</td>
			</tr>
			
			<tr>
				<th>조회수</th><td>${vo.hit }</td>
			</tr>
			
			<tr>
				<th>작성일</th><td>${vo.regdate }</td>
			</tr>			
		</tbody>
		<tfoot>
			<tr><th colspan="2">
				<button onclick="updateChk(${vo.no})">수정</button>
				<button onclick="delChk(${vo.no})">삭제</button>
				<button onclick="location='board.ict?cmd=boardList'">목록</button>
			</th>
			</tr>
		</tfoot>
	</table>
	</div>
	
	<script>
		function updateChk(no){
			location="board.ict?cmd=boardPwdForm&ct=up&no="+no;
		}
			
		function delChk(no){
			location="board.ict?cmd=boardPwdForm&ct=del&no="+no;
		}
				
	</script>
</body>
</html>