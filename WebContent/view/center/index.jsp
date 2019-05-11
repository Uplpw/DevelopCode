<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link href="/Agile/view/center/style/style.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="/Agile/view/center/js/public.js"></script>
		<script type="text/javascript" src="/Agile/view/center/js/jquery.js"></script>
		<script type="text/javascript" src="/Agile/view/center/js/jqpublic.js"></script>
	</head>
	<body>
		<section class="Psection MT20">
			<nav class="U-nav Font14 FontW">
				<ul>
					<li><i></i><a style="font-size: 16px; text-decoration:none" href="/Agile/InitCenterServlet" target="optioncenter">用户中心首页</a></li>
					<li><i></i><a style="font-size: 16px;text-decoration:none" href="/Agile/MyAlreadyOrderServlet" target="optioncenter">我的订单</a></li>
					<li><i></i><a style="font-size: 16px;text-decoration:none" href="/Agile/InitCenterServlet" target="optioncenter">收货地址</a></li>
					<li><i></i><a style="font-size: 16px;text-decoration:none" href="/Agile/MyCenterCollectServlet" target="optioncenter">我的收藏</a></li>
					<li><i></i><a style="font-size: 16px;text-decoration:none" href="/Agile/ChangeUserinfoservlet" target="optioncenter">账户管理</a></li>
				</ul>
			</nav>
			
			<div class="U-article Overflow">
				<iframe id="optioncenter" name="optioncenter" src="/Agile/InitCenterServlet" style="overflow: visible;" scrolling="no" frameborder="no" width="100%"
					height="100%">
				</iframe>
			</div>
		</section>

	</body>
</html>
