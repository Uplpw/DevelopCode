package com.it.Agile.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.Agile.bean.TB_Dish;
import com.it.Agile.daoBase.impl.DishPictureDao;


@WebServlet("/OrderInitServlet")
public class OrderInitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		ArrayList<TB_Dish> list=(ArrayList<TB_Dish>)new DishPictureDao().findBy("dishcategory", "popular", null, false);
		request.setAttribute("list",list);
		//System.out.println(list.size());
		request.getRequestDispatcher("view/order/myorder.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
