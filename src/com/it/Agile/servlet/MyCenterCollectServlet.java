package com.it.Agile.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.Agile.bean.TB_Collect;
import com.it.Agile.bean.TB_User;
import com.it.Agile.daoBase.impl.AddCollectDao;

@WebServlet("/MyCenterCollectServlet")
public class MyCenterCollectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		TB_User user  = (TB_User)request.getSession().getAttribute("SESSION_APPLICANT");
		ArrayList<TB_Collect> list=(ArrayList<TB_Collect>)new AddCollectDao().findBy("username", user.getUsername(), "pk", true);
		request.setAttribute("list", list);
		System.out.println(list);
		request.getRequestDispatcher("view/center/mycenter.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
