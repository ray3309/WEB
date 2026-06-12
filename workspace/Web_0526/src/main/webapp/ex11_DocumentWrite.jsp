<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex10_documentWrite</title>
</head>
<body>
	<script>
	let name = prompt('이름을 입력하세요');
	let age = prompt('나이를 입력', 30);	
	
	
	document.write("<b><big>" + name + "</big></b>님" + ", 나이 : <b><big>" + age +"</big></b>, 환영 합니다.");
	</script>
</body>
</html>

