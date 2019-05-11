<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.it.Agile.bean.*"%>
<%@page import="com.it.Agile.daoBase.*"%>
<%@page import="com.it.Agile.daoBase.impl.*"%>
<%@page import="java.util.*"%>
<%@page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link href="/Agile/view/center/css/style1.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
	<article class="U-article Overflow">
		<!--user order list-->
		<section>
			<table class="Myorder" style="margin-top:50px">
				<th class="Font14 FontW">订单编号</th>
				<th class="Font14 FontW">下单时间</th>
				<th class="Font14 FontW">收件人</th>
				<th class="Font14 FontW">订单总金额</th>
				<th class="Font14 FontW">订单状态</th>
				<th class="Font14 FontW">操作</th>
				<%
					ArrayList<TB_Record> list = (ArrayList<TB_Record>) request.getAttribute("list");
					for (int i = 0; i < list.size(); i++) {
				%>
				<tr>
					<td class="FontW"><%=list.get(i).getPk() %></td>

					<td><%=list.get(i).getOrdertime() %></td>

					<td><%=list.get(i).getUsername()%></td>

					<td>￥<%=list.get(i).getDishprice()%>
					</td>
					<td>已发货</td>
					<%if(list.get(i).getStatus().equals("0")) {%>
						<td><a href="/Agile/ConfirmOrderServlet?pk=<%=list.get(i).getPk() %>" style="color:blue" target="optioncenter">确认收货</a></td>
					<%}else { %>
						<td><a href="#">已收货</a></td>
					<%} %>
				</tr>
				<%
					}
				%>
			</table>
			<!-- <div class="TurnPage">
				<a href="#"> <span class="Prev"><i></i>首页</span>
				</a> <a href="#"><span class="PNumber">1</span></a> <a href="#"><span
					class="PNumber">2</span></a> <a href="#"> <span class="Next">最后一页<i></i></span>
				</a>
			</div> -->
		</section>
	</article>
</body>
</html>