<%@page import="board.BoardVO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
Model 1방식 javaBean으로 분리하는 방식 , 리액트때 한번쯤은 해본 방식 
1.Param -> VO
2.VO -> Dao [JDBC,MyBatis,JPA등 ]
 --%>
 <% //name=title =>점심시간 입니다. submit 
 	String title = request.getParameter("title");
 	BoardVO v = new BoardVO();
 	v.setTitle(title);
 	v.setWriter(request.getParameter("writer"));
 	v.setContent(request.getParameter("content"));
 	v.setPwd(request.getParameter("pwd"));
 	v.setReip(request.getParameter("reip"));
 %>
 <%-- 여기는 다른 객체 gett로 출력 --%>
 <h2>저장해둔 VO의 값 출력 :<%=v.getTitle() %></h2>
 <p><%=v.getWriter() %></p>
 <p><%=v.getContent() %></p>
 <p><%=v.getPwd() %></p>
 <p><%=v.getReip() %></p>
