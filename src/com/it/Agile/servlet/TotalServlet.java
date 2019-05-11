package com.it.Agile.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.Agile.bean.TB_Record;
import com.it.Agile.bean.TB_Shop;
import com.it.Agile.bean.TB_User;
import com.it.Agile.daoBase.impl.RecordDao;
import com.it.Agile.daoBase.impl.ShopcarDao;

@WebServlet("/TotalServlet")
public class TotalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TotalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		double sum=0.0;
		String food[] = new String[100];
		TB_User user=(TB_User) request.getSession().getAttribute("SESSION_APPLICANT");
		ArrayList<TB_Shop> list= new ShopcarDao().getTB_ShopcarByUser_Id(user.getUsername());
		System.out.println("TotalServlet"+user.getUsername());
		for(int i = 0; i < food.length; i++)
			food[i]="-1";
		String food1[] = request.getParameterValues("food");
		if(food1==null) {
			out.print("<script type='text/javascript'>");
		    out.print("alert('请至少选择一样进行结算!');");
		    out.print("window.location='ShopcarServlet';");
		    out.print("</script>");
		}
		else
		{
			for(int i = 0; i < food1.length; i++)
			{
				food[i]=food1[i];
			}
			for(int i = 0; i < food.length; i++)
			{
				if(food[i]!="-1")
				{
					sum+=list.get(i).getNumber() * (list.get(i).getDishprice().doubleValue());
					ShopcarDao shop=new ShopcarDao();
					shop.deleteshopcar_dish(user.getUsername(),list.get(i).getDishname());
					RecordDao recordDao = new RecordDao();
					TB_Record record = new TB_Record();
					record.setUsername(user.getUsername());
					record.setDishname(list.get(i).getDishname());
					record.setDishprice(list.get(i).getDishprice());
					record.setNumber(list.get(i).getNumber());
					record.setOrdertime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()).toString());
					record.setStatus("0");
					System.out.println(record.getUsername());
					System.out.println(record.getDishname());
					System.out.println(record.getNumber());
					System.out.println(record.getDishprice());
					System.out.println(record.getOrdertime());
					
					recordDao.save(record);
				}
			}
			//System.out.println("TotalServlet"+sum);
			out.print("<script type='text/javascript'>");
		    out.print("alert('结算成功!  共消费"+sum+"元');");
		    out.print("window.top.location='view/main/index.jsp';");
		    out.print("</script>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
