<%@page import="ex1.GroupTourModel"%>
<%@page import="ex1.GroupTourVO"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- header.jsp 파일 포함 -->
<%@include file="header.jsp"%>

<%
	//사용하고 싶은 객체를 생성하고
	GroupTourModel ref = new GroupTourModel();
	//반복의 데이터로 반환받아서 아래서 적용
	ArrayList<GroupTourVO> plist = ref.tourReadData();
%>

<main class="contents">
	<section class="gallery">
		<%for(GroupTourVO e : plist) { %>
		<figure>
			<img alt="<%=e.getTourTitle()%>>" src=images/<%=e.getTourImagePath()%>>
			<figcaption><%=e.getTourTitle() + "/" + e.getTourWriter()%></figcaption>
		</figure>
		<%} %>

	</section>
</main>

<!-- footer.jsp 파일 포함 -->
<%@include file="footer.jsp"%>
</body>
</html>