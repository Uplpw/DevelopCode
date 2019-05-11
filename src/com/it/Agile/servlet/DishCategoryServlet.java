package com.it.Agile.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.Agile.daoBase.impl.DishPictureDao;
import com.it.Agile.bean.*;

@WebServlet("/DishCategoryServlet")
public class DishCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type=request.getParameter("type");
		ArrayList<TB_Dish> list;
		ArrayList<TB_Dish> templist;
		switch(type) {
			case "all":
				list=(ArrayList<TB_Dish>) new DishPictureDao().getAll();
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "meat":
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBy("dishcategory", "meat", "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "vegetable":
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBy("dishcategory", "vegetable", "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "cold":
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBy("dishcategory", "cold", "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "soup":
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBy("dishcategory", "soup", "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "hotpot":
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBy("dishcategory", "hotpot", "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "barbicue":
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBy("dishcategory", "barbicue", "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "drink":
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBy("dishcategory", "drink", "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "breakfirst":
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBy("dishcategory", "breakfirst", "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "lunch":
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBy("dishcategory", "lunch", "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "dinner":
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBy("dishcategory", "dinner", "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "snack":
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBy("dishcategory", "snack", "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "20":
				//需要重新写一下方法，进行区间选择
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBetweenProperty("dishprice", 0, 20, "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "40":
				//需要重新写一下方法，进行区间选择
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBetweenProperty("dishprice", 20, 40, "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "60":
				//需要重新写一下方法，进行区间选择
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBetweenProperty("dishprice", 40, 60, "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
			case "80":
				//需要重新写一下方法，进行区间选择
				list=(ArrayList<TB_Dish>) new DishPictureDao().findBetweenProperty("dishprice", 60, 80, "pk", true);
				templist = new ArrayList<TB_Dish>();
				if(list.size()>8) {
					for(int i=0;i<8;i++) {
						templist.add(list.get(i));
					}
				}else {
					for(int i=0;i<list.size();i++) {
						templist.add(list.get(i));
					}
				}
				request.setAttribute("list", templist);
				request.getRequestDispatcher("view/order/dishcategory.jsp").forward(request, response);
				break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
