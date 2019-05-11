package com.it.Agile.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.Agile.bean.*;
import com.it.Agile.daoBase.impl.AboutUsDao;

@WebServlet("/ResNotesServlet")
public class ResNotesServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		    String type1 = request.getParameter("type1");
			AboutUsDao dao = new AboutUsDao();
			TB_AboutUs au = dao.selectD();
			request.setAttribute("au", au);
//			request.getRequestDispatcher("view/main/resNotes.jsp").forward(request, response);
			if (type1 == null) {
				type1 = "resNotes";
//				type = "resNotes";
			}
			request.getRequestDispatcher("view/notes/" + type1 + ".jsp").forward(request, response);	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		doGet(request, response);
	}

}

