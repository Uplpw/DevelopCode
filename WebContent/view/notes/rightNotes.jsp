<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.it.Agile.bean.*"%>
<%@page import="com.it.Agile.daoBase.*"%>
<%@page import="com.it.Agile.daoBase.impl.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="/Agile/view/main/layui/css/myCss/loginMyCss.css" media="all">
<link rel="stylesheet" href="/Agile/view/main/layui/css/layui.css"
	media="all">
</head>
<body>
	<%-- <form action="/Agile/PersonalOrderServlet" style="display: none"
		name="myForm">
		<input type="text" name="type" value="rightNotes"> <input
			type="submit">
	</form>
	<script type="text/javascript">
		
	<%ArrayList<TB_PersonalOrder> orderlist = (ArrayList<TB_PersonalOrder>) request.getAttribute("orderlist");
			if (orderlist == null) {%>
		document.myForm.submit();
	<%}%>
	</script> --%>
	<div class="rightNotes">
		<div class="resNotes">
			<a href="/Agile/ResNotesServlet" target="optionleft">餐厅公告</a> <br />
			<%-- <%
				if (au != null) {
			%> --%>
			<ul class="layui-timeline">
				<li class="layui-timeline-item"><i
					class="layui-icon layui-timeline-axis"></i>
					<div class="layui-timeline-content layui-text">
						<p>
							<%
								TB_AboutUs au = (TB_AboutUs) request.getAttribute("au");
							%>
							<span> <%=au.getContent()%>
							</span>
						</p>
					</div></li>
			</ul>
		</div>

		<div class="orderNotes">
			<a href="/Agile/PersonalOrderServlet" target="optionleft">订单公告</a>
			<ul class="layui-timeline">
				<li class="layui-timeline-item"><i
					class="layui-icon layui-timeline-axis"></i>
					<div class="layui-timeline-content layui-text">
						<h3 class="layui-timeline-title"></h3>
						<p>
							<%
								ArrayList<TB_PersonalOrder> orderlist = (ArrayList<TB_PersonalOrder>) request.getAttribute("orderlist");
								if (orderlist.size() != 0) {
							%>
							订单编号：<%=orderlist.get(orderlist.size() - 1).getId()%>
							<br> 收件人&nbsp;&nbsp;&nbsp;：用户<%=orderlist.get(orderlist.size() - 1).getUsername()%>
							<br> 订单状态：已签收 <i class="layui-icon"></i>
							<%
								}
							%>
						</p>
					</div></li>
			</ul>
		</div>
		<div class="saleRank">
			<a href="/Agile/SaleRankServlet" target="optionleft">销售排行</a>
			<ul class="layui-timeline">
				<%
					ArrayList<TB_Rank> rank = (ArrayList<TB_Rank>) request.getAttribute("rank");
					if (rank.size() != 0) {
						for (int k = 0; k < 3; k++) {
				%>
				<li class="layui-timeline-item"><i
					class="layui-icon layui-timeline-axis"></i>
					<div class="layui-timeline-content layui-text">
						<h3 class="layui-timeline-title"></h3>
						<p>
							第<%=k + 1%>名<i class="layui-icon"></i>
							<%=rank.get(k).getDishname()%>
						</p>
					</div></li>
				<%
					}
					}
				%>
			</ul>
		</div>
	</div>
	<script type="text/javascript">
	</script>
</body>
</html>