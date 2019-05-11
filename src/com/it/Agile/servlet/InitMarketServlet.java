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

@WebServlet("/InitMarketServlet")
public class InitMarketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("OK");
		TB_User user=(TB_User)request.getSession().getAttribute("SESSION_APPLICANT");
		System.out.println(user.getUsername());
		String username=user.getUsername();
		ArrayList<TB_UserInfo> userinfolist=(ArrayList<TB_UserInfo>)new UserInfoDao().findBy("username", username, "pk", true);
		System.out.println(userinfolist.size());
		System.out.println(userinfolist);
		TB_UserInfo userinfo=userinfolist.get(0);
		
		request.setAttribute("userinfo", userinfo);
		request.getRequestDispatcher("view/market/indexIframe.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
