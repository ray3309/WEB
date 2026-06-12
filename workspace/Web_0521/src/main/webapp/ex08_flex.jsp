<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- html주석입니다. -->
<%--  jsp 주석 : 브라우저에 안보인다.  --%>    
<%
//지역변수
String msg = "안녕하세요 Flex수업!"; 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex8_flex</title>
<link rel="stylesheet" href="css/myflex.css">
<style>
/* 요소들을 메뉴, 상품등 배치 , 컨테이너즉 부모를   display:flex;  */
/* 	.container{  display:flex; /* 플렉스 컨테이너 지정 */ */
/* 		background-color:#eee; border:1px solid #222; margin-bottom:30px; */
/* 	  } */
/* 	.box{ */
/* 	  padding:5px 45px; margin:5px; width:80px;   */
/* 	} */
/* 	.box:nth-child(odd){ */
/* 		background-color: rgb(255, 187, 0); */
/* 	} */
/* 	.box:nth-child(even){ */
/* 		background-color: rgb(35, 220, 35); */
/* 	} */
/* 	p { */
/*       text-align: center; */
/*       font-weight: bold; */
/*     } */
	#opt1{
		flex-direction: row;          /* 왼쪽에서 오른쪽으로 */ 
	}
	#opt2{
		flex-direction: row-reverse;   /* 오른쪽에서 왼쪽으로 */
	}
	#opt3{
		flex-direction: column;  /* 위에서 아래로 */
	}
	#opt4{
		flex-direction: column-reverse;  /* 아래에서 위로 */
	}
</style>
</head>
<body>
  <h1><%=msg %></h1>
  <% for(int i=0; i<4; i++){%>
  <div class="container" id="opt<%=i+1%>">
    <div class="box"><p>1</p></div>
    <div class="box"><p>2</p></div>
    <div class="box"><p>3</p></div>
  </div>
  <%} %>
  
</body>
</html>