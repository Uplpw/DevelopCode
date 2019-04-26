package com.it.Agile.daoBase.impl;

import com.it.Agile.bean.TB_User;
import com.it.Agile.daoBase.BaseDao;

/**
 * UserDao与TB_User绑定
 * */
public class UserDao extends BaseDao<TB_User, Integer> {
	public UserDao() {
		//必须显性初始化
		super(TB_User.class);
	}
}
