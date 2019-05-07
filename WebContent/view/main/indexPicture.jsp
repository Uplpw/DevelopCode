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
<link rel="stylesheet" href="/Agile/view/main/layui/css/myCss/loginMyCss.css" media="all">
</head>
<body>
<div class="imgAll1">
	<% //ArrayList<TB_Dish> list=(ArrayList<TB_Dish>)request.getAttribute("list");
	Page pp = (Page)request.getAttribute("page");
	ArrayList<TB_Dish> list=(ArrayList<TB_Dish>)request.getAttribute("dish");
	System.out.println(list.size());
	{
		for(int i=0;i<list.size();i++){ 
	%>
	<p class="picture1">
		<img src="<%=list.get(i).getDishPicture() %>"/>
		<span class="title"><%=list.get(i).getDishName() %></span>
		<span class="price">￥<%=list.get(i).getDishPrice().toString() %></span>
		<a class="canche" href="AddDish?dishpic=<%=list.get(i).getDishPicture() %>&dishname=<%=list.get(i).getDishName() %>&dishprice=<%=list.get(i).getDishPrice() %>" target="_top">加入餐车</a>
		<!-- <a  class="canche" href="加入餐车" >加入餐车</a> -->
		<a  class="shoucang" href="加入餐车" >加入收藏</a>
		<!-- 加入餐车借鉴搜索中的 -->
	</p>
	<%		}
		} 
	%>
	
	<a   href="/Agile/QueryDishByPageServlert?currentPage=<%=pp.getCurrentPage()-1 %>&pageSize=6" >上一页</a>
	<input value="<%=pp.getCurrentPage() %>" readonly="readonly"/>
	/
	<input value="<%=pp.getTotalPage() %>" readonly="readonly"/>
	<a   href="/Agile/QueryDishByPageServlert?currentPage=<%=pp.getCurrentPage()+1 %>&pageSize=6" >下一页</a>
	<!-- <p class="picture1">
		<img src="http://pic1.win4000.com/wallpaper/9/5450ae2fdef8a.jpg"/>
		<span class="title">老李家的糖醋鲤鱼</span>
		<span class="price">￥60</span>
	</p>
	<p class="picture1">
		<img src="http://pic1.win4000.com/wallpaper/9/5450ae2fdef8a.jpg"/>
		<span class="title">老李家的糖醋鲤鱼</span>
		<span class="price">￥60</span>
	</p>
	<p class="picture1">
		<img src="http://pic1.win4000.com/wallpaper/9/5450ae2fdef8a.jpg"/>
		<span class="title">老李家的糖醋鲤鱼</span>
		<span class="price">￥60</span>
	</p>
	<p class="picture1">
		<img src="http://pic1.win4000.com/wallpaper/9/5450ae2fdef8a.jpg"/>
		<span class="title">老李家的糖醋鲤鱼</span>
		<span class="price">￥60</span>
	</p>
	<p class="picture1">
		<img src="http://pic1.win4000.com/wallpaper/9/5450ae2fdef8a.jpg"/>
		<span class="title">老李家的糖醋鲤鱼</span>
		<span class="price">￥60</span>
	</p> -->
</div>
</body>
</html>