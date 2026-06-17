<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="dao.BoardVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>

<%
response.setHeader("Access-Control-Allow-Origin","*");
response.setHeader("Access-Control-Allow-Methods","GET,POST,OPTIONS");
response.setHeader("Access-Control-Allow-Headers", "Content-Type");
response.setContentType("application/json");
response.setContentType("text/html;char-set=UTF-8");
response.setCharacterEncoding("UTF-8");

//DAO Load
BoardDao dao = BoardDao.getDao();
List<BoardVO> list = dao.getList();

ObjectMapper om = new ObjectMapper();
String jsonResp = om.writeValueAsString(list);
%>
<%=jsonResp%>