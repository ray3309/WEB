<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp -> View</title>
</head>
<body>
<%-- jsp 기초 
	선언부 , 스크립트릿 , 표현식 구분된다.
 --%> 
<h1>jsp : 서블릿이 복잡한 구문을 간소하기 위해서 개발한 웹 자바 </h1>
<%!
	//선언부 - 멤버필드 , 멤버메서드 
	private int num=10;
	public String test(int age){
		return "멤버 메서드의 반환값: 매개변수값:"+age;
	}
%>
<p>태그 영역</p>
<% //스트립트 릿 영역
	//service 메서드 영역 안 - 지역변수 , 메서드 호출  
   //브라우저에 출력 하기 
   //멤버영역의 변수나 정의한 메서드도 함께 사용할 수 있다.
    int age = 18; //지역변수
    out.println("멤버변수 값 :"+num +"<br>");
	out.println("당신의 나이는:"+test(age)+"<br>");
%>
<br>
<h2>표현식으로도 출력이 가능하다.</h2>
<p><%=num %>
<p><%=test(age) %></p>
</body>
</html>





