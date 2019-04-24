package com.it.Agile.bean;

/**
 * @author youwannapieceme
 * @LastModifiedBy IGK_DLS
 * @LastModifiedDate 2019/04/24
 */
import java.math.BigDecimal;

public class TB_Dish {

	private String dishname;
	private BigDecimal dishprice;

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
}
