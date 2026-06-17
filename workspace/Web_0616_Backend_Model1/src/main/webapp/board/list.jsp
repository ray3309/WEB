<%@page import="board.BoardDao"%>
<%@page import="board.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    //BoardDao로 부터 해당 메서드를 호출 한 후 반환 받기 
	List<BoardVO> list = BoardDao.getDao().getList();
%>    
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
		<% for(BoardVO e : list){ %>			
			<tr>
				<td><%=e.getNo() %></td>
				<%-- ?param=값  : 상세보기, 수정, 삭제 특정값 다루는 것 : PK--%>
				<td><a href="info.jsp?no=<%=e.getNo()%>"><%=e.getTitle()%></a></td>
				<td><%=e.getWriter() %></td>
				<td><%=e.getContent() %></td>
				<td><%=e.getHit() %></td>
				<td><%=e.getRegdate() %></td>
			</tr>
		<% } %>	
		</tbody>
		<tfoot>
			<tr><td colspan="6">
				<button onclick="location='write.jsp'">글작성</button>
			</td></tr>
		</tfoot>
	</table>
</div>
</body>
</html>