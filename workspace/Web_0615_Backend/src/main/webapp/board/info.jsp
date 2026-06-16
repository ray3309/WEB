<%@page import="ex2.BoardVO"%>
<%@page import="ex2.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//번호 파라미터 처리
	int num = Integer.parseInt(request.getParameter("no"));
	BoardDao dao = BoardDao.getDao();
	//hit처리 
	//Dao + hit + getDetail(n) => VO
	dao.hit(num);
	BoardVO e = dao.getDetail(num);
%>
    
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
				<th>번호</th><td><%=e.getNo() %></td>
			</tr>
				
			<tr>
				<th>제목</th><td><%=e.getTitle() %></td>
			</tr>
			
			<tr>
				<th>작성자</th><td><%=e.getWriter() %></td>
			</tr>
			
			<tr>
				<th>내용</th><td><%=e.getContent() %></td>
			</tr>
			
			<tr>
				<th>조회수</th><td><%=e.getHit() %></td>
			</tr>
			
			<tr>
				<th>작성일</th><td><%=e.getRegdate()%></td>
			</tr>			
		</tbody>
		<tfoot>
			<tr><th colspan="2">
				<button onclick="updateChk(<%=e.getNo()%>)">수정</button>
				<button onclick="delChk(<%=e.getNo()%>)">삭제</button>
				<button onclick="location='list.jsp'">목록</button>
			</th>
			</tr>
		</tfoot>
	</table>
	</div>
	
	<script>
		function updateChk(no){
			location="pwdchk.jsp?ct=up&no="+no;
		}
			
		function delChk(no){
			location="pwdchk.jsp?ct=del&no="+no;
		}
				
	</script>
</body>
</html>