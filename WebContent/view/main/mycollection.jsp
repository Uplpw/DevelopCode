<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
</head>
<body>
<body>
<div class="collectionAll1">
	<% ArrayList<TB_Collection> list=(ArrayList<TB_Collection>)request.getAttribute("list");{
		for(int i=0;i<list.size();i++){
	%>
	<p class="picture1">
		<img src="<%=list.get(i).getDishpicture() %>"/>
		<span class="title"><%=list.get(i).getDishname().toString() %></span>
		<span class="price">￥<%=list.get(i).getDishprice().toString() %></span>
		<a class="canche" href="AddDish?dishpic=<%=list.get(i).getDishpicture() %>&dishname=<%=list.get(i).getDishname() %>&dishprice=<%=list.get(i).getDishprice() %>" target="_top">加入餐车</a>
		<!-- <a  class="canche" href="加入餐车" >加入餐车</a> -->
		
		<!--<a  class="shoucang" href="加入餐车" >加入收藏</a>-->
		
		<!-- 加入餐车借鉴搜索中的 -->
	</p>
	<%		}
		} 
	%>
	
</div>

</body>
</html>
