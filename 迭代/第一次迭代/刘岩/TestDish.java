package com.it.Agile.daoBase.impl;

import java.util.ArrayList;
import java.util.Iterator;


import com.it.Agile.bean.TB_Dish;



public class TestDish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		// 插入操作
				TB_Dish tB_Dish = new TB_Dish();
				tB_Dish.setDishname("猪脑1");
				tB_Dish.setDishprice(40);
				
				
				
				new DishDao().save(tB_Dish);

				// 查询dish表的菜品个数
				System.out.println(new DishDao().getAll().size());

				// 查询Dish表中pk为5的dish的dishname
				System.out.println(new DishDao().get(5).getDishname());
				// 查询Dish表中pk为5的dish的dishprice
				System.out.println(new DishDao().get(5).getDishprice());

				// 查询Dish表中所有dishname为"猪脑2"的菜品个数
				System.out.println(new DishDao().findBy("dishname", "猪脑2", null, true).size());
				// 查询Dish表中所有dishprice为"40"的菜品
				System.out.print("---------------------------遍历菜品");
				ArrayList<TB_Dish> arraylist = (ArrayList<TB_Dish>) new DishDao().findBy("dishprice", "40", null, true);
				
				Iterator it = arraylist.iterator();
		        while(it.hasNext()){
		        	TB_Dish dish = (TB_Dish) it.next();
		            System.out.println(dish.getDishname());
		            System.out.println(dish.getDishprice());
		       
		        }
				System.out.println(new DishDao().findBy("dishprice", "40", null, true).size());
				//
				System.out.println(new PictureDao().get(1).getLocation());
	}

}
