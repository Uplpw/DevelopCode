<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/Agile/view/order/style/style.css" rel="stylesheet"
	type="text/css" />
<link href="/Agile/view/order/style/myCss.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="/Agile/view/order/js/public.js"></script>
<script type="text/javascript" src="/Agile/view/order/js/jquery.js"></script>
<script type="text/javascript" src="/Agile/view/order/js/jqpublic.js"></script>
</head>
<body>
	<section class="Psection">
		<section class="fslist_navtree">
			<ul class="select">
				<li class="select-list">
					<dl id="select1">
						<dt>分类：</dt>
						<dd class="select-all selected">
							<a href="/Agile/DishCategoryServlet?type=all" target="optiondish">全部</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=meat" target="optiondish">荤菜</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=vegetable" target="optiondish">素菜</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=cold" target="optiondish">凉菜</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=soup" target="optiondish">汤类</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=hotpot" target="optiondish">火锅</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=barbicue" target="optiondish">烧烤</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=drink" target="optiondish">饮品</a>
						</dd>
					</dl>
				</li>

				<li class="select-list">
					<dl id="select3">
						<dt>餐点：</dt>
						<dd class="select-all selected">
							<a href="/Agile/DishCategoryServlet?type=all" target="optiondish">全部</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=breakfirst" target="optiondish">早餐</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=lunch" target="optiondish">午餐</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=dinner" target="optiondish">晚餐</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=snack" target="optiondish">夜宵</a>
						</dd>
					</dl>
				</li>
				<li class="select-list">
					<dl id="select4">
						<dt>价位区间：</dt>
						<dd class="select-all selected">
							<a href="/Agile/DishCategoryServlet?type=all" target="optiondish">全部</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=20" target="optiondish">20元以下</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=40" target="optiondish">20-40元</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=60" target="optiondish">40-60元</a>
						</dd>
						<dd>
							<a href="/Agile/DishCategoryServlet?type=80" target="optiondish">60-80元</a>
						</dd>
					</dl>
				</li>
			</ul>
		</section>
	</section>
	<div class="mycataiframe">
		<iframe id="optiondish" name="optiondish" src="/Agile/DishCategoryServlet?type=all" style="overflow: visible;"
			scrolling="no" frameborder="no" width="100%" height="100%">
		</iframe>
	</div>
</body>
</html>