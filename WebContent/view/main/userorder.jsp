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
<title>userorder</title>
<link href="/Agile/view/main/css/style1.css" rel="stylesheet" type="text/css" />
</head>
<body>
<nav class="U-nav Font14 FontW">
  <ul>
   <li><i></i><a href="user_center.html">用户中心首页</a></li>
   <li><i></i><a href="user_orderlist.html">收货地址</a></li>
   <li><i></i><a href="user_address.html">我的订单</a></li>
   <li><i></i><a href="user_message.html">我的收藏</a></li>
   <li><i></i><a href="user_coupon.html">账户管理</a></li>
  </ul>
 </nav>
 <article class="U-article Overflow">
  <!--user order list-->
  <section>
    <table class="Myorder">
     <th class="Font14 FontW">订单编号</th>
     <th class="Font14 FontW">下单时间</th>
     <th class="Font14 FontW">收件人</th>
     <th class="Font14 FontW">订单总金额</th>
     <th class="Font14 FontW">订单状态</th>
     <th class="Font14 FontW">操作</th>
        <%
			ArrayList<TB_Personalorder> list=(ArrayList<TB_Personalorder>)request.getAttribute("list"); 
			for(int i=0;i<list.size();i++){
		%>
			<tr>
				<td class="FontW">
					<%=list.get(i).getId() %>
				</td>
					
				<td >
					<%=list.get(i).getOrdertime() %>
				</td>
					
				<td><%=list.get(i).getUsername() %>
				</td>
				
				<td>￥<%=list.get(i).getAmount() %>
				</td>			
                <td >未付款,未发货</td>
                <td><a href="#">取消订单</a> | <a href="#">付款</a></td>
            </tr>
		<%} %>	
      </table>
    <div class="TurnPage">
         <a href="#">
          <span class="Prev"><i></i>首页</span>
         </a>
         <a href="#"><span class="PNumber">1</span></a>
         <a href="#"><span class="PNumber">2</span></a>
         <a href="#">
         <span class="Next">最后一页<i></i></span>
        </a>
       </div>
  </section>
 </article>
</body>
</html>