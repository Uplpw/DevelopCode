<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.it.Agile.bean.*"%>
<%@page import="com.it.Agile.daoBase.*"%>
<%@page import="com.it.Agile.daoBase.impl.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/Agile/view/main/layui/css/layui.css"
	media="all">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<TB_Rank> rank = (ArrayList<TB_Rank>) request.getAttribute("rank");
	%>
	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 30px;">
		<legend>销量排行榜</legend>
	</fieldset>
	<ul class="layui-timeline">
		<%
			if (rank.size() != 0) {
				for (int k = 0; k < 10; k++) {
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
	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 30px;">
	</fieldset>
</body>
</html>