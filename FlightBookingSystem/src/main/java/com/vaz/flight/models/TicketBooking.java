package com.vaz.flight.models;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "ticketbooking")
public class TicketBooking implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticketid")
	private Integer ticketid;
	@Column(name = "customerid")
	private Integer customerid;
	@Column(name = "useremail")
	private String useremail;
	@Column(name = "email")
	private String email;
	@Column(name = "phonenumber")
	private String phoneNumber;
	@Column(name = "pnrnumber")
	private String pnrNumber;
	@Column(name = "bookingid")
	private String bookingId;

	
	@OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<TravelCustomer> travelCustomer;
	/**
	 * @return the useremail
	 */
	public String getUseremail() {
		return useremail;
	}

	/**
	 * @param useremail the useremail to set
	 */
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	/**
	 * @return the customerid
	 */
	public Integer getCustomerid() {
		return customerid;
	}

	/**
	 * @param customerid the customerid to set
	 */
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public TicketBooking() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the pnrNumber
	 */
	public String getPnrNumber() {
		return pnrNumber;
	}

	/**
	 * @param pnrNumber the pnrNumber to set
	 */
	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	/**
	 * @return the bookingId
	 */
	public String getBookingId() {
		return bookingId;
	}

	/**
	 * @param bookingId the bookingId to set
	 */
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	/**
	 * @return the travelCustomer
	 */
	public List<TravelCustomer> getTravelCustomer() {
		return travelCustomer;
	}

	/**
	 * @param travelCustomer the travelCustomer to set
	 */
	public void setTravelCustomer(List<TravelCustomer> travelCustomer) {
//		this.travelCustomer.addAll(travelCustomer);
		this.travelCustomer = travelCustomer;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getTicketid() {
		return ticketid;
	}

	public void setTicketid(Integer ticketid) {
		this.ticketid = ticketid;
	}
	public void addTravelCustomer(TravelCustomer travelCust) {
		travelCustomer.add(travelCust);
		travelCust.setTicket(this);
	}

	public void removeTravelCustomer(TravelCustomer travelCust) {
		travelCustomer.remove(travelCust);
		travelCust.setTicket(null);
	}

	/**
	 * @param ticketid
	 * @param customerid
	 * @param useremail
	 * @param email
	 * @param phoneNumber
	 * @param pnrNumber
	 * @param bookingId
	 * @param travelCustomer
	 */
	public TicketBooking(Integer ticketid, Integer customerid, String useremail, String email, String phoneNumber,
			String pnrNumber, String bookingId, List<TravelCustomer> travelCustomer) {
		super();
		this.ticketid = ticketid;
		this.customerid = customerid;
		this.useremail = useremail;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.pnrNumber = pnrNumber;
		this.bookingId = bookingId;
		this.travelCustomer = travelCustomer;
	}

	@Override
	public String toString() {
		return "TicketBooking [ticketid=" + ticketid + ", customerid=" + customerid + ", useremail=" + useremail
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", pnrNumber=" + pnrNumber + ", bookingId="
				+ bookingId + ", travelCustomer=" + travelCustomer + "]";
	}

}
