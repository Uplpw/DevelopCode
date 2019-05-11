package com.it.Agile.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.Agile.bean.TB_User;

@WebServlet("/MarketOrCenterServlet")
public class MarketOrCenterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		TB_User user=(TB_User)request.getSession().getAttribute("SESSION_APPLICANT");
		if(user==null) {
			out.print("<script type='text/javascript'>");
		    out.print("alert('您还未登陆，请登录！');");
		    out.print("window.top.location='InitPicture?type=login';");
		    out.print("</script>");
		}else {
			String type=request.getParameter("type");
			if(type.equals("market")) {
				response.sendRedirect("/Agile/view/market/index.jsp");
			}else if(type.equals("center")){
				response.sendRedirect("/Agile/view/center/index.jsp");
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
