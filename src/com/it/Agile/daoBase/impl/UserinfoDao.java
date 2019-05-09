package com.it.Agile.daoBase.impl;

import java.util.ArrayList;
import java.util.List;

import com.it.Agile.bean.TB_Userinfo;
import com.it.Agile.daoBase.BaseDao;

public class UserinfoDao extends BaseDao<TB_Userinfo,Integer>{
	public UserinfoDao() {
		//必须显性初始化
		super(TB_Userinfo.class);
	}
	public  ArrayList<TB_Userinfo> getTB_UserinfoByUser_Id(String username)
	{
		return (ArrayList<TB_Userinfo>) findBy("username", username, null, true);
	}
	public void save(List<TB_Userinfo> userinfo) {
		// TODO Auto-generated method stub
		
	}

}
