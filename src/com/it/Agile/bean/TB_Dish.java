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

	private String dishName;
	private BigDecimal dishPrice;
	private String dishPicture;
	private String dishCategory;

	public TB_Dish() {
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public BigDecimal getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(BigDecimal dishPrice) {
		this.dishPrice = dishPrice;
	}

	public String getDishPicture() {
		return dishPicture;
	}

	public void setDishPicture(String dishPicture) {
		this.dishPicture = dishPicture;
	}

	public String getDishCategory() {
		return dishCategory;
	}

	public void setDishCategory(String dishCategory) {
		this.dishCategory = dishCategory;
	}

}
