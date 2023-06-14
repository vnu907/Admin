package com.vaz.flight.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Search implements Serializable{
	
	
	
	
	private static final long serialVersionUID = 1L;
	private String source;
	private String destination;
	private LocalDateTime journeyDate;
	private LocalDateTime returnDate;
	private int passenger;
	private String classOfjourney;

	
	public Search() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param source
	 * @param destination
	 * @param journeyDate
	 * @param returnDate
	 * @param passenger
	 * @param classOfjourney
	 */
	public Search(String source, String destination, LocalDateTime journeyDate, LocalDateTime returnDate, int passenger,
			String classOfjourney) {
		super();
		this.source = source;
		this.destination = destination;
		this.journeyDate = journeyDate;
		this.returnDate = returnDate;
		this.passenger = passenger;
		this.classOfjourney = classOfjourney;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the journeyDate
	 */
	public LocalDateTime getJourneyDate() {
		return journeyDate;
	}

	/**
	 * @param journeyDate the journeyDate to set
	 */
	public void setJourneyDate(LocalDateTime journeyDate) {
		this.journeyDate = journeyDate;
	}

	/**
	 * @return the returnDate
	 */
	public LocalDateTime getReturnDate() {
		return returnDate;
	}

	/**
	 * @param returnDate the returnDate to set
	 */
	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}

	/**
	 * @return the passenger
	 */
	public int getPassenger() {
		return passenger;
	}

	/**
	 * @param passenger the passenger to set
	 */
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	/**
	 * @return the classOfjourney
	 */
	public String getClassOfjourney() {
		return classOfjourney;
	}

	/**
	 * @param classOfjourney the classOfjourney to set
	 */
	public void setClassOfjourney(String classOfjourney) {
		this.classOfjourney = classOfjourney;
	}

	@Override
	public String toString() {
		return "Search [source=" + source + ", destination=" + destination + ", journeyDate=" + journeyDate
				+ ", returnDate=" + returnDate + ", passenger=" + passenger + ", classOfjourney=" + classOfjourney
				+ "]";
	}

}
