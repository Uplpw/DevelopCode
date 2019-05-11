package com.it.Agile.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.Agile.bean.TB_PersonalOrder;
import com.it.Agile.bean.TB_Rank;
import com.it.Agile.daoBase.impl.PersonalOrderDao;
import com.it.Agile.daoBase.impl.SaleRankDao;

/**
 * Servlet implementation class SaleRankServlet
 */
@WebServlet("/SaleRankServlet")
public class SaleRankServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaleRankServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		ArrayList<TB_Rank> rank = (ArrayList<TB_Rank>) new SaleRankDao().getAll("salenum",false);
		request.setAttribute("rank", rank);
//		for(int i=0;i<rank.size();i++) {
//		System.out.println(rank.get(i).getDishname()+"  "+rank.get(i).getSalenum());
//		}
		
		request.getRequestDispatcher("view/notes/saleRank.jsp").forward(request, response);
//		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
