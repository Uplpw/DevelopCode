package com.it.Agile.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.Agile.bean.TB_Shop;
import com.it.Agile.bean.TB_User;
import com.it.Agile.daoBase.impl.ShopcarDao;

@WebServlet("/ShopcarServlet")
public class ShopcarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		System.out.println("Ok");
		TB_User user=(TB_User) request.getSession().getAttribute("SESSION_APPLICANT");
		if(user==null) {
			out.print("<script type='text/javascript'>");
			out.print("alert('未登录，请先登陆');");
			//获取顶层window
			out.print("window.top.location='/Agile/InitPicture?type=login'");
			out.print("</script>");
		}else {
			System.out.println(user.getUsername());
			ArrayList<TB_Shop> list= new ShopcarDao().getTB_ShopcarByUser_Id(user.getUsername());
			//System.out.println(list);
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i).getDishname()+"  "+list.get(i).getDishpicture());
			}
			request.setAttribute("list", list);
			request.getRequestDispatcher("view/main/shopcar.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
