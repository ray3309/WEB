<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Password Check</title>
</head>
<body>
    <div style="width: 350px; margin: auto;">
        <h2>비밀번호 확인</h2>
        <p>번호 : ${no} / 처리 : ${ct == 'up' ? '수정' : '삭제'}</p>

        <c:if test="${not empty msg}">
            <p style="color:red">${msg}</p>
        </c:if>

        <form action="board.ict" method="post">
            <input type="hidden" name="cmd" value="boardPwdchk">
            <input type="hidden" name="no" value="${no}">
            <input type="hidden" name="ct" value="${ct}">
            <p>
                비밀번호 : <input type="password" name="pwd" id="pwd" required>
                <button type="submit">확인</button>
                <button type="button" onclick="location='board.ict?cmd=boardDetail&no=${no}'">취소</button>
            </p>
        </form>
    </div>
</body>
</html>
