<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex10_confirm</title>
</head>
<body>
<script>
	let reply = confirm("정말 배경 이미지를 바꿀꺼야?");
	
	reply === true ? document.body.style.backgroundColor = "lightgreen" : document.body.style.backgroundColor = "lightcoral";
	
	console.log(reply);
</script>
</body>
</html>