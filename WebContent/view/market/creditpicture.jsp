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
<link href="/Agile/view/market/style/myCss.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
<!-- 用来显示可兑换的照片  -->
<div class="imgAll2">
	<%
	ArrayList<TB_Exchange> list = (ArrayList<TB_Exchange>) request.getAttribute("list");{
		for(int i=0;i<list.size();i++){
	%>
	<p class="picture2">
		<img src="<%=list.get(i).getExchangepicture() %>"/>
		<span class="title"><%=list.get(i).getExchangename() %></span>
		<span class="price"><%=list.get(i).getExchangecredit() %>积分</span>
		<a class="canche" href="ExchangeNowServlet?dishpic=<%=list.get(i).getExchangepicture() %>
			&dishname=<%=list.get(i).getExchangename() %>&dishprice=<%=list.get(i).getExchangecredit() %>&type=<%=request.getAttribute("type") %>" 
			target="optionmarket">立即兑换</a>
	</p>
	<%		}
		} 
	%>
	</div>
</body>
</html>