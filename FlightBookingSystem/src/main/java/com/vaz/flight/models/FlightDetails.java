package com.vaz.flight.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;



@Entity
@Table(name = "flightdetails")
public class FlightDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "flightid")
	private Integer flightId;
	@Column(name = "flightnumber")
	private String flightNumber;
	@Column(name = "flightname")
	private String flightName;
	@Column(name = "source")
	private String source;
	@Column(name = "destination")
	private String destination;
	@Column(name = "distance")
	private float distance;
	@Column(name = "days")
	private String days;
	@Column(name = "luggage")
	private String luggage;
	@Column(name = "arrival")
	private LocalDateTime arrival;
	@Column(name = "departure")
	private LocalDateTime departure;
	@Column(name = "imagename")
	private String imageName;
	@Column(name = "extrafacility")
	private String extraFacility;
	@Column(name = "duration")
	private String duration;

	/**
	 * 
	 */
	public FlightDetails() {
		super();
	}

	/**
	 * @param flightId
	 * @param flightNumber
	 * @param flightName
	 * @param source
	 * @param destination
	 * @param distance
	 * @param days
	 * @param luggage
	 * @param arrival
	 * @param departure
	 * @param imageName
	 * @param extraFacility
	 * @param duration
	 */
	public FlightDetails(Integer flightId, String flightNumber, String flightName, String source, String destination,
			float distance, String days, String luggage, LocalDateTime arrival, LocalDateTime departure,
			String imageName, String extraFacility, String duration) {
		super();
		this.flightId = flightId;
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.days = days;
		this.luggage = luggage;
		this.arrival = arrival;
		this.departure = departure;
		this.imageName = imageName;
		this.extraFacility = extraFacility;
		this.duration = duration;
	}

	/**
	 * @return the arrival
	 */
	public LocalDateTime getArrival() {
		return arrival;
	}

	/**
	 * @param arrival the arrival to set
	 */
	public void setArrival(LocalDateTime arrival) {
		this.arrival = arrival;
	}

	/**
	 * @return the departure
	 */
	public LocalDateTime getDeparture() {
		return departure;
	}

	/**
	 * @param departure the departure to set
	 */
	public void setDeparture(LocalDateTime departure) {
		this.departure = departure;
	}

	/**
	 * @return the flightId
	 */
	public Integer getFlightId() {
		return flightId;
	}

	/**
	 * @param flightId the flightId to set
	 */
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
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
	 * @return the distance
	 */
	public float getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(float distance) {
		this.distance = distance;
	}

	/**
	 * @return the days
	 */
	public String getDays() {
		return days;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(String days) {
		this.days = days;
	}


	/**
	 * @return the luggage
	 */
	public String getLuggage() {
		return luggage;
	}

	/**
	 * @param luggage the luggage to set
	 */
	public void setLuggage(String luggage) {
		this.luggage = luggage;
	}

	/**
	 * @return the flightName
	 */
	public String getFlightName() {
		return flightName;
	}

	/**
	 * @param flightName the flightName to set
	 */
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	/**
	 * @return the extraFacility
	 */
	public String getExtraFacility() {
		return extraFacility;
	}

	/**
	 * @param extraFacility the extraFacility to set
	 */
	public void setExtraFacility(String extraFacility) {
		this.extraFacility = extraFacility;
	}

	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "FlightDetails [flightId=" + flightId + ", flightNumber=" + flightNumber + ", flightName=" + flightName
				+ ", source=" + source + ", destination=" + destination + ", distance=" + distance + ", days=" + days
				+ ", luggage=" + luggage + ", arrival=" + arrival + ", departure=" + departure + ", imageName="
				+ imageName + ", extraFacility=" + extraFacility + ", duration=" + duration + "]";
	}
	
	public String returnArrivalHourAndMinute() {
		String hour ="";
		hour = String.format("%02d:%02d", this.arrival.getHour(), this.arrival.getMinute());
		return hour;
	}

	public String returnDepartureHourAndMinute() {
		String hour ="";
		hour = String.format("%02d:%02d", this.departure.getHour(), this.departure.getMinute());
		return hour;
	}
	
	public String getDepartureFormatedDate() {
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");  
	    return this.departure.format(myFormatObj); 
	}
	public String getArrivalFormatedDate() {
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");  
		return this.arrival.format(myFormatObj); 
	}
	
}