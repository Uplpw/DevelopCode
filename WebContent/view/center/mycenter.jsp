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
<link rel="stylesheet" href="/Agile/view/center/layui/css/myCss/loginMyCss.css" media="all">
</head>
<body>
<div class="imgAll1">
	<% 	
		ArrayList<TB_Collect> list=(ArrayList<TB_Collect>) request.getAttribute("list");{
		for(int i=0;i<list.size();i++){
	%>
	<p class="picture1">
		<img src="<%=list.get(i).getDishpicture() %>"/>
		<span class="title"><%=list.get(i).getDishname() %></span>
		<span class="price">￥<%=list.get(i).getDishprice().toString() %></span>
		<a class="canche" href="MyCenterAddDishServlet?dishpic=<%=list.get(i).getDishpicture() %>&dishname=<%=list.get(i).getDishname() %>&dishprice=<%=list.get(i).getDishprice() %>" target="optioncenter">加入餐车</a>
		<a  class="shoucang" href="MyCenterAddCollectServlet?dishpic=<%=list.get(i).getDishpicture() %>&dishname=<%=list.get(i).getDishname() %>&dishprice=<%=list.get(i).getDishprice() %>" target="optioncenter" >加入收藏</a>
	</p>
	<%		}
		} 
	%>
	
</div>
</body>
</html>