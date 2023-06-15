package com.vaz.flight.models;
import java.io.Serializable;

import javax.persistence.*;

import com.vaz.flight.models.TicketBooking;
@Entity
@Table(name = "travelcustomer")
public class TravelCustomer implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "gender")
	private String gender;
	@Column(name = "seatnumber")
	private String seatNumber;
	@Column(name = "cabin")
	private String cabin;
	@Column(name = "checkin")
	private String checkIn;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ticketid", nullable=false)
	private TicketBooking ticket;

	/**
	 * @return the cabin
	 */
	public String getCabin() {
		return cabin;
	}

	/**
	 * @param cabin the cabin to set
	 */
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	/**
	 * @return the checkIn
	 */
	public String getCheckIn() {
		return checkIn;
	}

	/**
	 * @param checkIn the checkIn to set
	 */
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	/**
	 * 
	 */
	public TravelCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the seatNumber
	 */
	public String getSeatNumber() {
		return seatNumber;
	}

	/**
	 * @param seatNumber the seatNumber to set
	 */
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
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
	 * @return the ticket
	 */
	public TicketBooking getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(TicketBooking ticket) {
		this.ticket = ticket;
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param seatNumber
	 * @param cabin
	 * @param checkIn
	 * @param ticket
	 */
	public TravelCustomer(Integer id, String firstName, String lastName, String gender, String seatNumber, String cabin,
			String checkIn, TicketBooking ticket) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.seatNumber = seatNumber;
		this.cabin = cabin;
		this.checkIn = checkIn;
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "TravelCustomer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", seatNumber=" + seatNumber + ", cabin=" + cabin + ", checkIn=" + checkIn + ", ticket=" + ticket
				+ "]";
	}

}
