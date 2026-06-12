<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="dao.BoardVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page trimDirectiveWhitespaces="true"%>
<%
response.setHeader("Access-Control-Allow-Origin","*");
response.setHeader("Access-Control-Allow-Methods","GET,POST,OPTIONS");
response.setHeader("Access-Control-Allow-Headers", "Content-Type");
response.setContentType("application/json");
response.setCharacterEncoding("UTF-8");

//DAO Load
//http://192.168.0.3:8080/Web_0601_AJAX/BoardDetail.jsp?num=2
int num = Integer.parseInt(request.getParameter("num"));

BoardVO v = BoardDao.getDao().getBoardDeatil(num);

ObjectMapper om = new ObjectMapper();
String jsonResp = om.writeValueAsString(v);
%>
<%=jsonResp%>