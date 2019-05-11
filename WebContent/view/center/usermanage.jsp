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
<link rel="stylesheet" href="/Agile/view/center/layui/css/layui.css"
	media="all">
<link href="/Agile/view/center/css/style1.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
	<div class="layui-row">
		<div class="layui-col-md9">
			<div class="grid-demo grid-demo-bg1">
				<article class="U-article Overflow">
					<%
						ArrayList<TB_UserInfo> list = (ArrayList<TB_UserInfo>) request.getAttribute("list");
					%>
					<section class="AccManage Overflow">
						<h1 style="text-align:center;font-size: 18px;color:blue; margin-top:30px"><%=list.get(0).getPetname() %> 欢迎来到账户管理</h1>
						<br><br><br>
						<%-- <img style="width:100px;height:100px" src="<%=list.get(0).getUserpicture()%>" width="150"
							height="150" /> --%>
						<form action="ChangeUserinfoservlet" method="post">
							<table style="align: center">
								<tr>
									<td width="30%" align="right">修改头像：</td>
									<td><input name="img" id="img" type="file">
								</tr>
								<tr>
									<td width="30%" align="right">修改昵称：</td>
									<td><input type="text" name="petname" id="petname"
										value="<%=list.get(0).getPetname()%>"></td>
								</tr>
								<tr>
									<td width="30%" align="right">修改密码：</td>
									<td><input type="password" name="pwd" id="pwd" value="<%=request.getAttribute("userpwd") %>"></td>
								</tr>
								<tr>
									<td width="30%" align="right">修改电话：</td>
									<td><input type="tel" name="phone" id="phone"
										value="<%=list.get(0).getUsertelephone()%>"></td>
								</tr>
								<tr>
									<td></td>
									<td><input type="submit" value="保 存"></td>
								</tr>
							</table>
						</form>
					</section>
				</article>
			</div>
		</div>
	</div>
</body>
</html>