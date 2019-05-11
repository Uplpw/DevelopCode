<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link href="/Agile/view/market/style/style.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="/Agile/view/market/js/public.js"></script>
		<script type="text/javascript" src="/Agile/view/market/js/jquery.js"></script>
		<script type="text/javascript" src="/Agile/view/market/js/jqpublic.js"></script>
	</head>
	<body>
		<section class="Psection MT20">
			<nav class="U-nav Font14 FontW">
				<ul>
					<li><i></i><a style="font-size: 16px; text-decoration:none" href="/Agile/InitMarketServlet" target="optionmarket">积分商城首页</a></li>
					<li><i></i><a style="font-size: 16px;text-decoration:none" href="/Agile/CreditPictureServlet?type=dish" target="optionmarket">积分菜品</a></li>
					<li><i></i><a style="font-size: 16px;text-decoration:none" href="/Agile/CreditPictureServlet?type=gift" target="optionmarket">积分礼物</a></li>
					<li><i></i><a style="font-size: 16px;text-decoration:none" href="/Agile/view/market/explain.jsp" target="optionmarket">兑换说明</a></li>
					<!-- <li><i></i><a style="font-size: 16px;text-decoration:none" href="user_account.html" target="option4">账户管理</a></li> -->
				</ul>
			</nav>
			
			<div class="U-article Overflow">
				<iframe id="optionmarket" name="optionmarket" src="/Agile/InitMarketServlet" style="overflow: visible;" scrolling="no" frameborder="no" width="100%"
					height="100%">
				</iframe>
			</div>
		</section>

	</body>
</html>
