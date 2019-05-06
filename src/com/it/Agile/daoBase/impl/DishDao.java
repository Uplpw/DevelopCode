package com.it.Agile.daoBase.impl;

import java.util.ArrayList;

import com.it.Agile.bean.TB_Dish;
import com.it.Agile.daoBase.BaseDao;

public class DishDao extends BaseDao<TB_Dish, Integer> {
	public DishDao() {
		super(TB_Dish.class);
	}
	public ArrayList<TB_Dish> getDishByPage(int currentPage,int pageSize)
	{
		ArrayList<TB_Dish> dishs = new ArrayList<TB_Dish>();
		ArrayList<TB_Dish> alldishs = null;
		alldishs = (ArrayList<TB_Dish>) new DishDao().getAll();
		int sum = 0;
		System.out.println(alldishs.get(0).getDishName());
		for(int i = 0; i < alldishs.size(); i++)
		{
			if( i > (currentPage-1)*pageSize ) {
				dishs.add(alldishs.get(i));
				sum++;
				if(sum==pageSize) break;
			}
		}
		return dishs;
	}
}
