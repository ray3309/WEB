<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%// java 영역
// 가상 메뉴 데이터 
	String[] menuData = {"메뉴1","마이메뉴2","메뉴3","메뉴4"};
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex09_display.jsp</title>
<style>
a {
	text-decoration: none;
}
a:link,a:visited,a:active {
	color: #000;
}

ul{
	list-style: none;
}
/* li 요소를 가로로 나란히 배치하기 */
nav ul li {
	display:inline-block;  /* 블록 레벨 요소 성격을 가지면서 가로로 배치 */
	width: 100px; height: 40px;
	line-height: 40px;   /* 세로로 중앙 배치 */
	text-align: center;  /* 가로로 중앙 배치 */
	margin: 10px; /*  마진 - 10px */
	border: 1px solid black; /*  테두리 - 1px 검은 실선 */  

}
/*메뉴에 마우스를 올렸을 때 배경색을 지정하고 글씨 색상도 변경 */
nav ul li:hover{
	background-color: pink;
}
a:hover{
	color: white;
}
</style>
</head>
<body>
	<nav>
		<ul>
			<% 
			//그동안 했던 배열을 foreach문으로 배열의 요소를 하나씩 빼서
			//<%=e =>결과를 브라우저로 출력 
			for(String e : menuData) {
			
			%>
			<li><a href="ex9_server.jsp"><%=e %></a></li>
			<%} %>
<!-- 			<li><a href="ex9_server.jsp">메뉴2</a></li> -->
<!-- 			<li><a href="ex9_server.jsp">메뉴3</a></li> -->
<!-- 			<li><a href="ex9_server.jsp">메뉴4</a></li> -->
		</ul>
	</nav>
</body>
</html>