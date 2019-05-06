package com.it.Agile.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.Agile.bean.TB_Dish;
import com.it.Agile.bean.littlePage;
import com.it.Agile.daoBase.impl.DishDao;

/**
 * Servlet implementation class QueryDishByPageServlert
 */
@WebServlet("/QueryDishByPageServlert")
public class QueryDishByPageServlert extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public QueryDishByPageServlert() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int currentPage = Integer.parseInt(request.getParameter("currentPage"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		ArrayList<TB_Dish> dish = null;
		dish = new DishDao().getDishByPage(currentPage,pageSize);
		//dish = new DishDao().getDishByPage(3,6);
		System.out.println(dish.get(0).getDishName()+"ddebug");
		littlePage p = new littlePage(currentPage,currentPage);
		request.setAttribute("page", p);
		request.setAttribute("dish", dish);
		request.getRequestDispatcher("/view/main/indexPicture.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
