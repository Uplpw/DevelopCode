/**
 * 
 */
package com.it.Agile.daoBase.impl;

import com.it.Agile.bean.TB_Dish;
import com.it.Agile.daoBase.BaseDao;

/**
 * @author lpw
 *
 */
public class DishPictureDao extends BaseDao<TB_Dish, Integer>{
	public DishPictureDao() {
		//必须显性初始化
		super(TB_Dish.class);
	}
}

