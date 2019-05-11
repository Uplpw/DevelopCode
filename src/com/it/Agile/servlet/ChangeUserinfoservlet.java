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
import com.it.Agile.util.Base64Util;
import com.it.Agile.util.MD5Util;

@WebServlet("/ChangeUserinfoservlet")
public class ChangeUserinfoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		TB_User user=(TB_User) request.getSession().getAttribute("SESSION_APPLICANT");
		
		//System.out.println(user.getUsername());
		
		ArrayList<TB_UserInfo> list= new UserInfoDao().getTB_UserinfoByUser_Id(user.getUsername());
		System.out.println(list);
		request.setAttribute("list", list);
		request.setAttribute("userpwd", user.getPassword());
		request.getRequestDispatcher("view/center/usermanage.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 设置请求和响应编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// 获取会话中的用户信息
		TB_User user  = (TB_User)request.getSession().getAttribute("SESSION_APPLICANT");
		// 获取请求参数
		String img=request.getParameter("img");
		String petname =request.getParameter("petname");
		String usertelephone =request.getParameter("phone");
		String userpassword=request.getParameter("userpwd");
		
		TB_UserInfo userinfo=new  UserInfoDao().findBy("username",user.getUsername(), null, true).get(0);
		userinfo.setPetname(petname);
		userinfo.setUsertelephone(usertelephone);
		userinfo.setUserpicture(img);
		user.setPassword(MD5Util.encode(Base64Util.encode(userpassword)));
		new UserDao().updateByID(user);
		
		new UserInfoDao().updateByID(userinfo);
		
		out.print("<script type='text/javascript'>");
	    out.print("alert('保存成功！');");
	    out.print("window.location='ChangeUserinfoservlet';");
	    out.print("</script>");
	   // request.getRequestDispatcher("view/main/usermanage.jsp").forward(request, response);
	}

}
