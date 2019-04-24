package com.it.Agile.daoBase.impl;

import com.it.Agile.bean.TB_Dish;
import com.it.Agile.daoBase.BaseDao;

public class DishDao extends BaseDao<TB_Dish, Integer> {
	public DishDao() {
		super(TB_Dish.class);
	}
}
