package com.it.Agile.daoBase.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.it.Agile.bean.TB_AboutUs;
import com.it.Agile.util.DBUtil;


public class AboutUsDao {
	
		
		//关于我们
		public TB_AboutUs selectA()
		{
			TB_AboutUs au=new TB_AboutUs();
			
			String sql="SELECT * FROM tb_aboutus WHERE pk=1";
			Connection conn = DBUtil.getConnection();
			PreparedStatement pstmt = null;
			try {
				pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) {
					au.setName(rs.getString("name"));
					au.setContent(rs.getString("content"));	
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				DBUtil.closeJDBC(null, pstmt, conn);
			}
			System.out.println(au.getName());
			System.out.println(au.getContent());
			return au;
		}
		
		
		public TB_AboutUs selectB()
		{
			TB_AboutUs au=new TB_AboutUs();
			
			String sql="SELECT * FROM tb_aboutus WHERE pk=2";
			Connection conn = DBUtil.getConnection();
			PreparedStatement pstmt = null;
			try {
				pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) {
					au.setName(rs.getString("name"));
					au.setContent(rs.getString("content"));	
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				DBUtil.closeJDBC(null, pstmt, conn);
			}
			System.out.println(au.getName());
			System.out.println(au.getContent());
			return au;
		}
		
		public TB_AboutUs selectC()
		{
			TB_AboutUs au=new TB_AboutUs();
			
			String sql="SELECT * FROM tb_aboutus WHERE pk=3";
			Connection conn = DBUtil.getConnection();
			PreparedStatement pstmt = null;
			try {
				pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) {
					au.setName(rs.getString("name"));
					au.setContent(rs.getString("content"));	
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				DBUtil.closeJDBC(null, pstmt, conn);
			}
			System.out.println(au.getName());
			System.out.println(au.getContent());
			return au;
		}
	
}
	

