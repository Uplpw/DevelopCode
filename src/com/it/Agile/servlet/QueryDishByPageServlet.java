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
import com.it.Agile.daoBase.impl.DishPictureDao;

@WebServlet("/QueryDishByPageServlet")
public class QueryDishByPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public QueryDishByPageServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String type = request.getParameter("type");
		
		System.out.println(type);
		
		int currentPage, pageSize, totalCount, totalPage;
		ArrayList<TB_Dish> dish = null;
		Page page = new Page();
		switch (type) {
			
		case "start":
			ArrayList<TB_Dish> list = (ArrayList<TB_Dish>) new DishPictureDao().getAll();
			currentPage = 1;
			totalCount = list.size();
			pageSize = 6;
			// 这个顺序有点讲究，慎动（动之前建议先看代码
			page.setTotalCount(totalCount);
			page.setPageSize(pageSize);

			totalPage = page.getTotalPage();

			while (currentPage < 1)
				currentPage++;
			while (currentPage > totalPage)
				currentPage--;

			page.setCurrentPage(currentPage);
			
			System.out.println("currentPage: "+page.getCurrentPage());
			System.out.println("totalCount: "+page.getTotalCount());
			System.out.println("pageSize: "+page.getPageSize());
			System.out.println("totalPage: "+page.getTotalPage());
			
			dish = new DishDao().getDishByPage(currentPage, pageSize);
			for(int i=0;i<dish.size();i++) {
				System.out.println(dish.get(i).getDishName());
			}
			// 换页测
			request.setAttribute("page", page);
			request.setAttribute("dish", dish);
			request.getRequestDispatcher("view/main/indexPicture.jsp").forward(request, response);
			break;
		case "index":
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
			pageSize = Integer.parseInt(request.getParameter("pageSize"));
			totalCount = new DishDao().getAll().size();
		
			// 这个顺序有点讲究，慎动（动之前建议先看代码
			page.setTotalCount(totalCount);
			page.setPageSize(pageSize);
			totalPage = page.getTotalPage();

			while (currentPage < 1)
				currentPage++;
			while (currentPage > totalPage)
				currentPage--;

			page.setCurrentPage(currentPage);
			dish = new DishDao().getDishByPage(currentPage, pageSize);
			
			System.out.println("currentPage: "+page.getCurrentPage());
			System.out.println("totalCount: "+page.getTotalCount());
			System.out.println("pageSize: "+page.getPageSize());
			System.out.println("totalPage: "+page.getTotalPage());
			
			request.setAttribute("page", page);
			request.setAttribute("dish", dish);
			for(int i=0;i<dish.size();i++) {
				System.out.println(dish.get(i).getDishName());
			}
			request.getRequestDispatcher("view/main/indexPicture.jsp").forward(request, response);
			break;
		
		}

		/*
		 * int currentPage = Integer.parseInt(request.getParameter("currentPage")); int
		 * pageSize = Integer.parseInt(request.getParameter("pageSize")); int totalCount
		 * = new DishDao().getAll().size();
		 * //System.out.println(totalCount+":totalCount"); ArrayList<TB_Dish> dish =
		 * null; Page pp = new Page();
		 * 
		 * //这个顺序有点讲究，慎动（动之前建议先看代码 pp.setTotalCount(totalCount);
		 * 
		 * pp.setPageSize(pageSize);
		 * 
		 * int totalPage = pp.getTotalPage();
		 * 
		 * while(currentPage<1) currentPage++; while(currentPage>totalPage)
		 * currentPage--;
		 * 
		 * pp.setCurrentPage(currentPage); System.out.println(totalPage+":totalPage");
		 * dish = new DishDao().getDishByPage(currentPage,pageSize);
		 * 
		 * request.setAttribute("page", pp); request.setAttribute("dish", dish);
		 * request.getRequestDispatcher("/view/main/indexPicture.jsp").forward(request,
		 * response);
		 */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
