<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
		<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
		<link href="css/style.css" rel='stylesheet' type='text/css' />
		<link href='https://fonts.googleapis.com/css?family=Arimo:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Raleway:400,100,200,300,500,600,700,800,900' rel='stylesheet'
		 type='text/css'>
		<script src="js/jquery-1.11.0.min.js"></script>
		<script type="text/javascript" src="js/move-top.js"></script>
		<script type="text/javascript" src="js/easing.js"></script>
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
	</head>
	<body>
		
		<div class="logo">
			<div class="logo_left">
				&ensp;&ensp;&ensp;&ensp;&ensp;
				<a href="/Agile/InitPicture?type=register" target="_parent">注册</a>&ensp;
				<a href="/Agile/InitPicture?type=login" target="_parent">登陆</a>&ensp;
				<a href="/Agile/LogoutServlet" target="_parent">退出</a>
			</div>
			
			<div class="logo_row">
				<img src="images/u17.jpg" align="left">
			</div>
		</div>
		
		<div class="header">
			<div class="menu">
				<ul>
					<li><a href="Test.jsp" target="option1">主页</a></li>
					<li><a href="Test.jsp" target="option1">订餐</a></li>
					<li><a href="Test.jsp" target="option1">积分商城</a></li>
					<li><a href="Test.jsp" target="option1">个人中心</a></li>
					<li><a href="Test.jsp" target="option1">关于我们</a></li>
				</ul>
				
				<script type="text/javascript" src="js/responsive-nav.js"></script>
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
		
		
		<div class="myiframe">
			<iframe id="option1" name="option1" src="/Agile/IndexPictureServlet" style="overflow: visible;" 
					scrolling="no" frameborder="no" width="100%" height="100%">
			</iframe>
		</div>
		
		
		<div class="footer">
			<div class="footer-main">
				<div class="footer-bottom">
					<div class="ftr">
						<p>Copyright &copy; 2015.Company name All rights reserved.More Templates</p>
					</div>
				</div>
			</div>
		</div>
		<script src="js/responsiveslides.min.js"></script>
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
		<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
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
