<%@page import="ex01.ProductVO"%>
<%@page import="ex01.ProductModel"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>

<%
	//사용하고 싶은 객체를 생성하고
	ProductModel ref = ProductModel.getpModel();
	//반복의 데이터로 반환받아서 아래서 적용
	ArrayList<ProductVO> plist = ref.getProList();	
%>

</head>
<body>
	<div id="contatiner">
		<h1></h1>
		<ul class="prod-list">
			<%for(ProductVO e : plist) { %>		
			<li>
				<img src="<%=e.getImg()%>">
				<div class="caption">
					<h2><%=e.getPtitle()%></h2>
					<p><%=e.getPcont()%></p>
					<p><%=e.getPrice()%></p>
					<p><%=e.getPdate()%></p>
					
					<!--<h2>타이틀</h2>-->
					<!--<p>내용</p>-->
					<!--<p>가격:50000원</p>-->
				</div>
			</li>		
			<%} %>	
		</ul>
	</div>
</body>
</html>