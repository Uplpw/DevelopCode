/**
 * 
 */
package com.it.Agile.bean;

import java.math.BigDecimal;

/**
 * @author lpw
 *
 */
public class TB_Dish {
	
	private String dishname;
	private BigDecimal dishprice;
	private String dishpicture;
	private String dishcategory;
	
	public TB_Dish() {
	}
	
	public String getDishName() {
		return dishname;
	}
	public void setDishName(String name) {
		this.dishname = name;
	}
	
	public BigDecimal getDishPrice() {
		return dishprice;
	}
	public void setDishPrice(BigDecimal dishprice) {
		this.dishprice = dishprice;
	}
	
	public String getDishPicture() {
		return dishpicture;
	}
	public void setDishPicture(String dishpicture) {
		this.dishpicture = dishpicture;
	}
	
	public String getDishCategory() {
		return dishcategory;
	}
	public void setDishCategory(String dishcategory) {
		this.dishcategory = dishcategory;
	}
}
