package com.it.Agile.daoBase.impl;

import com.it.Agile.bean.TB_Dish;
import com.it.Agile.bean.TB_User;
import com.it.Agile.daoBase.BaseDao;


	/**
	 * DishDao��TB_Dish��
	 * */
	public class DishDao extends BaseDao<TB_Dish, Integer> {
		public DishDao() {
			//�������Գ�ʼ��
			super(TB_Dish.class);
		}
}

