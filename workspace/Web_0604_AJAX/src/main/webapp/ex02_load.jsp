<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page trimDirectiveWhitespaces="true"%>
<%
response.setHeader("Access-Control-Allow-Origin","*");
response.setHeader("Access-Control-Allow-Methods","GET,POST,OPTIONS");
response.setHeader("Access-Control-Allow-Headers", "Content-Type");
response.setCharacterEncoding("UTF-8");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex2_load</title>
<style>
	table{
		width:100%;
		border-collapse: collapse;
	}
	td, th{
		border: 1px solid black;
	}
</style>
</head>
<body>
	<div style="width: 300px; margin: auto">
		<h1>Ajax load Data</h1>
		<div>
			<table>
				<thead>
					<tr>						
						<th>OrdNo</th>
						<th>Product</th>
						<th>Name</th>
					</tr>
				</thead>
				<tbody id="tbodys">
				<% for(int nLoop=0; nLoop < 8; nLoop++) {%>
					<tr>						
						<td><%=nLoop+1 %></td>
						<td>레고 버전<%=nLoop+1 %></td>
						<td>Ray</td>
					</tr>
				<%} %>
				</tbody>
				
				<tfoot>
					<tr>
						<th colspan="3">
							<button>Click</button>
						</th>
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
</body>
</html>