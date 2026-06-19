<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex4_jstl_for</title>
<style>
	table { margin: 10px auto; border-collapse: collapse;}
	td { border: 1px solid #999; padding: 8px; text-align: center;}
</style>
</head>
<body>
	<div style="width: 300px; margin: auto">
		<table>
		<%-- foreach : begin, end, step, varState, var, items --%>
			<c:forEach begin="1" end="10" step="1" varStatus="i">
			<tr>
				<td>${i.count} / ${i.index}</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>