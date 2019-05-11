<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.it.Agile.bean.*"%>
<%@page import="com.it.Agile.daoBase.*"%>
<%@page import="com.it.Agile.daoBase.impl.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/Agile/view/main/layui/css/layui.css"
	media="all">
<title>订单公告</title>
</head>
<body>

	<%
	ArrayList<TB_PersonalOrder> orderlist = (ArrayList<TB_PersonalOrder>) request.getAttribute("orderlist");
	%>

	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 30px;">
		<legend>订单公告</legend>
	</fieldset>
	<ul class="layui-timeline">
		<%
		if (orderlist.size()!=0) {	
			for (int k = orderlist.size() - 1; k > (orderlist.size() - 4); k--) {
		%>
		<li class="layui-timeline-item"><i
			class="layui-icon layui-timeline-axis"></i>
			<div class="layui-timeline-content layui-text">
				<h3 class="layui-timeline-title"></h3>
				<p>
					订单编号：<%=orderlist.get(k).getId()%>
					<br>收件人&nbsp;&nbsp;&nbsp;：用户<%=orderlist.get(k).getUsername()%>
					<br>订单状态：已签收 <i class="layui-icon"></i>
				</p>
			</div></li>
		<%
			}}
		%>

	</ul>

	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 30px;"></fieldset>
</body>
</html>