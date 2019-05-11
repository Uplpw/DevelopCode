package com.it.Agile.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.Agile.bean.TB_Collect;
import com.it.Agile.bean.TB_User;
import com.it.Agile.daoBase.impl.AddCollectDao;



@WebServlet("/AddMyCollectServlet")
public class AddMyCollectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// 获取会话中的用户信息
		TB_User user  = (TB_User)request.getSession().getAttribute("SESSION_APPLICANT");
		// 获取请求参数
		String dishpic=request.getParameter("dishpic")+"&"+"fm="+request.getParameter("fm")+"&"+"gp="+request.getParameter("gp");
		String dishname =request.getParameter("dishname");
		BigDecimal dishprice = new BigDecimal(request.getParameter("dishprice"));
		//System.out.println(dishprice);
		if(user==null) {
			 //说明用户没有登录,提醒用户登陆
			out.print("<script type='text/javascript'>");
		    out.print("alert('您还未登陆，请登录！');");
		    out.print("window.location='InitPicture?type=login';");
		    out.print("</script>");
	    }else {
	    	//将用户名保存到shop里
	    	//ArrayList<TB_Collect>
	    	TB_Collect collect=new TB_Collect();
	    	collect.setUsername(user.getUsername());
	    	collect.setDishname(dishname);
	    	collect.setDishpicture(dishpic);
	    	collect.setDishprice(dishprice);
	    	new AddCollectDao().save(collect);	
	    	out.print("<script type='text/javascript'>");
		    out.print("alert('加入我的收藏成功！');");
		    out.print("window.location='view/main/index.jsp';");
		    out.print("</script>");
	    }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
