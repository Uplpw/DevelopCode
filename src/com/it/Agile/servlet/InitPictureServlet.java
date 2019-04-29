package com.it.Agile.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.Agile.bean.TB_Picture;
import com.it.Agile.daoBase.impl.PictureDao;

@WebServlet("/InitPictureServlet")
public class InitPictureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type=request.getParameter("type");
		ArrayList<TB_Picture> list=(ArrayList<TB_Picture>)new PictureDao().getAll();
		request.getSession().setAttribute("list", list);
		//从<a>标签获取链接，以及参数
		if("login".equals(type)){
			//转到登陆
			response.sendRedirect("/Agile/view/main/login.jsp");
			//request.getRequestDispatcher("view/main/login.jsp").forward(request, response);
		}else if("register".equals(type)) {  
			//转到注册
			response.sendRedirect("/Agile/view/main/register.jsp");
			//request.getRequestDispatcher("/Agile/view/main/register.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
