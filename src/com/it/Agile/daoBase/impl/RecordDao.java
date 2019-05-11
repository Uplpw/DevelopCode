package com.it.Agile.daoBase.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.it.Agile.daoBase.*;
import com.it.Agile.bean.TB_Record;
import com.it.Agile.util.DBUtil;

public class RecordDao extends BaseDao<TB_Record,Integer>{
	public RecordDao(){
		super(TB_Record.class);
	}
	
	public ArrayList<TB_Record> getTB_PersonalorderByUser_Id(String username)
	{
		return (ArrayList<TB_Record>) findBy("username", username, "pk", true);
	}
	
	public boolean updateByPk(TB_Record record) {
		String sql="update tb_record set status = ? WHERE pk = ?";
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, record.getStatus());
			pstmt.setLong(2, record.getPk());
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
