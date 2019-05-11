package com.it.Agile.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.Agile.bean.TB_Shop;
import com.it.Agile.bean.TB_User;
import com.it.Agile.daoBase.impl.ShopcarDao;

@WebServlet("/ExchangeNowServlet")
public class ExchangeNowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// 获取会话中的用户信息
		String type=request.getParameter("type");
		TB_User user  = (TB_User)request.getSession().getAttribute("SESSION_APPLICANT");
		String dishpic;
		if(type.equals("dish")) {
			dishpic=request.getParameter("dishpic")+"&"+"fm="+request.getParameter("fm")+"&"+"gp="+request.getParameter("gp");
    	}else {
    		dishpic =request.getParameter("dishpic");
    	}
		String dishname =request.getParameter("dishname");
		BigDecimal dishprice = new BigDecimal(request.getParameter("dishprice"));
		if(user==null) {
			 //说明用户没有登录,提醒用户登陆
			out.print("<script type='text/javascript'>");
		    out.print("alert('您还未登陆，请登录！');");
		    out.print("window.location='InitPicture?type=login';");
		    out.print("</script>");
	    }else {
	    	//将用户名保存到shop里
	    	TB_Shop shop=new TB_Shop();
	    	shop.setUsername(user.getUsername());
	    	shop.setDishname(dishname);
	    	shop.setDishpicture(dishpic);
	    	shop.setDishprice(dishprice);
	    	shop.setNumber(1);
	    	new ShopcarDao().save(shop);
	    	if(type.equals("dish")) {
	    		out.print("<script type='text/javascript'>");
				out.print("alert('加入购物车成功！');");
				out.print("window.location='CreditPictureServlet?type=dish';");
				out.print("</script>");
	    	}else {
	    		out.print("<script type='text/javascript'>");
				out.print("alert('加入购物车成功！');");
				out.print("window.location='CreditPictureServlet?type=gift';");
				out.print("</script>");
	    	}
	    }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
