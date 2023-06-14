package com.vaz.flight.services;
import org.springframework.stereotype.Service;

import com.vaz.flight.models.FlightDetails;
import com.vaz.flight.models.Search;
import com.vaz.flight.models.SearchedFlightDetails;
import com.vaz.flight.models.Seat;
@Service
public interface SearchedFlightDetailsService {

	
	public SearchedFlightDetails getSearchDetails(Search search);
	public SearchedFlightDetails saveFlightAndSeat(FlightDetails flight, Seat seat);
}
