<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex9_flex</title>
<%-- 반복적인 스타일은 외부 CSS로 분리하기  --%>
<link rel="stylesheet" href="css/myflex.css">
<style>
/*wrap은 화면의 범위가 좁아지면 부모를 못벗어 난다. (공통사항)*/
/* 줄바꿈을 지정하는 #opt1 ~ #opt3 스타일 */
/* 한 줄에 표시
 #opt1 { 
	flex-wrap: nowrap; 
 }
 */ 
 /* 여러 줄에 표시 
 #opt2 { 
	flex-wrap: wrap; 
 }
 */
 /* 시작점과 끝점 바꿔 여러 줄에 표시 
 #opt3 { 
	flex-wrap: wrap-reverse; 
 }
 */
 /* 줄바꿈을 지정하는 #opt1 ~ #opt3 스타일 */
/* 왼쪽에서 오른쪽, 여러 줄 */  
	#opt1{
		flex-flow: row wrap;
	}
/* 왼쪽에서 오른쪽, 한 줄 */  
   #opt2{
      flex-flow: row nowrap;         
    }    
</style>
</head>
<body>

<%for(int i = 0; i < 3; i++){ %>
<div class="container" id="opt<%=i+1%>">
		<div class="box">
			<p>1</p>
		</div>
		<div class="box">
			<p>2</p>
		</div>
		<div class="box">
			<p>3</p>
		</div>
		<div class="box">
			<p>4</p>
		</div>
		<div class="box">
			<p>5</p>
		</div>
		<div class="box">
			<p>6</p>
		</div>
</div>
<%} %>
</body>
</html>