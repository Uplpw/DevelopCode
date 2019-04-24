package com.it.Agile.daoBase.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import com.it.Agile.bean.TB_Dish;

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
		// 插入操作: 密码经过base64编码后再MD5加密
		TB_User tB_User = new TB_User();
		tB_User.setPassword(MD5Util.encode(Base64Util.encode("123123")));
		tB_User.setUsername("1234444");
		new UserDao().save(tB_User);

		// 查询TB_User表的用户个数
		System.out.println(new UserDao().getAll().size());

		// 查询TB_User表中pk为5的user的username
		System.out.println(new UserDao().get(5).getUsername());

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
		// 插入一个新的菜品
		TB_Dish tB_Dish = new TB_Dish();
		tB_Dish.setDishname("鸡腿");
		tB_Dish.setDishprice(new BigDecimal("40"));
		new DishDao().save(tB_Dish);

		System.out.println(new DishDao().getAll().size());
		System.out.println(new DishDao().get(5).getDishname());
		System.out.println(new DishDao().get(5).getDishprice());

		System.out.println(new DishDao().findBy("dishname", "猪脑2", null, true).size());
		System.out.println("-------------------------------------------");
		ArrayList<TB_Dish> arraylist = (ArrayList<TB_Dish>) new DishDao().findBy("dishprice", "1.01", null, true);

		for (Iterator<TB_Dish> it = arraylist.iterator(); it.hasNext();) {
			TB_Dish dish = (TB_Dish) it.next();
			System.out.println(dish.getDishname());
			System.out.println(dish.getDishprice());

		}
		System.out.println(new DishDao().findBy("dishprice", "1.009", null, true).size());
	}
}
