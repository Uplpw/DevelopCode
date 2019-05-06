<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
	<head>
		<title>Home</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript">
			addEventListener("load", function() {
				setTimeout(hideURLbar, 0);
			}, false);

			function hideURLbar() {
				window.scrollTo(0, 1);
			}
		</script>
		<meta name="keywords" content="Bootstrap Responsive Templates, Iphone Compatible Templates, Smartphone Compatible Templates, Ipad Compatible Templates, Flat Responsive Templates" />
		<link href="style/style.css" rel="stylesheet" type="text/css" />
		<link href="/Agile/view/main/css/bootstrap.css" rel="stylesheet" type="text/css" />
		<link href="/Agile/view/main/css/style.css" rel="stylesheet" type="text/css" />
		<link href="/Agile/view/main/css/jquery.fancybox.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="/Agile/view/main/js/public.js"></script>
		<script type="text/javascript" src="/Agile/view/main/js/jquery.js"></script>
		<script type="text/javascript" src="/Agile/view/main/js/jqpublic.js"></script>
		<script type="text/javascript">
		function check_search() {
			var content = document.getElementById("search");
			if (content.value == "") {
				alert("搜索内容不能为空！");
				content.focus();
				return false;
			}
			return true;
		}
		</script>
	</head>
	<body>
		<header>
			<section class="Topmenubg">
				<div class="Topnav">
					<div class="LeftNav">
						<a href="/Agile/InitPicture?type=register">注册</a>
						<a href="/Agile/InitPicture?type=login">登录</a>
						<a href="/Agile/LogoutServlet">退出</a>
					</div>
					<div class="RightNav">
						 <a href="" target="option1" title="我的订单">我的订单</a> 
						 <a href="/Agile/ShopcarServlet" target="option1" title="购物车">购物车</a>
						 <a href="" target="option1" title="我的收藏">我的收藏</a>
					</div>
				</div>
			</section>
			<div class="Logo_search">
				<div class="Logo">
					<img src="images/logo.jpg"  title="DeathGhost" alt="模板">
					<i></i>
					<span>郑州市 [ 高新区 ]</span>
				</div>
				<div class="Search">
					<form action="/Agile/SearchServlet" method="POST" id="main_a_serach" target="option1" onsubmit="return check_search();">
						<input class="searchbox" id="search" name="search" type="text" placeholder="请输入您所需查找的食物名称..." />
						&nbsp;
						<input class="searchbutton"  type="submit" value="搜 索"/>
					</form>
					
				</div>
			</div>
			<div class="header">
				<div class="menu">
					<ul>
						<li><a href="/Agile/view/main/index.jsp">主页</a></li>
						<li><a href="Test.jsp" target="option1">订餐</a></li>
						<li><a href="Test.jsp" target="option1">积分商城</a></li>
						<li><a href="Test.jsp" target="option1">个人中心</a></li>
						<li><a href="/Agile/AboutUsServlet?type=a" target="option1">关于我们</a></li>
					</ul>
					<script type="text/javascript" src="/Agile/view/main/js/responsive-nav.js"></script>
					<script type="text/javascript">
						jQuery(document).ready(function($) {
							$(".scroll").click(function(event) {
								event.preventDefault();
								$('html,body').animate({
									scrollTop: $(this.hash).offset().top
								}, 1000);
							});
						});
					</script>
				</div>
			</div>
		</header>

		<div class="myiframe">
			<iframe id="option1" name="option1" src="/Agile/QueryDishByPageServlert?currentPage=1&pageSize=6" style="overflow: visible;" scrolling="no" frameborder="no" width="100%"
			 height="100%">
			</iframe>
		</div>

		<footer>
			<section class="Otherlink">
				<aside>
					<div class="ewm-left">
						<p>手机扫描二维码：</p>
						<img src="images/Android_ico_d.gif">
						<img src="images/iphone_ico_d.gif">
					</div>
					<div class="tips">
						<p>客服热线</p>
						<p><i>1830927**73</i></p>
						<p>配送时间</p>
						<p><time>09：00</time>~<time>22:00</time></p>

					</div>
				</aside>
				<section>
					<div>
						<span><i class="i1"></i>配送支付</span>
						<ul>
							<li><a href="/Agile/view/main/shipPayment.jsp" target="option1" title="标题">支付方式</a></li>
							<li><a href="/Agile/view/main/shipPayment.jsp" target="option1" title="标题">配送方式</a></li>
							<li><a href="/Agile/view/main/shipPayment.jsp" target="option1" title="标题">配送效率</a></li>
							
						</ul>
					</div>
					<div>
						<span><i class="i2"></i>关于我们</span>
						<ul>
							<li><a href="/Agile/AboutUsServlet?type=a" target="option1" title="标题">餐厅介绍</a></li>
							<li><a href="/Agile/AboutUsServlet?type=a" target="option1" title="标题">招贤纳士</a></li>
							<li><a href="/Agile/AboutUsServlet?type=a" target="option1" title="标题">商家加盟</a></li>
						</ul>
					</div>
					<div>
						<span><i class="i3"></i>帮助中心</span>
						<ul>
							<li><a href="/Agile/view/main/helpCenter.jsp" target="option1" title="标题">服务内容</a></li>
							<li><a href="/Agile/view/main/helpCenter.jsp" target="option1" title="标题">服务介绍</a></li>
							<li><a href="/Agile/view/main/helpCenter.jsp" target="option1" title="标题">常见问题</a></li>
						</ul>
					</div>
				</section>
			</section>
			<!-- <div class="copyright">© 版权所有 2016 DeathGhost 技术支持：<a href="http://www.deathghost.cn" title="DeathGhost">DeathGhost</a></div> -->
		</footer>
		<script src="/Agile/view/main/js/responsiveslides.min.js"></script>
		<script>
			$(function() {
				// Slideshow 4
				$("#slider4").responsiveSlides({
					auto: true,
					pager: true,
					nav: true,
					speed: 500,
					namespace: "callbacks",
					before: function() {
						$('.events').append("<li>before event fired.</li>");
					},
					after: function() {
						$('.events').append("<li>after event fired.</li>");
					}
				});

			});
		</script>
		<script src="/Agile/view/main/js/easyResponsiveTabs.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				$('#horizontalTab').easyResponsiveTabs({
					type: 'default', //Types: default, vertical, accordion           
					width: 'auto', //auto or any width like 600px
					fit: true // 100% fit in a container
				});
			});
		</script>
	</body>
</html>
