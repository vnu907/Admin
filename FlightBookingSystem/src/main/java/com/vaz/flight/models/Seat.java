package com.vaz.flight.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "seat")

public class Seat implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "seatclass")
	private String seatclass;
	@Column(name = "flightid")
	private Integer flightid;
	@Column(name = "priceforbooking")
	private float priceforbooking;
	@Column(name = "priceforcancel")
	private float priceforcancel;
	@Column(name = "tax")
	private float tax;

	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param seatclass
	 * @param flightid
	 * @param priceforbooking
	 * @param priceforcancel
	 * @param tax
	 */
	public Seat(Integer id, String seatclass, Integer flightid, float priceforbooking, float priceforcancel,
			float tax) {
		super();
		this.id = id;
		this.seatclass = seatclass;
		this.flightid = flightid;
		this.priceforbooking = priceforbooking;
		this.priceforcancel = priceforcancel;
		this.tax = tax;
	}

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
	 * @return the seatclass
	 */
	public String getSeatclass() {
		return seatclass;
	}

	/**
	 * @param seatClass the seatclass to set
	 */
	public void setSeatclass(String seatclass) {
		this.seatclass = seatclass;
	}

	/**
	 * @return the flightid
	 */
	public Integer getFlightid() {
		return flightid;
	}

	/**
	 * @param flightid the flightid to set
	 */
	public void setFlightid(Integer flightid) {
		this.flightid = flightid;
	}

	/**
	 * @return the priceforbooking
	 */
	public float getPriceforbooking() {
		return priceforbooking;
	}

	/**
	 * @param priceforbooking the priceforbooking to set
	 */
	public void setPriceforbooking(float priceforbooking) {
		this.priceforbooking = priceforbooking;
	}

	/**
	 * @return the priceforcancel
	 */
	public float getPriceforcancel() {
		return priceforcancel;
	}

	/**
	 * @param priceforcancel the priceforcancel to set
	 */
	public void setPriceforcancel(float priceforcancel) {
		this.priceforcancel = priceforcancel;
	}

	/**
	 * @return the tax
	 */
	public float getTax() {
		return tax;
	}

	/**
	 * @param tax the tax to set
	 */
	public void setTax(float tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Seat [id=" + id + ", seatclass=" + seatclass + ", flightid=" + flightid + ", priceforbooking="
				+ priceforbooking + ", priceforcancel=" + priceforcancel + ", tax=" + tax + "]";
	}
}
