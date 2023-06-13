package com.vaz.flight.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "airport")

public class Airport  implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "nameofairport")
	private String nameofairport;
	@Column(name = "flightid")
	private Integer flightid;
	@Column(name = "country")
	private String country;
	@Column(name = "city")
	private String city;

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 
	 */
	public Airport() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nameofairport
	 * @param flightid
	 * @param country
	 * @param city
	 */
	public Airport(Integer id, String nameofairport, Integer flightid, String country, String city) {
		super();
		this.id = id;
		this.nameofairport = nameofairport;
		this.flightid = flightid;
		this.country = country;
		this.city = city;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the nameofairport
	 */
	public String getNameofairport() {
		return nameofairport;
	}

	/**
	 * @param nameofairport the nameofairport to set
	 */
	public void setNameofairport(String nameofairport) {
		this.nameofairport = nameofairport;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Airport [id=" + id + ", nameofairport=" + nameofairport + ", flightid=" + flightid + ", country="
				+ country + ", city=" + city + "]";
	}

	
}
