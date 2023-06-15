package com.vaz.flight.models;
import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "seatstatus")
public class SeatStatus implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "flightid")
	private Integer flightid;
	@Column(name = "totalseats")
	private int totalseats;
	@Column(name = "availableseats")
	private int availableseats;
	@Column(name = "bookedseats")
	private int bookedseats;
	@Column(name = "economyseatstotal")
	private int economyseatstotal;
	@Column(name = "economyseatsavailable")
	private int economyseatsavailable;
	@Column(name = "economyseatsbooked")
	private int economyseatsbooked;
	@Column(name = "basiceconomyseatstotal")
	private int basiceconomyseatstotal;
	@Column(name = "basiceconomyseatsavailable")
	private int basiceconomyseatsavailable;
	@Column(name = "basiceconomyseatsbooked")
	private int basiceconomyseatsbooked;
	@Column(name = "premiumeconomyseatstotal")
	private int premiumeconomyseatstotal;
	@Column(name = "premiumeconomyseatsavailable")
	private int premiumeconomyseatsavailable;
	@Column(name = "premiumeconomyseatsbooked")
	private int premiumeconomyseatsbooked;
	@Column(name = "businessseatstotal")
	private int businessseatstotal;
	@Column(name = "businessseatsavailable")
	private int businessseatsavailable;
	@Column(name = "businessseatsbooked")
	private int businessseatsbooked;
	@Column(name = "firstseatstotal")
	private int firstseatstotal;
	@Column(name = "firstseatsavailable")
	private int firstseatsavailable;
	@Column(name = "firstseatsbooked")
	private int firstseatsbooked;

	/**
	 * 
	 */
	public SeatStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param flightid
	 * @param totalseats
	 * @param availableseats
	 * @param bookedseats
	 * @param economyseatstotal
	 * @param economyseatsavailable
	 * @param economyseatsbooked
	 * @param basiceconomyseatstotal
	 * @param basiceconomyseatsavailable
	 * @param basiceconomyseatsbooked
	 * @param premiumeconomyseatstotal
	 * @param premiumeconomyseatsavailable
	 * @param premiumeconomyseatsbooked
	 * @param businessseatstotal
	 * @param businessseatsavailable
	 * @param businessseatsbooked
	 * @param firstseatstotal
	 * @param firstseatsavailable
	 * @param firstseatsbooked
	 */
	public SeatStatus(Integer id, Integer flightid, int totalseats, int availableseats, int bookedseats, int economyseatstotal,
			int economyseatsavailable, int economyseatsbooked, int basiceconomyseatstotal,
			int basiceconomyseatsavailable, int basiceconomyseatsbooked, int premiumeconomyseatstotal,
			int premiumeconomyseatsavailable, int premiumeconomyseatsbooked, int businessseatstotal,
			int businessseatsavailable, int businessseatsbooked, int firstseatstotal, int firstseatsavailable,
			int firstseatsbooked) {
		super();
		this.id = id;
		this.flightid = flightid;
		this.totalseats = totalseats;
		this.availableseats = availableseats;
		this.bookedseats = bookedseats;
		this.economyseatstotal = economyseatstotal;
		this.economyseatsavailable = economyseatsavailable;
		this.economyseatsbooked = economyseatsbooked;
		this.basiceconomyseatstotal = basiceconomyseatstotal;
		this.basiceconomyseatsavailable = basiceconomyseatsavailable;
		this.basiceconomyseatsbooked = basiceconomyseatsbooked;
		this.premiumeconomyseatstotal = premiumeconomyseatstotal;
		this.premiumeconomyseatsavailable = premiumeconomyseatsavailable;
		this.premiumeconomyseatsbooked = premiumeconomyseatsbooked;
		this.businessseatstotal = businessseatstotal;
		this.businessseatsavailable = businessseatsavailable;
		this.businessseatsbooked = businessseatsbooked;
		this.firstseatstotal = firstseatstotal;
		this.firstseatsavailable = firstseatsavailable;
		this.firstseatsbooked = firstseatsbooked;
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
	 * @return the totalSeats
	 */
	public int getTotalSeats() {
		return totalseats;
	}

	/**
	 * @param totalSeats the totalSeats to set
	 */
	public void setTotalSeats(int totalseats) {
		this.totalseats = totalseats;
	}

	/**
	 * @return the availableSeats
	 */
	public int getAvailableSeats() {
		return availableseats;
	}

	/**
	 * @param availableSeats the availableSeats to set
	 */
	public void setAvailableSeats(int availableseats) {
		this.availableseats = availableseats;
	}

	/**
	 * @return the bookedSeats
	 */
	public int getBookedSeats() {
		return bookedseats;
	}

	/**
	 * @param bookedSeats the bookedSeats to set
	 */
	public void setBookedSeats(int bookedseats) {
		this.bookedseats = bookedseats;
	}

	/**
	 * @return the economyseatstotal
	 */
	public int getEconomyseatstotal() {
		return economyseatstotal;
	}

	/**
	 * @param economyseatstotal the economyseatstotal to set
	 */
	public void setEconomyseatstotal(int economyseatstotal) {
		this.economyseatstotal = economyseatstotal;
	}

	/**
	 * @return the economyseatsavailable
	 */
	public int getEconomyseatsavailable() {
		return economyseatsavailable;
	}

	/**
	 * @param economyseatsavailable the economyseatsavailable to set
	 */
	public void setEconomyseatsavailable(int economyseatsavailable) {
		this.economyseatsavailable = economyseatsavailable;
	}

	/**
	 * @return the economyseatsbooked
	 */
	public int getEconomyseatsbooked() {
		return economyseatsbooked;
	}

	/**
	 * @param economyseatsbooked the economyseatsbooked to set
	 */
	public void setEconomyseatsbooked(int economyseatsbooked) {
		this.economyseatsbooked = economyseatsbooked;
	}

	/**
	 * @return the basiceconomyseatstotal
	 */
	public int getBasiceconomyseatstotal() {
		return basiceconomyseatstotal;
	}

	/**
	 * @param basiceconomyseatstotal the basiceconomyseatstotal to set
	 */
	public void setBasiceconomyseatstotal(int basiceconomyseatstotal) {
		this.basiceconomyseatstotal = basiceconomyseatstotal;
	}

	/**
	 * @return the basiceconomyseatsavailable
	 */
	public int getBasiceconomyseatsavailable() {
		return basiceconomyseatsavailable;
	}

	/**
	 * @param basiceconomyseatsavailable the basiceconomyseatsavailable to set
	 */
	public void setBasiceconomyseatsavailable(int basiceconomyseatsavailable) {
		this.basiceconomyseatsavailable = basiceconomyseatsavailable;
	}

	/**
	 * @return the basiceconomyseatsbooked
	 */
	public int getBasiceconomyseatsbooked() {
		return basiceconomyseatsbooked;
	}

	/**
	 * @param basiceconomyseatsbooked the basiceconomyseatsbooked to set
	 */
	public void setBasiceconomyseatsbooked(int basiceconomyseatsbooked) {
		this.basiceconomyseatsbooked = basiceconomyseatsbooked;
	}

	/**
	 * @return the premiumeconomyseatstotal
	 */
	public int getPremiumeconomyseatstotal() {
		return premiumeconomyseatstotal;
	}

	/**
	 * @param premiumeconomyseatstotal the premiumeconomyseatstotal to set
	 */
	public void setPremiumeconomyseatstotal(int premiumeconomyseatstotal) {
		this.premiumeconomyseatstotal = premiumeconomyseatstotal;
	}

	/**
	 * @return the premiumeconomyseatsavailable
	 */
	public int getPremiumeconomyseatsavailable() {
		return premiumeconomyseatsavailable;
	}

	/**
	 * @param premiumeconomyseatsavailable the premiumeconomyseatsavailable to set
	 */
	public void setPremiumeconomyseatsavailable(int premiumeconomyseatsavailable) {
		this.premiumeconomyseatsavailable = premiumeconomyseatsavailable;
	}

	/**
	 * @return the premiumeconomyseatsbooked
	 */
	public int getPremiumeconomyseatsbooked() {
		return premiumeconomyseatsbooked;
	}

	/**
	 * @param premiumeconomyseatsbooked the premiumeconomyseatsbooked to set
	 */
	public void setPremiumeconomyseatsbooked(int premiumeconomyseatsbooked) {
		this.premiumeconomyseatsbooked = premiumeconomyseatsbooked;
	}

	/**
	 * @return the businessseatstotal
	 */
	public int getBusinessseatstotal() {
		return businessseatstotal;
	}

	/**
	 * @param businessseatstotal the businessseatstotal to set
	 */
	public void setBusinessseatstotal(int businessseatstotal) {
		this.businessseatstotal = businessseatstotal;
	}

	/**
	 * @return the businessseatsavailable
	 */
	public int getBusinessseatsavailable() {
		return businessseatsavailable;
	}

	/**
	 * @param businessseatsavailable the businessseatsavailable to set
	 */
	public void setBusinessseatsavailable(int businessseatsavailable) {
		this.businessseatsavailable = businessseatsavailable;
	}

	/**
	 * @return the businessseatsbooked
	 */
	public int getBusinessseatsbooked() {
		return businessseatsbooked;
	}

	/**
	 * @param businessseatsbooked the businessseatsbooked to set
	 */
	public void setBusinessseatsbooked(int businessseatsbooked) {
		this.businessseatsbooked = businessseatsbooked;
	}

	/**
	 * @return the firstseatstotal
	 */
	public int getFirstseatstotal() {
		return firstseatstotal;
	}

	/**
	 * @param firstseatstotal the firstseatstotal to set
	 */
	public void setFirstseatstotal(int firstseatstotal) {
		this.firstseatstotal = firstseatstotal;
	}

	/**
	 * @return the firstseatsavailable
	 */
	public int getFirstseatsavailable() {
		return firstseatsavailable;
	}

	/**
	 * @param firstseatsavailable the firstseatsavailable to set
	 */
	public void setFirstseatsavailable(int firstseatsavailable) {
		this.firstseatsavailable = firstseatsavailable;
	}

	/**
	 * @return the firstseatsbooked
	 */
	public int getFirstseatsbooked() {
		return firstseatsbooked;
	}

	/**
	 * @param firstseatsbooked the firstseatsbooked to set
	 */
	public void setFirstseatsbooked(int firstseatsbooked) {
		this.firstseatsbooked = firstseatsbooked;
	}

	@Override
	public String toString() {
		return "SeatStatus [id=" + id + ", flightid=" + flightid + ", totalseats=" + totalseats + ", availableseats="
				+ availableseats + ", bookedseats=" + bookedseats + ", economyseatstotal=" + economyseatstotal
				+ ", economyseatsavailable=" + economyseatsavailable + ", economyseatsbooked=" + economyseatsbooked
				+ ", basiceconomyseatstotal=" + basiceconomyseatstotal + ", basiceconomyseatsavailable="
				+ basiceconomyseatsavailable + ", basiceconomyseatsbooked=" + basiceconomyseatsbooked
				+ ", premiumeconomyseatstotal=" + premiumeconomyseatstotal + ", premiumeconomyseatsavailable="
				+ premiumeconomyseatsavailable + ", premiumeconomyseatsbooked=" + premiumeconomyseatsbooked
				+ ", businessseatstotal=" + businessseatstotal + ", businessseatsavailable=" + businessseatsavailable
				+ ", businessseatsbooked=" + businessseatsbooked + ", firstseatstotal=" + firstseatstotal
				+ ", firstseatsavailable=" + firstseatsavailable + ", firstseatsbooked=" + firstseatsbooked + "]";
	}

}
