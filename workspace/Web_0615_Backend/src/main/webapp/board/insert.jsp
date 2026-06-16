<%@page import="ex2.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="vo" class="ex2.BoardVO"/>
<%--  param : request.getParameter() , property : setter--%>
<%--
<jsp:setProperty property="title" name="vo" param="title"/>
<jsp:setProperty property="writer" name="vo" param="writer"/>
<jsp:setProperty property="content" name="vo" param="content"/>
<jsp:setProperty property="reip" name="vo" param="reip"/>
<jsp:setProperty property="pwd" name="vo" param="pwd"/>
--%>
<!--  useBean 
VO, Param을 동일하게 해줘야 useBean에서 데이터를 자동으로 매핑 -->
<jsp:setProperty property="*" name="vo"/>
 <%-- 여기는 다른 객체 gett로 출력하기 위해서 vo의 주소를 매개변수로 전달--%>
 
 <%
 //BoardDao.getDao(): 싱글톤으로 객체가 생성되고 . addBoard(vo); 호출시에 vo의 주소값 전달 
 	BoardDao.getDao().addBoard(vo);
 %>
 <%-- 입력처리가 완료 된 수에 list.jsp로 이동 --%>
 <%
 	response.sendRedirect("list.jsp");
 %>
 
 
 