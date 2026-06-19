<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customerForm</title>
<style>
    form { width: 400px; margin: auto; padding: 20px; 
    border: 1px solid #ccc; border-radius: 10px; }
    p { margin-bottom: 10px; }
    label { display: inline-block; width: 80px; }
    input[type!="submit"] {
        width: 250px;
        padding: 5px;
    }
    input[type="submit"] {
        margin-top: 10px;
        padding: 8px 20px;
    }
</style>
</head>
<body>
<h2 style="text-align: center;">고객 정보 입력</h2>
<form method="post" action="ex1_customer">
    <p>
        <label>이름</label>
        <input type="text" name="name" value="자드" required>
    </p>
    <p>
        <label>이메일</label>
        <input type="email" name="email" value="ray3309@gmail.com" required>
    </p>
    <p>
        <label>전화번호</label>
        <input type="tel" name="phone" value="010-2734-8281" required>
    </p>
    <p style="text-align: center;">
        <input type="submit" value="등록">
    </p>
</form>
</body>
</html>