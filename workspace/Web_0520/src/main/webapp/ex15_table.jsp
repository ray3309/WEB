<%@page import="ex1.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ex1.ProductModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex15_table.jsp</title>
<style>
table {
	caption-side: bottom; /* 표 캡션 위치 : 표 아래에서 표기됨  */
	border: 1px solid #ccc;
	width: 450px;
	margin: auto;
	/*
		collapse : 표와 셀의 테두리를 합쳐서 표시하겠다. *****
		separate : 표와 셀의 테두리를 따로 표시 (기본값)
    */
	border-collapse: collapse;
}

td, th {
	border: 1px solid #ccc;
	padding: 10px; /* 셀 테두리와 내용 사이의 여백 */
	text-align: center; /* 셀 내용 가운데 정렬 */
}
</style>
</head>
<body>
<%
	//사용하고 싶은 객체를 생성하고
	ProductModel ref = new ProductModel();
	//반복의 데이터로 반환받아서 아래서 적용
	ArrayList<ProductVO> plist = ref.getProduct();
%>

	<h2>상품 구성</h2>
	<table>
		<caption>상품 목록 예제</caption>
		<thead>
			<tr>
				<th>용도</th>
				<th>중량</th>
				<th>갯수</th>
				<th>가격</th>
			</tr>
		</thead>
		<tbody>
		<!-- 반복 시작 -->
		<% for(ProductVO e : plist){%>
			<tr>
				<td><%=e.getNum() %></td>
				<td><%=e.getWeight() %></td>
				<td><%=e.getQty() %></td>
				<td><%=e.getPrice() %></td>
			</tr>
		<% }%>
		<!--  반복 끝 -->	
		</tbody>
		<tfoot>
			<tr>
				<td colspan="4"><button>확인</button></td>
			</tr>
		</tfoot>
	</table>
</body>
</html>