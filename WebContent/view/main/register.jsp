<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.it.Agile.bean.*"%>
<%@page import="com.it.Agile.daoBase.*"%>
<%@page import="com.it.Agile.daoBase.impl.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<!-- 由于该页面请求转发而来，所以需要使用根路径来获取css等文件的地址，否则会出现地址错误
	 request.getContextPath()也可以拿到根路径，但是前面不需要加上/符号 -->
<link rel="stylesheet" href="/Agile/view/main/layui/css/layui.css"
	media="all">
<link rel="stylesheet"
	href="/Agile/view/main/layui/css/myCss/loginMyCss.css" media="all">
<script src="/Agile/view/main/layui/layui.all.js"></script>
<script type="text/javascript">
	function validate() {
		var username = document.getElementById("username");
		var password = document.getElementById("password");
		var usernamePattern = /^[0-9]*$/;
		if (username.value == "") {
			alert("账号不能为空！");
			username.focus();
			return false;
		}
		if (password.value == "") {
			alert("密码不能为空！");
			password.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<%
		ArrayList<TB_Picture> arrayList = (ArrayList<TB_Picture>) request.getSession().getAttribute("list");
	%>
	<div class="mydiv1">
		<div class="layui-carousel" id="test10">
			<div carousel-item="">
				<%
					for (int i = 0; i < arrayList.size(); i++) {
				%>
				<div>
					<img src="<%=arrayList.get(i).getLocation()%>">
				</div>
				<%
					}
				%>
			</div>
		</div>
		<!-- <form action="/Agile/LoginServlet" class="box" method="post">
			<h1>登录</h1>
			<input type="text" placeholder="请输入用户名" /> <input type="password"
				placeholder="请输入密码" /> <input type="submit" value="登录">
		</form> -->
		<div class="loginform">
			<form action="/Agile/RegisterServlet" method="post" onsubmit="return validate();">
				<div class="login_table">
					<table width="390px" height="280px">
						<tr>
							<td align="left">账号：</td>
							<td align="left"><input name="username" id="username"
								style="font-size: 20px" type="text"></td>
						</tr>
						<tr>
							<td align="left">密码：</td>
							<td align="left">
							<input name="password" id="password"
								style="font-size: 20px" type="password">
							</td>
							
						</tr>
						<tr>
							<td colspan="2" align="center">
								<button type="submit" class="layui-btn layui-btn-lg">注&nbsp;&nbsp;&nbsp;册</button>
							</td>
						</tr>
					</table>
				</div>
			</form>
		</div>
	</div>
	<script src="/Agile/view/main/layui/layui.all.js"></script>
	<script>
		layui.use([ 'carousel', 'form' ], function() {
			var carousel = layui.carousel, form = layui.form;
			//图片轮播
			carousel.render({
				elem : '#test10',
				width : '600px',
				height : '403px',
				interval : 5000
			});
		});
	</script>
</body>
</html>

