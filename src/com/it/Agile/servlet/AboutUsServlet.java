package com.it.Agile.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.Agile.bean.*;
import com.it.Agile.daoBase.impl.AboutUsDao;

@WebServlet("/AboutUsServlet")
public class AboutUsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public AboutUsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String type=request.getParameter("type");
		System.out.println(type);
		if ("a".equals(type)) {
			// 关于我们——商家简介
			System.out.println("shangjiajianjie");
			AboutUsDao dao = new AboutUsDao();
			TB_AboutUs au = dao.selectA();
			request.setAttribute("au", au);
			System.out.println(au.getName());
			System.out.println(au.getContent());
			request.getRequestDispatcher("view/main/aboutus.jsp").forward(request, response);


		} else if ("b".equals(type)) {
			// 关于我们——商家招聘
			AboutUsDao dao = new AboutUsDao();
			TB_AboutUs au = dao.selectB();
			request.setAttribute("au", au);
			request.getRequestDispatcher("view/main/aboutus.jsp").forward(request, response);

		} else if ("c".equals(type)) {
			// 关于我们——商家加盟
			AboutUsDao dao = new AboutUsDao();
			TB_AboutUs au = dao.selectC();
			request.setAttribute("au", au);
			request.getRequestDispatcher("view/main/aboutus.jsp").forward(request, response);
		}
		
	
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		
		doGet(request, response);

		

	}

}
