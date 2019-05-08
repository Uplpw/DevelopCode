package com.it.Agile.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.Agile.bean.TB_User;
import com.it.Agile.bean.TB_Userinfo;
import com.it.Agile.daoBase.impl.UserinfoDao;

/**
 * Servlet implementation class ChangeUserinfoservlet
 */
@WebServlet("/ChangeUserinfoservlet")
public class ChangeUserinfoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeUserinfoservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		System.out.println("Ok");
		//TB_User user=(TB_User) request.getSession().getAttribute("SESSION_APPLICANT");
		//System.out.println(user.getUsername());
		ArrayList<TB_Userinfo> list= new UserinfoDao().getTB_UserinfoByUser_Id("2016");
		System.out.println(list);
		request.setAttribute("list", list);
		request.getRequestDispatcher("view/main/usermanage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 设置请求和响应编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// 获取会话中的用户信息
		TB_User user  = (TB_User)request.getSession().getAttribute("SESSION_APPLICANT");
		// 获取请求参数
		String petname =request.getParameter("petname");
		String usertelephone =request.getParameter("usertelephone");
		TB_Userinfo userinfo=new  UserinfoDao().findBy("username","2016", null, true).get(0);
		userinfo.setPetname(petname);
		userinfo.setUsertelephone(usertelephone);
		new UserinfoDao().save((TB_Userinfo) userinfo);//应该是更新update
		out.print("<script type='text/javascript'>");
	    out.print("alert('保存成功！');");
	    out.print("window.location='view/main/usermanage.jsp';");
	    out.print("</script>");
	   // request.getRequestDispatcher("view/main/usermanage.jsp").forward(request, response);
	}

}
