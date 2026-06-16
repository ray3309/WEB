<%@ page import="ex2.BoardDao" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
//
<jsp:useBean id="vo" class="ex2.BoardVO"/>
<jsp:setProperty property="*" name='vo'/>
<% String ct = request.getParameter("ct"); %>

<%
if(ct.equals("up") || ct.equals("del")){
	int resNum = BoardDao.getDao().checkpass(vo);
	
	if(0 == resNum){
		out.println("<p style=\"color:red\">잘못된 비밀번호</p>");		
	}else{
		//수정폼으로 전달
		response.sendRedirect(ct.equals("up") ? "upform.jsp?no="+vo.getNo() :
												"delBoard.jsp?no="+vo.getNo());
	}
}
 %>