package com.vaz.flight.models;

import java.util.*;


public class SearchedFlightDetails {

	private int id;
	private List<FlightDetails> flightList;
	private List<Seat> seatList;
	private List<Airport> airportSourceList;
	private List<Airport> airportDestinationList;

	
	public SearchedFlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @param id
	 * @param flightList
	 * @param seatList
	 * @param airportSourceList
	 * @param airportDestinationList
	 */
	public SearchedFlightDetails(int id, List<FlightDetails> flightList, List<Seat> seatList,
			List<Airport> airportSourceList, List<Airport> airportDestinationList) {
		super();
		this.id = id;
		this.flightList = flightList;
		this.seatList = seatList;
		this.airportSourceList = airportSourceList;
		this.airportDestinationList = airportDestinationList;
	}


	/**
	 * @return the airportSourceList
	 */
	public List<Airport> getAirportSourceList() {
		return airportSourceList;
	}


	/**
	 * @param airportSourceList the airportSourceList to set
	 */
	public void setAirportSourceList(List<Airport> airportSourceList) {
		this.airportSourceList = airportSourceList;
	}


	/**
	 * @return the airportDestinationList
	 */
	public List<Airport> getAirportDestinationList() {
		return airportDestinationList;
	}


	/**
	 * @param airportDestinationList the airportDestinationList to set
	 */
	public void setAirportDestinationList(List<Airport> airportDestinationList) {
		this.airportDestinationList = airportDestinationList;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the flightList
	 */
	public List<FlightDetails> getFlightList() {
		return flightList;
	}

	/**
	 * @param flightList the flightList to set
	 */
	public void setFlightList(List<FlightDetails> flightList) {
		this.flightList = flightList;
	}

	/**
	 * @return the seatList
	 */
	public List<Seat> getSeatList() {
		return seatList;
	}

	/**
	 * @param seatList the seatList to set
	 */
	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
	}


	@Override
	public String toString() {
		return "SearchedFlightDetails [id=" + id + ", flightList=" + flightList + ", seatList=" + seatList
				+ ", airportSourceList=" + airportSourceList + ", airportDestinationList=" + airportDestinationList
				+ "]";
	}

	

}
