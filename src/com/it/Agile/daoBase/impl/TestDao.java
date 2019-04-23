package com.it.Agile.daoBase.impl;

import com.it.Agile.bean.TB_User;
import com.it.Agile.util.Base64Util;
import com.it.Agile.util.MD5Util;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestDao {

	public TestDao() {
	}

	public static void main(String[] args) {
		// 插入操作: 密码经过base64编码后再MD5加密
		TB_User tB_User = new TB_User();
		tB_User.setPassword(MD5Util.encode(Base64Util.encode("123123")));
		tB_User.setUsername("1234444");
		new UserDao().save(tB_User);

		// 查询User表的用户个数
		System.out.println(new UserDao().getAll().size());

		// 查询User表中pk为5的user的username
		System.out.println(new UserDao().get(5).getUsername());

		// 查询User表中所有username为"1234444"的用户个数
		System.out.println(new UserDao().findBy("username", "1234444", null, true).size());

		System.out.println(new PictureDao().get(1).getLocation());

	}
}
