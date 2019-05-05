package com.it.Agile.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.Agile.bean.TB_Dish;
import com.it.Agile.daoBase.impl.DishPictureDao;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 设置请求和响应编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// 获取请求参数
		String content=request.getParameter("search");
		//System.out.println(content);
		if(content.equals("")) {
			System.out.println("123");
			out.print("alert('搜索内容不能为空');");
			out.print("alert('验证码错误！');");
		}else {
			/*if(request.getSession().getAttribute("searchcount")==null) {
				request.getSession().setAttribute("searchcount", 1);
			}*/
			
			ArrayList<TB_Dish> list=(ArrayList<TB_Dish>)new DishPictureDao().findLike("dishname", content, null, false);
			/*for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i).getDishName());
			}*/
			request.setAttribute("list", list);
			request.getRequestDispatcher("view/main/search.jsp").forward(request, response);
		}
	}
}
