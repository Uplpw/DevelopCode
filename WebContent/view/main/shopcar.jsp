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
<link href="/Agile/view/main/style/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="/Agile/view/main/js/public.js"></script>
<script type="text/javascript" src="/Agile/view/main/js/jquery.js"></script>
<script type="text/javascript" src="/Agile/view/main/js/jqpublic.js"></script>
<script type="text/javascript" src="/Agile/view/main/js/cart.js"></script>
</head>
<body>
	<form action="#">
		<div class="gwc" style="margin: auto;">
			<table cellpadding="0" cellspacing="0" class="gwc_tb1">
				<tr>
					<td class="tb1_td1"><input id="Checkbox1" type="checkbox"
						class="allselect" /></td>
					<td class="tb1_td1">全选</td>
					<td class="tb1_td3">商品</td>
					<td class="tb1_td4">单价</td>
					<td class="tb1_td5">数量</td>
					<td class="tb1_td6">总额</td>
					<td class="tb1_td7">操作</td>
				</tr>
			</table>
			<%
				ArrayList<TB_Shop> list=(ArrayList<TB_Shop>)request.getAttribute("list"); 
				for(int i=0;i<list.size();i++){
			%>
			<table cellpadding="0" cellspacing="0" class="gwc_tb2" id="table1">
				<tr>
					<td class="tb2_td1">
						<input type="checkbox" value="1" name="newslist" id="newslist-1" />
					</td>
					
					<td class="tb2_td2">
						<!-- <a href="" target=""><img src="upload/01.jpg" /></a> 是否可点击-->
						<img src="<%=list.get(i).getDishpicture() %>" />
					</td>
							
					<td class="tb2_td3" >
						<%=list.get(i).getDishname() %> 
						<!-- <a href="" target="_blank">酸辣土豆丝</a> 是否可点击--->
					</td>
					
					<td class="tb1_td4">￥<%=list.get(i).getDishprice() %></td>
					
					<td class="tb1_td5">
						<input id="min1" name="" style="width: 30px; height: 30px; border: 1px solid #ccc;"
									type="button" value="-" /> 
						<input id="text_box1" name="" type="text" value="1"
									style="width: 40px; height: 28px; text-align: center; border: 1px solid #ccc;"/>
						<input id="add1" name="" style="width: 30px; height: 30px; border: 1px solid #ccc;"
									type="button" value="+"/>
					</td>
					<td class="tb1_td6"><label id="total1" class="tot"
						style="color: #ff5500; font-size: 14px; font-weight: bold;"></label></td>
						
					<td class="tb1_td7"><a href="#" id="delcart1">删除</a></td>
				</tr>
			</table>
			<%} %>
			<table cellpadding="0" cellspacing="0" class="gwc_tb3">
				<tr>
					<td class="tb1_td1">
						<input id="checkAll" class="allselect" type="checkbox" />
					</td>
					<td class="tb1_td1">全选</td>
					<td class="tb3_td1">
						<!-- <input id="invert" type="checkbox" /> 反选 -->
						<input id="cancel" type="checkbox" /> 取消
					</td>
					
					<td class="tb3_td2">已选商品 <label id="shuliang"
						style="color: #ff5500; font-size: 14px; font-weight: bold;">0</label>
						件
					</td>
					<td class="tb3_td3">合计:<span>￥</span>
						<span style="color: #ff5500;">
							<label id="zong1" style="color: #ff5500; font-size: 14px; font-weight: bold;"> 
							</label>
						</span>
					</td>
					<td class="tb3_td4">
						<span id="jz1">结算</span>
						<a href="#" style="display: none;" class="jz2" id="jz2">结算</a>
					</td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>