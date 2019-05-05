<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="com.it.Agile.daoBase.impl.*,com.it.Agile.servlet.*,com.it.Agile.bean.*"%>
<%@page import="java.util.*"%>
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
<title>关于我们</title>
</head>
<body>
	<div align="center">
		<span class="layui-breadcrumb" lay-separator="—">
			<fieldset class="layui-elem-field layui-field-title"
				style="margin-top: 30px;"></fieldset> <a
			href="/Agile/AboutUsServlet?type=a">餐厅简介</a> <a
			href="/Agile/AboutUsServlet?type=b">餐厅招聘</a> <a href="/Agile/AboutUsServlet?type=c">餐厅加盟</a>
		</span>
	</div>
	<div style="margin-top: 30px">
		<!-- about -->
		<div class="about" id="about">
			<div class="container">
				<div class="w3-about-grids">
					<div class="col-md-6 w3-about-left">
						<h5><jsp:getProperty property="name" name="au" /></h5>
						<p>
							<span> <jsp:getProperty property="content" name="au" />
							</span>
						</p>
					</div>
					<div class="col-md-6 w3-about-right">
						<div class="about-img-grids">
							<div class="col-md-7 about-img">
								<img src="/Agile/view/main/images/4.jpg" alt=" " />
							</div>
							<div class="col-md-5 about-img about-img1">
								<img src="/Agile/view/main/images/6.jpg" alt=" " />
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="about-img-grids">
							<div class="col-md-5 about-img about-img1">
								<img src="/Agile/view/main/images/7.jpg" alt=" " />
							</div>
							<div class="col-md-7 about-img">
								<img src="/Agile/view/main/images/5.jpg" alt=" " />
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>

		<script src="/Agile/view/main/layui/layui.js" charset="utf-8"></script>
		<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
		<script>
			layui.use('element', function() {
				var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块

				//监听导航点击
				element.on('nav(demo)', function(elem) {
					//console.log(elem)
					layer.msg(elem.text());
				});
			});
		</script>
</body>
</html>