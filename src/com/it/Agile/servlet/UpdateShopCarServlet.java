package com.it.Agile.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.Agile.bean.TB_Shop;
import com.it.Agile.daoBase.impl.*;


@WebServlet("/UpdateShopCarServlet")
public class UpdateShopCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 设置请求和响应编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String op =request.getParameter("op");
		String dishname =request.getParameter("dishname");
		String username =request.getParameter("username");
		int number;
		System.out.println(op+dishname+username);
		if(op.equals("min")) {
			
			ShopcarDao shop=new ShopcarDao();
			number=shop.getnumber(username, dishname);
			number--;
			if(number==0) {
				shop.deleteshopcar_dish(username,dishname);
			    System.out.println("删除用户 "+ username +" 所选菜品 "+ dishname);
			} else {
			shop.updatenumber(number, username, dishname);
			System.out.println("所选菜数量减一"+ number);
			}
			
			
		}
		if(op.equals("add")) {
			ShopcarDao shop=new ShopcarDao();
			number=shop.getnumber(username, dishname);
			number++;
			shop.updatenumber(number, username, dishname);
			System.out.println("所选菜 "+ dishname + "数量加一,当前数量："+ number);
			
		}
		if(op.equals("delete")) {
			ShopcarDao shop=new ShopcarDao();
			shop.deleteshopcar_dish(username,dishname);
			System.out.println("删除用户 "+ username +" 所选菜品 "+ dishname);
			
		}
		ArrayList<TB_Shop> list= new ShopcarDao().getTB_ShopcarByUser_Id(username);
		request.setAttribute("list", list);
		request.getRequestDispatcher("view/main/shopcar.jsp").forward(request, response);
		//System.out.println(list);
		//request.getSession().setAttribute("list", list);
		//response.sendRedirect("/Agile/view/main/shopcar.jsp");
		
	}

}
