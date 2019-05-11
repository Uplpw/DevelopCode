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
<title></title>
<link href="/Agile/view/order/style/myCss.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
	<div class="imgAll2">
	<% String type=(String)request.getAttribute("type");
	Page pp = (Page) request.getAttribute("page");
	ArrayList<TB_Dish> list = (ArrayList<TB_Dish>) request.getAttribute("dish");{
		for(int i=0;i<list.size();i++){
	%>
	<p class="picture2">
		<img src="<%=list.get(i).getDishPicture() %>"/>
		<span class="title"><%=list.get(i).getDishName() %></span>
		<span class="price">￥<%=list.get(i).getDishPrice().toString() %></span>
		<a class="canche" href="AddMyShopCarServlet?dishpic=<%=list.get(i).getDishPicture() %>&dishname=<%=list.get(i).getDishName() %>&dishprice=<%=list.get(i).getDishPrice() %>" target="_top">加入餐车</a>
		<a  class="shoucang" href="AddMyCollectServlet?dishpic=<%=list.get(i).getDishPicture() %>&dishname=<%=list.get(i).getDishName() %>&dishprice=<%=list.get(i).getDishPrice() %>" target="_top" >加入收藏</a>
	</p>
	<%		}
		} 
	%>
	<p style="position:relative;text-align:center; width:100%; height:50px; margin-top:20px">
		<a
			href="/Agile/DishCategoryServlet?currentPage=<%=pp.getCurrentPage() - 1%>&pageSize=8&type=index"
			target="optiondish">上一页</a> <input style="width:50px;text-align: center;" value="<%=pp.getCurrentPage()%>"
			readonly="readonly" />&nbsp;/&nbsp;<input style="width:50px;text-align: center;" value="<%=pp.getTotalPage()%>"
			readonly="readonly" /> <a
			href="/Agile/DishCategoryServlet?currentPage=<%=pp.getCurrentPage() + 1%>&pageSize=8&type=index"
			target="optiondish">下一页</a>
	</p>
</div>
</body>
</html>