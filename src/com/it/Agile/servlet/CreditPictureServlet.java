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

@WebServlet("/CreditPictureServlet")
public class CreditPictureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//通过参数 查询相应的可兑换数据
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String type=request.getParameter("type");
		if(type.equals("dish")) {
			System.out.println(type);
			ArrayList<TB_Exchange> list=(ArrayList<TB_Exchange>)new ExchangeDao().findBy("exchangecategory", "dish", "pk", true);
			request.setAttribute("list", list);
			request.setAttribute("type", "dish");
			System.out.println(list);
			request.getRequestDispatcher("view/market/creditpicture.jsp").forward(request, response);
		}else if(type.equals("gift")) {
			System.out.println(type);
			ArrayList<TB_Exchange> list=(ArrayList<TB_Exchange>)new ExchangeDao().findBy("exchangecategory", "gift", "pk", true);
			request.setAttribute("list", list);
			request.setAttribute("type", "gift");
			System.out.println(list);
			request.getRequestDispatcher("view/market/creditpicture.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
