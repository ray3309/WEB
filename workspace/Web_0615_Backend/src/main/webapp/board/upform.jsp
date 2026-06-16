<%@page import="ex2.BoardVO"%>
<%@page import="ex2.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// 번호의 데이터를 가져와 사용자에게 보여주고, 변경된 부분을 다시 수정처리 하는 곳으로 전송
	// select * from board where no=?			
	// update board set ~~~ where no=?
			
	int no = Integer.parseInt(request.getParameter("no"));

	BoardVO e = BoardDao.getDao().getUpdateDelete(no);
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<form method="post" action="upBoard.jsp">
		<input type="hidden" name="no" value="<%=no%>">
		<input type="hidden" name="reip" value="<%=request.getRemoteAddr()%>">
		<p>제목:<input type="text" name="title" value="<%=e.getTitle()%>"></p>
		<p>작성자:<input type="text" name="writer" value="<%=e.getWriter()%>"></p>
		<p>내용:<textarea rows="10" cols="10" name="content"><%=e.getContent()%></textarea></p>
		<p>비밀번호:<input type="password" name="pwd" value="<%=e.getPwd()%>"></p>		
		<p>
			<input type="submit" value="글작성">
			<button onclick="useLocation(event)">목록</button>
		</p>
	</form>
</div>	
<script>
	function useLocation(e){
		e.preventDefault();
		location = "list.jsp;
	}
</script>
</body>
</html>