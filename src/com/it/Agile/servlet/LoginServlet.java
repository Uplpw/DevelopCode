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
import com.it.Agile.daoBase.impl.UserDao;
import com.it.Agile.util.Base64Util;
import com.it.Agile.util.MD5Util;

/**
 * 登录功能实现
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 设置请求和响应编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// 获取请求参数
		String username = request.getParameter("username");
		//System.out.println(username);
		String password = request.getParameter("password");
		//System.out.println(password);
		String verifyCode = request.getParameter("verifyCode");
		//System.out.println(verifyCode);
		// 判断验证码是否正确
		String sessionValidateCode = (String) request.getSession().getAttribute("SESSION_VALIDATECODE");
		//System.out.println(sessionValidateCode);
		if (!sessionValidateCode.equals(verifyCode)) {
			System.out.println("12");
			out.print("<script type='text/javascript'>");
			out.print("alert('验证码错误！');");
			out.print("window.location='/Agile/view/main/login.jsp';");
			out.print("</script>");
		} else {
			// 登录验证
			UserDao userdao = new UserDao();
			TB_User tB_User = new TB_User();
			
			ArrayList<TB_User> tB_Users = (ArrayList<TB_User>) userdao.findBy("username", username, null, false);
			if (tB_Users != null && tB_Users.size() != 0) {
				tB_User = tB_Users.get(0);
				if (tB_User != null && MD5Util.encode(Base64Util.encode(password)).equals(tB_User.getPassword())) {
					// 用户登录成功,将用户信息存入session
					request.getSession().setAttribute("SESSION_APPLICANT", tB_User);
					response.sendRedirect("/Agile/view/main/index.jsp");
				} else {
					// 用户登录信息错误，进行错误提示
					out.print("<script type='text/javascript'>");
					out.print("alert('用户名或密码错误，请重新输入！');");
					out.print("window.location='/Agile/view/main/login.jsp';");
					out.print("</script>");
				}
			}else {
				out.print("<script type='text/javascript'>");
				out.print("alert('用户名或密码错误，请重新输入！');");
				out.print("window.location='/Agile/view/main/login.jsp';");
				out.print("</script>");
			}
		}
	}
}
