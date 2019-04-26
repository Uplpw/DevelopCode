package com.it.Agile.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import com.it.Agile.util.Base64Util;
import com.it.Agile.util.MD5Util;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.Agile.bean.TB_User;
import com.it.Agile.daoBase.impl.UserDao;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// 获取请求参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//定义类型
		ArrayList<TB_User> user = (ArrayList<TB_User>) new UserDao().findBy("username", username, null, false);
		if (user.size()==0 ) {
			TB_User tB_User = new TB_User();
			tB_User.setUsername(username);
			tB_User.setPassword(MD5Util.encode(Base64Util.encode(password)));
			new UserDao().save(tB_User);
			response.sendRedirect("/Agile/view/main/login.jsp");
		} else {
			// 登录验证
			out.print("<script type='text/javascript'>");
			out.print("alert('用户名重复，请重新输入！');");
			out.print("window.location='view/main/register.jsp';");
			out.print("</script>");
			
		}
	}
}
