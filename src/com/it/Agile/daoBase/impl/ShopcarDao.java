package com.it.Agile.daoBase.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.it.Agile.daoBase.*;
import com.it.Agile.bean.TB_Shop;
import com.it.Agile.util.DBUtil;

public class ShopcarDao extends BaseDao<TB_Shop,Integer>{
	
	public ShopcarDao(){
		super(TB_Shop.class);
	}
	public ArrayList<TB_Shop> getTB_ShopcarByUser_Id(String username)
	{
		return (ArrayList<TB_Shop>) findBy("username", username, null, true);
	}
	
	public int getnumber(String username,String dishname) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int number=0;
		try {
			//System.out.println(1);
			connection = DBUtil.getConnection();
			//System.out.println(2);
			String sql="select * from tb_shop where username = " + username + " and dishname = '" + dishname + "';";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
			number=resultSet.getInt("number");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeJDBC(resultSet, preparedStatement, connection);
		}
		return number;
	}
	public void updatenumber(int number,String username,String dishname)
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			//System.out.println(1);
			connection = DBUtil.getConnection();
			//System.out.println(2);
			String sql="update tb_shop set number = " + number + " where username = " + username + " and dishname = '" + dishname + "';";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeJDBC(resultSet, preparedStatement, connection);
		}
	}
	public void deleteshopcar_dish(String username,String dishname) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			//System.out.println(1);
			connection = DBUtil.getConnection();
			//System.out.println(2);
			String sql="delete from tb_shop where username = " + username + " and username = " + username + " and dishname = '" + dishname + "';";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeJDBC(resultSet, preparedStatement, connection);
		}
	}

}
