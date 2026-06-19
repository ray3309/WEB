<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
</head>
<body>
<div style="width:450px; margin:auto;">
    <h2>게시글 수정</h2>
    <form method="post" action="board.ict">
        <input type="hidden" name="cmd" value="boardUpdate">
        <input type="hidden" name="no" value="${vo.no}">
        <input type="hidden" name="reip" value="<%=request.getRemoteAddr()%>">

        <p>제목:<input type="text" name="title" value="${vo.title}" required></p>
        <p>작성자:<input type="text" name="writer" value="${vo.writer}" required></p>
        <p>내용:<textarea rows="10" cols="30" name="content" required>${vo.content}</textarea></p>
        <p>비밀번호:<input type="password" name="pwd" value="${vo.pwd}" required></p>
        <p>
            <input type="submit" value="수정완료">
            <button type="button" onclick="location='board.ict?cmd=boardDetail&no=${vo.no}'">취소</button>
        </p>
    </form>
</div>
</body>
</html>
