package com.it.Agile.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.Agile.bean.Page;
import com.it.Agile.bean.TB_Dish;
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
		int totalCount = new DishDao().getAll().size();
		//System.out.println(totalCount+":totalCount");
		ArrayList<TB_Dish> dish = null;
		Page pp = new Page();
		
		//这个顺序有点讲究，慎动（动之前建议先看代码
		pp.setTotalCount(totalCount);
		pp.setPageSize(pageSize);
		int totalPage = pp.getTotalPage();
		while(currentPage<1) currentPage++;
		while(currentPage>totalPage) currentPage--;
		pp.setCurrentPage(currentPage);
		System.out.println(totalPage+":totalPage");
		dish = new DishDao().getDishByPage(currentPage,pageSize);
		
		request.setAttribute("page", pp);
		request.setAttribute("dish", dish);
		request.getRequestDispatcher("/view/main/indexPicture.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
