<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/Agile/view/main/css/css1/style.css"
	media="all">
<link rel="stylesheet" href="/Agile/view/main/css/css1/bootstrap.css"
	media="all">
<link rel="stylesheet" href="/Agile/view/main/layui/css/layui.css"
	media="all">
<jsp:useBean id="au" class="com.it.Agile.bean.TB_AboutUs"
	scope="request"></jsp:useBean>
<title>餐厅公告</title>
</head>
<body style="background-color:#EBEBEB ">
	<div class="container" >
		<div class="w3-about-grids">
			<div class="col-md-6 w3-about-left">
				<h3 style="text-align:center"><jsp:getProperty property="name" name="au" /></h3>
				<p>
					<span style="font-size:16px"> <jsp:getProperty property="content" name="au" />
					</span>
				</p>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
</body>
</html>