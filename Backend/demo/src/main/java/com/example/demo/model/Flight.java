package com.example.demo.model;

import jakarta.persistence.*;


@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String departureLocation;
    private String departureDateDate;
    private String departureDateTime;
    private String destinationLocation;
    private String destinationDate;
    private String destinationDateTime;
    private double price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartureLocation() {
		return departureLocation;
	}
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}
	public String getDepartureDateDate() {
		return departureDateDate;
	}
	public void setDepartureDateDate(String departureDateDate) {
		this.departureDateDate = departureDateDate;
	}
	public String getDepartureDateTime() {
		return departureDateTime;
	}
	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = departureDateTime;
	}
	public String getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	public String getDestinationDate() {
		return destinationDate;
	}
	public void setDestinationDate(String destinationDate) {
		this.destinationDate = destinationDate;
	}
	public String getDestinationDateTime() {
		return destinationDateTime;
	}
	public void setDestinationDateTime(String destinationDateTime) {
		this.destinationDateTime = destinationDateTime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Flight(Long id, String departureLocation, String departureDateDate, String departureDateTime,
			String destinationLocation, String destinationDate, String destinationDateTime, double price) {
		super();
		this.id = id;
		this.departureLocation = departureLocation;
		this.departureDateDate = departureDateDate;
		this.departureDateTime = departureDateTime;
		this.destinationLocation = destinationLocation;
		this.destinationDate = destinationDate;
		this.destinationDateTime = destinationDateTime;
		this.price = price;
	}

    // Getters and setters

    // Constructors
}
