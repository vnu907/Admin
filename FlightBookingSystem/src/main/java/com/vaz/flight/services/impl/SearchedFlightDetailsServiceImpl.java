package com.vaz.flight.services.impl;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaz.flight.models.Airport;
import com.vaz.flight.models.FlightDetails;
import com.vaz.flight.models.Search;
import com.vaz.flight.models.SearchedFlightDetails;
import com.vaz.flight.models.Seat;
import com.vaz.flight.services.AirportService;
import com.vaz.flight.services.FlightService;
import com.vaz.flight.services.SearchedFlightDetailsService;
import com.vaz.flight.services.SeatService;


@Service
public class SearchedFlightDetailsServiceImpl implements SearchedFlightDetailsService {

	@Autowired
	private FlightService flightService;

	@Autowired
	private SeatService seatService;
	@Autowired
	private AirportService airportService;

	/**
	 * 
	 */
	public SearchedFlightDetailsServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public SearchedFlightDetails getSearchDetails(Search search) {
		// TODO Auto-generated method stub
		SearchedFlightDetails searchFlightDetails = new SearchedFlightDetails();
		ArrayList<Seat> seatList = new ArrayList<Seat>();
		ArrayList<Airport> airportSourceList = new ArrayList<Airport>();
		ArrayList<Airport> airportDestinationList = new ArrayList<Airport>();
		searchFlightDetails.setFlightList(flightService.getFlightBySourceAndDestinationAndDeparture(search));
		for (int i = 0; i < searchFlightDetails.getFlightList().size(); i++) {
			Seat seat = seatService.getSeatByClassAndFlightId(search.getClassOfjourney(),
					searchFlightDetails.getFlightList().get(i).getFlightId());
			Airport sourceairport = airportService.getAirportDetailsByFlightIdAndCity(
					searchFlightDetails.getFlightList().get(i).getFlightId(),
					searchFlightDetails.getFlightList().get(i).getSource());
			airportSourceList.add(sourceairport);
			Airport desitinationairport = airportService.getAirportDetailsByFlightIdAndCity(
					searchFlightDetails.getFlightList().get(i).getFlightId(),
					searchFlightDetails.getFlightList().get(i).getDestination());
			airportDestinationList.add(desitinationairport);
			seatList.add(seat);
		}
		searchFlightDetails.setAirportSourceList(airportSourceList);
		searchFlightDetails.setAirportDestinationList(airportDestinationList);
		searchFlightDetails.setSeatList(seatList);
		return searchFlightDetails;
	}

	@Override
	public SearchedFlightDetails saveFlightAndSeat(FlightDetails flight, Seat seat) {
		// TODO Auto-generated method stub
		return null;
	}

}

