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
<link href="/Agile/view/order/style/myCss.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
<div class="imgAll2">

	<% 
		ArrayList<TB_Dish> list = (ArrayList<TB_Dish>) request.getAttribute("list");
		{
		for(int i=0;i<list.size();i++){
	%>
	<p class="picture2">
		<img src="<%=list.get(i).getDishPicture() %>"/>
		<span class="title"><%=list.get(i).getDishName() %></span>
		<span class="price">￥<%=list.get(i).getDishPrice().toString() %></span>
		<a class="canche" href="OrderAddServlet?dishpic=<%=list.get(i).getDishPicture() %>&dishname=<%=list.get(i).getDishName() %>&dishprice=<%=list.get(i).getDishPrice() %>" target="optiondish">加入餐车</a>
		<a  class="shoucang" href="OrderAddMyCollect?dishpic=<%=list.get(i).getDishPicture() %>&dishname=<%=list.get(i).getDishName() %>&dishprice=<%=list.get(i).getDishPrice() %>" target="optiondish" >加入收藏</a>
		
	</p>
	<%		}
		} 
	%>

</div>
</body>
</html>