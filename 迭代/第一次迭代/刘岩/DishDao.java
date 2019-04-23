package com.it.Agile.daoBase.impl;

import com.it.Agile.bean.TB_Dish;
import com.it.Agile.bean.TB_User;
import com.it.Agile.daoBase.BaseDao;


	/**
	 * DishDao与TB_Dish绑定
	 * */
	public class DishDao extends BaseDao<TB_Dish, Integer> {
		public DishDao() {
			//必须显性初始化
			super(TB_Dish.class);
		}
}

