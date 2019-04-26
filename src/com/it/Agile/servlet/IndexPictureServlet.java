package com.it.Agile.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.Agile.bean.*;
import com.it.Agile.daoBase.impl.*;

/**
 * Servlet implementation class IndexPictureServlet
 */
@WebServlet("/IndexPictureServlet")
public class IndexPictureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		ArrayList<TB_Dish> list=(ArrayList<TB_Dish>)new DishPictureDao().getAll();
		
		request.setAttribute("list", list);
		/*for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getDishName()+"  "+list.get(i).getDishPrice());
		}*/
		request.getRequestDispatcher("view/main/indexPicture.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
