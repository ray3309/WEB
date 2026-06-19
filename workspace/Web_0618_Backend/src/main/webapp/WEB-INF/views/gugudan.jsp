//gugudan.jsp

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gugudan.jsp</title>
<style>
table {margin: 20px auto; border-collapse: collapse;}
td {border: 1px solid #999; padding: 8px; text-align: center;}
th {background-color: #f0f0f0; padding: 8px;}
</style>
</head>
<body>
	<div style="width: 900px; margin: auto">
		<table>
			<h2>start : ${start}, end : ${end}</h2>
			<c:forEach var="j" begin="0" end="9">
				<tr>
					<c:forEach var="i" begin="${start}" end="${end}">
						<c:choose>
							<%-- 특정 단(dan)과 일치할 때: 지정된 배경색 적용 --%>
							<c:when test="${dan == i}">
								<td style="border: 1px solid; background-color: ${color};">
									<c:choose>
										<c:when test="${j == 0}">
											${i}단
										</c:when>
										<c:otherwise>
											${i} x ${j} = ${j * i}
										</c:otherwise>
									</c:choose>
								</td>
							</c:when>
							
							<%-- 일치하지 않을 때: 흰색 배경 적용 --%>
							<c:otherwise>
								<td style="border: 1px solid; background-color: white;">
									<c:choose>
										<c:when test="${j == 0}">
											${i}단
										</c:when>
										<c:otherwise>
											${i} x ${j} = ${j * i}
										</c:otherwise>
									</c:choose></td>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>