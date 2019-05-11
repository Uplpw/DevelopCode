/**
 * 
 */
package com.it.Agile.daoBase.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.it.Agile.daoBase.BaseDao;
import com.it.Agile.bean.TB_UserInfo;
import com.it.Agile.util.DBUtil;

/**
 * @author lpw
 *
 */
public class UserInfoDao extends BaseDao<TB_UserInfo, Integer>{
	public UserInfoDao() {
		super(TB_UserInfo.class);
	}
	
	public  ArrayList<TB_UserInfo> getTB_UserinfoByUser_Id(String username)
	{
		return (ArrayList<TB_UserInfo>) findBy("username", username, null, true);
	}
	
	
	public boolean updateByID(TB_UserInfo user) {
		String sql="update tb_userinfo set userpicture = ?, usertelephone=?, petname=? WHERE username = ?";
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserpicture());
			pstmt.setString(2, user.getUsertelephone());
			pstmt.setString(3, user.getPetname());
			pstmt.setString(4, user.getUsername());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			DBUtil.closeJDBC(null, pstmt, conn);
		}
	}
}
