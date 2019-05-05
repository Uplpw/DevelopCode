package com.it.Agile.bean;

import java.math.BigDecimal;

public class TB_Shop {
	private String username;
	private String dishname;
	private BigDecimal dishprice;
	private String dishpicture;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the dishname
	 */
	public String getDishname() {
		return dishname;
	}
	/**
	 * @param dishname the dishname to set
	 */
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	/**
	 * @return the dishprice
	 */
	public BigDecimal getDishprice() {
		return dishprice;
	}
	/**
	 * @param dishprice the dishprice to set
	 */
	public void setDishprice(BigDecimal dishprice) {
		this.dishprice = dishprice;
	}
	/**
	 * @return the dishpicture
	 */
	public String getDishpicture() {
		return dishpicture;
	}
	/**
	 * @param dishpicture the dishpicture to set
	 */
	public void setDishpicture(String dishpicture) {
		this.dishpicture = dishpicture;
	}
	
	
}
