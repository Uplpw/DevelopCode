package com.it.Agile.daoBase.impl;

import java.util.ArrayList;
import java.util.Iterator;


import com.it.Agile.bean.TB_Dish;



public class TestDish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		// �������
				TB_Dish tB_Dish = new TB_Dish();
				tB_Dish.setDishname("����1");
				tB_Dish.setDishprice(40);
				
				
				
				new DishDao().save(tB_Dish);

				// ��ѯdish��Ĳ�Ʒ����
				System.out.println(new DishDao().getAll().size());

				// ��ѯDish����pkΪ5��dish��dishname
				System.out.println(new DishDao().get(5).getDishname());
				// ��ѯDish����pkΪ5��dish��dishprice
				System.out.println(new DishDao().get(5).getDishprice());

				// ��ѯDish��������dishnameΪ"����2"�Ĳ�Ʒ����
				System.out.println(new DishDao().findBy("dishname", "����2", null, true).size());
				// ��ѯDish��������dishpriceΪ"40"�Ĳ�Ʒ
				System.out.print("---------------------------������Ʒ");
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
