package com.it.Agile.daoBase.impl;

import java.util.ArrayList;

import com.it.Agile.bean.TB_Personalorder;
import com.it.Agile.daoBase.BaseDao;

public class PersonalorderDao extends BaseDao<TB_Personalorder,Integer>{
	public PersonalorderDao(){
		//必须显性初始化
		super(TB_Personalorder.class);
	}
	public ArrayList<TB_Personalorder> getTB_PersonalorderByUser_Id(String username)
	{
		return (ArrayList<TB_Personalorder>) findBy("username", username, null, true);
	}
}
