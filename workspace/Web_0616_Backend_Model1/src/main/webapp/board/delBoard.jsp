<%@page import="board.BoardVO"%>
<%@page import="board.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="vo" class="board.BoardVO"/>
<jsp:setProperty property="*" name="vo"/>

 <%
 	int no = Integer.parseInt(request.getParameter("no"));

	BoardDao.getDao().RemoveBoard(no);
 %>
 
 <%-- 입력처리가 완료 된 수에 list.jsp로 이동 --%>
 <%
 	response.sendRedirect("list.jsp");
 %>