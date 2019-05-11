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
<title>Insert title here</title>
<link href="/Agile/view/center/styleBody/style.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
	<%TB_UserInfo userinfo=(TB_UserInfo)request.getAttribute("userinfo"); %>
	<div class="myBody">
		<article class="U-article">
			<section class="usercenter">
				<span class="Weltitle Block Font16 CorRed FontW Lineheight35">Welcome欢迎光临！</span>
				<div class="U-header MT20 Overflow">
					<img src="<%=userinfo.getUserpicture() %>"> <br>
					<p class="Font14 FontW" style="font-size: 15px;"><%=userinfo.getPetname() %>
						&nbsp;&nbsp;欢迎您回到 个人中心！</p>
					<br>
				</div>
			</section>
		</article>
	</div>
	<!-- <div class="myHeader">
		<iframe id="optionrecord" name="optionrecord" src="#" style="overflow: visible;"
			scrolling="no" frameborder="no" width="100%" height="100%">
		</iframe> -->
	</div>
</body>
</html>