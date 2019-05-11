package com.it.Agile.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.Agile.bean.TB_AboutUs;
import com.it.Agile.bean.TB_PersonalOrder;
import com.it.Agile.bean.TB_Rank;
import com.it.Agile.daoBase.impl.AboutUsDao;
import com.it.Agile.daoBase.impl.PersonalOrderDao;
import com.it.Agile.daoBase.impl.SaleRankDao;

@WebServlet("/NotesServlet")
public class NotesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		ArrayList<TB_PersonalOrder> orderlist = (ArrayList<TB_PersonalOrder>) new PersonalOrderDao().getAll();
		request.setAttribute("orderlist", orderlist);
		ArrayList<TB_Rank> rank = (ArrayList<TB_Rank>) new SaleRankDao().getAll("salenum", false);
		request.setAttribute("rank", rank);

		AboutUsDao dao = new AboutUsDao();
		TB_AboutUs au = dao.selectD();
		request.setAttribute("au", au);
		request.getRequestDispatcher("view/notes/rightNotes.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
