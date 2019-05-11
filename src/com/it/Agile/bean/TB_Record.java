package com.it.Agile.bean;

import java.math.BigDecimal;

public class TB_Record {
	private int pk;
	private String username;
	private String dishname;
	private BigDecimal dishprice;
	private String ordertime;
	private int number;
	private String status;
	
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the pk
	 */
	public int getPk() {
		return pk;
	}
	/**
	 * @param pk the pk to set
	 */
	public void setPk(int pk) {
		this.pk = pk;
	}
	
	/**
	 * @return the ordertime
	 */
	public String getOrdertime() {
		return ordertime;
	}
	/**
	 * @param ordertime the ordertime to set
	 */
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public BigDecimal getDishprice() {
		return dishprice;
	}
	public void setDishprice(BigDecimal dishprice) {
		this.dishprice = dishprice;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
