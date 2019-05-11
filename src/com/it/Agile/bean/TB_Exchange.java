/**
 * 
 */
package com.it.Agile.bean;

import java.math.BigDecimal;

/**
 * @author lpw
 *
 */
public class TB_Exchange {
	private String exchangename;
	private String exchangepicture;
	private BigDecimal exchangecredit;
	private String exchangecategory;
	/**
	 * @return the exchangename
	 */
	public String getExchangename() {
		return exchangename;
	}
	/**
	 * @param exchangename the exchangename to set
	 */
	public void setExchangename(String exchangename) {
		this.exchangename = exchangename;
	}
	/**
	 * @return the exchangepicture
	 */
	public String getExchangepicture() {
		return exchangepicture;
	}
	/**
	 * @param exchangepicture the exchangepicture to set
	 */
	public void setExchangepicture(String exchangepicture) {
		this.exchangepicture = exchangepicture;
	}
	/**
	 * @return the exchangcredit
	 */
	public BigDecimal getExchangecredit() {
		return exchangecredit;
	}
	/**
	 * @param exchangcredit the exchangcredit to set
	 */
	public void setExchangecredit(BigDecimal exchangcredit) {
		this.exchangecredit = exchangcredit;
	}
	/**
	 * @return the exchangecategory
	 */
	public String getExchangecategory() {
		return exchangecategory;
	}
	/**
	 * @param exchangecategory the exchangecategory to set
	 */
	public void setExchangecategory(String exchangecategory) {
		this.exchangecategory = exchangecategory;
	}
	
}
