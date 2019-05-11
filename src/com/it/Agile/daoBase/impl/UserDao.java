package com.it.Agile.daoBase.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.it.Agile.daoBase.*;
import com.it.Agile.bean.TB_User;
import com.it.Agile.util.DBUtil;

/**
 * UserDao与TB_User绑定
 * */
public class UserDao extends BaseDao<TB_User, Integer> {
	public UserDao() {
		//必须显性初始化
		super(TB_User.class);
	}
	
	public boolean updateByID(TB_User user) {
		String sql="update tb_user set password = ? WHERE username = ?";
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getPassword());
			pstmt.setString(2, user.getUsername());
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
