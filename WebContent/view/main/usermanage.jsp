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
<title>账户管理</title>
<link rel="stylesheet" href="/Agile/view/main/layui/css/layui.css" media="all">
<link href="/Agile/view/main/css/style1.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="layui-row">
  <!-- 侧边栏-->
  <div class="layui-col-md3">
  <div class="grid-demo">
  <ul class="layui-nav layui-nav-tree layui-inline" style="margin-right: 10px;" lay-filter="demo">
  <li class="layui-nav-item layui-nav-itemed">
    <a href="javascript:;">用户中心首页</a>
  </li>
  <li class="layui-nav-item">
    <a href="javascript:;">收货地址</a>

  </li>
  <li class="layui-nav-item"><a href="">我的订单</a></li>


  <li class="layui-nav-item"><a href="">我的收藏</a></li>

  <li class="layui-nav-item"><a href="">账户管理</a></li>


</ul>
</div>
    </div>
    
    
    <div class="layui-col-md9">
      <div class="grid-demo grid-demo-bg1">75%
      <table>

                          <div id="u1502_text" class="text ">

                          </div>
                        </div>
      </table>
   <article class="U-article Overflow">
  <!--user Account-->
        <%
        ArrayList<TB_Userinfo> list=(ArrayList<TB_Userinfo>)request.getAttribute("list"); 
		%>
  <section class="AccManage Overflow">
                             <p><span>XXX 欢迎来到账户管理</span></p>
                            <img src="<%=list.get(0).getUserpicture() %>" width="150" height="150" />
                            <p><span>您的上一次登陆时间：2019-04-03 12:00:00</span></p>
   <p>上次登陆：2014年09月22日 11:40:36( *如非本人登陆，请立即<a href="#" target="_blank">修改您的密码</a>！ )</p>
   <form action="ChangeUserinfoservlet" method="post">
    <table>
    <tr>
    <td width="30%" align="right">修改头像：</td>
    <td><input name="img" type="file"><button>确定</button></td>
    </tr>
    <tr>
    <td width="30%" align="right">修改昵称：</td>
    <td><input type="text" name="username" value="<%=list.get(0).getPetname() %>"></td>
    </tr>
    <tr>
    <td width="30%" align="right">修改密码：</td>
    <td><input type="email" name="pwd" value=""></td>
    </tr>
    <tr>
    <td width="30%" align="right">修改电话：</td>
    <td><input type="tel" name="phone" value="<%=list.get(0).getUsertelephone() %>"></td>
    </tr>
    <tr>
    <td></td>
    <td><input href=Changeeinfo?img=img,   name="submit" type="submit" value="保 存"></td>
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