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

@WebServlet("/PersonalOrderServlet")
public class PersonalOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
//		String type = request.getParameter("type");
		ArrayList<TB_PersonalOrder> orderlist = (ArrayList<TB_PersonalOrder>) new PersonalOrderDao().getAll();
		request.setAttribute("orderlist", orderlist);
		/*if (type == null) {
			
			type = "orderNotes";

		}*/
		
		request.getRequestDispatcher("view/notes/orderNotes.jsp").forward(request, response);
//		for(int i=0;i<orderlist.size();i++) {
//			System.out.println(orderlist.get(i).getId()+"  "+orderlist.get(i).getUsername());
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
