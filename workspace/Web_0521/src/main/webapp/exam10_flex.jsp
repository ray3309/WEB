<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam10_flex</title>
<%--https://cafe.naver.com/ictpasswordai/188 그대로 구현해보기 
 justify-content
 --%>
<link rel="stylesheet" href="css/flex.css">
 <style>
 
    /* Do it! 주축의 정렬 방법을 지정하는 #opt1 ~ #opt5 스타일 만들기 */
    #opt1{
      justify-content: flex-start;    /* 주축 시작점 기준으로 배치 */
    }
    #opt2{
      justify-content: flex-end;      /* 주축 끝점 기준으로 배치 */  
    }
    #opt3{
      justify-content: center;       /* 주축 중앙 기준으로 배치 */
    }
    #opt4{
      justify-content: space-between;      /* 시작점과 끝점 배치 후 중간 항목은 같은 간격으로 배치 */ 
    } 
    #opt5{
      justify-content: space-around;       /* 전체 항목을 같은 간격으로 배치 */ 
    }  
    #opt6{
      justify-content: space-evenly;       /* 전체 항목을 같은 간격으로 배치 */ 
    }   
  </style>

</head>
<body>
	<%
	int numA = 6;
	int numB = 4;
	for (int i = 0; i < numA; i++) {
	%>
	<div class="container" id="opt<%=i + 1%>">
		<%
		for (int j = 0; j < numB; j++) {
		%>
		<div class="box">
			<p><%=j + 1%></p>
		</div>
		<%
		}
		%>
	</div>
	<%
	}
	%>
</body>
</html>