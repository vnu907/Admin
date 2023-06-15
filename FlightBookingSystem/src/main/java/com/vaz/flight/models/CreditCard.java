package com.vaz.flight.models;


import java.io.Serializable;

public class CreditCard implements Serializable {

private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Long cardnumber;
	private String name;
	private String expiryYear;
	private String expiryMonth;
	private Integer cvv;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the cardnumber
	 */
	public Long getCardnumber() {
		return cardnumber;
	}

	/**
	 * @param cardnumber the cardnumber to set
	 */
	public void setCardnumber(Long cardnumber) {
		this.cardnumber = cardnumber;
	}


	/**
	 * @return the cvv
	 */
	public Integer getCvv() {
		return cvv;
	}

	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	/**
	 * 
	 */
	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * @return the expiryYear
	 */
	public String getExpiryYear() {
		return expiryYear;
	}

	/**
	 * @param expiryYear the expiryYear to set
	 */
	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}

	/**
	 * @return the expiryMonth
	 */
	public String getExpiryMonth() {
		return expiryMonth;
	}

	/**
	 * @param expiryMonth the expiryMonth to set
	 */
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param id
	 * @param cardnumber
	 * @param name
	 * @param expiryYear
	 * @param expiryMonth
	 * @param cvv
	 */
	public CreditCard(Integer id, Long cardnumber, String name, String expiryYear, String expiryMonth, Integer cvv) {
		super();
		this.id = id;
		this.cardnumber = cardnumber;
		this.name = name;
		this.expiryYear = expiryYear;
		this.expiryMonth = expiryMonth;
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", cardnumber=" + cardnumber + ", name=" + name + ", expiryYear=" + expiryYear
				+ ", expiryMonth=" + expiryMonth + ", cvv=" + cvv + "]";
	}

	
	
}
