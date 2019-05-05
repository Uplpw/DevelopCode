package com.it.Agile.daoBase.impl;

import java.util.ArrayList;

import com.it.Agile.bean.TB_Shop;
import com.it.Agile.daoBase.BaseDao;

public class ShopcarDao extends BaseDao<TB_Shop,Integer>{
	
	public ShopcarDao(){
		super(TB_Shop.class);
	}
	public ArrayList<TB_Shop> getTB_ShopcarByUser_Id(String username)
	{
		return (ArrayList<TB_Shop>) findBy("username", username, null, true);
	}
	/*public static void main(String[] args)
	{
		list = new ShopcarDao().getTB_ShopcarByUser_Id(1);
		System.out.println(list.size());
	}*/
}
