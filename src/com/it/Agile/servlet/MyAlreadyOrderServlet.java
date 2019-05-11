package com.it.Agile.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.Agile.bean.*;
import com.it.Agile.daoBase.impl.*;

@WebServlet("/MyAlreadyOrderServlet")
public class MyAlreadyOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		//System.out.println("Ok");
		TB_User user=(TB_User) request.getSession().getAttribute("SESSION_APPLICANT");
		if(user==null) {
			out.print("<script type='text/javascript'>");
			out.print("alert('未登录，请先登陆');");
			out.print("window.top.location='/Agile/InitPicture?type=login'");
			out.print("</script>");
		}else {
			//System.out.println(user.getUsername());
			ArrayList<TB_Record> list= new RecordDao().getTB_PersonalorderByUser_Id(user.getUsername());
			System.out.println(list);
			request.setAttribute("list", list);
			request.getRequestDispatcher("view/center/userorder.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
