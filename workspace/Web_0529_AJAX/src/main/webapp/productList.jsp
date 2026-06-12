<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="dao.productDao"%>
<%@page import="vo.ProductVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>select 테스트</h1>
	<%
		List<ProductVO> plist = productDao.getDao().getProduct();
	%>
	<%for(ProductVO e : plist) {%>
	<p> <img src="img/<%= e.getImg() %>" width="100"> / <%=e.getNum() %> / <%=e.getPtitle() %> / <%=e.getPrice() %> 원 /  </p>
	<%} %>
	
</body>
</html>