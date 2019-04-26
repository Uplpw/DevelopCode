package com.it.Agile.daoBase.impl;

/**
 * 测试Dao类，该类存放所有的测试代码，他人也可以根据该测试Dao迅速熟悉Dao已经封装好的操作
 */

import com.it.Agile.bean.TB_User;
import com.it.Agile.util.Base64Util;
import com.it.Agile.util.MD5Util;

public class TestDao {

	public TestDao() {
	}

	public static void main(String[] args) {

		/**
		 * UserDao类操作演示
		 * 
		 * @author IGK_DLS
		 */
		System.out.println(Base64Util.encode("123"));

		// 插入操作: 密码经过base64编码后再MD5加密
		TB_User tB_User = new TB_User();
		tB_User.setPassword(MD5Util.encode(Base64Util.encode("123123")));
		tB_User.setUsername("1234444");
		new UserDao().save(tB_User);

		// 查询TB_User表的用户个数
		System.out.println(new UserDao().getAll().size());

		// 查询TB_User表中所有username为"1234444"的用户个数
		System.out.println(new UserDao().findBy("username", "1234444", null, true).size());

		// 查询TB_User表中所有username为"1234444"的第一个用户的密码
		System.out.println(new UserDao().findBy("username", "1234444", null, true).get(0).getPassword());

		/**
		 * PcitureDao类操作演示
		 * 
		 * @author IGK_DLS
		 */
		// 得到TB_Picturepk为1的图片地址
		System.out.println(new PictureDao().get(1).getLocation());

		/**
		 * DishDao类操作演示
		 * 
		 * @author youwannapieceme
		 */

		System.out.println(new DishDao().getAll().size());
	}
}
