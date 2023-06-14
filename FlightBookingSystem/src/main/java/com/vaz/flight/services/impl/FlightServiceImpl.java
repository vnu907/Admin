package com.vaz.flight.services.impl;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaz.flight.exception.FlightDetailsException;
import com.vaz.flight.models.FlightDetails;
import com.vaz.flight.models.Search;
import com.vaz.flight.repositories.FlightDetailsRepository;
import com.vaz.flight.services.FlightService;


@Service
public class FlightServiceImpl implements FlightService{

	

	@Autowired
	private FlightDetailsRepository flightDetailsRepository;

	@Override
	public FlightDetails getFlightById(Integer id) throws FlightDetailsException {
		// TODO Auto-generated method stub
		FlightDetails flight = flightDetailsRepository.getById(id);
		if (flight == null)
			throw new FlightDetailsException("No flight for this id: " + id);
		else
			return flight;
	}

	@Override
	public List<FlightDetails> getAllFlightDetails() throws FlightDetailsException {
		// TODO Auto-generated method stub
		List<FlightDetails> flightList = flightDetailsRepository.findAll();
		if (flightList == null)
			throw new FlightDetailsException("No flights are available");
		else {

			return flightList;
		}
	}

	@Override
	public FlightDetails saveFlightDetails(FlightDetails flight) throws FlightDetailsException {

		/*
		 * LocalDateTime arrive = LocalDateTime.of(LocalDate.now(),
		 * LocalTime.of(flight.getArrival().getHour(), flight.getArrival().getMinute(),
		 * flight.getArrival().getSecond()));
		 * 
		 * LocalDateTime depart = LocalDateTime.of(LocalDate.now(),
		 * LocalTime.of(flight.getDeparture().getHour(),
		 * flight.getDeparture().getMinute(), flight.getDeparture().getSecond()));
		 * flight.setArrival(arrive); flight.setDeparture(depart);
		 */

		FlightDetails savedFlight = flightDetailsRepository.save(flight);
		if (savedFlight == null)
			throw new FlightDetailsException("Please provide correct details");
		else
			return savedFlight;
	}

	@Override
	public void deleteFlightDetails(FlightDetails flight) throws FlightDetailsException {
		// TODO Auto-generated method stub
		flightDetailsRepository.delete(flight);
		FlightDetails deletedFlight = flightDetailsRepository.getById(flight.getFlightId());
		if (deletedFlight != null)
			throw new FlightDetailsException("Sorry we are unable to delete this flight");
	}

	/*
	 * @Override public List<FlightDetails> getFlightBySourceAndDestination(Search
	 * search) { List<FlightDetails> flightList =
	 * flightDetailsRepository.findBySourceAndDestination(search.getSource(),
	 * search.getDestination());
	 * 
	 * if (flightList == null) throw new
	 * FlightDetailsException("No flights are available for this source: " +
	 * search.getSource() + " and destination: " + search.getDestination()); else {
	 * 
	 * for (FlightDetails flight : flightList) { this.saveFlightDetails(flight); }
	 * 
	 * return flightList; } }
	 */

	@Override
	public List<FlightDetails> getFlightBySourceAndDestinationAndDeparture(Search search) {
//		LocalDateTime currentDate = LocalDateTime.of(search.getJourneyDate().toLocalDate(), LocalTime.of(0,01,01));
		/*
		 * System.out.println(currentDate); System.out.println(search.getJourneyDate());
		 */
//		System.out.println(currentDate);
		List<FlightDetails> flightList = flightDetailsRepository
				.findBySourceAndDestinationAndDeparture(search.getSource(), search.getDestination(), search.getJourneyDate());

		if (flightList == null)
			throw new FlightDetailsException("No flights are available for this source: " + search.getSource()
					+ " and destination: " + search.getDestination());
		else {
			/*
			 * System.out.println(flightList.size()); for (FlightDetails flight :
			 * flightList) { System.out.println("Arrival: " + flight.getArrival()
			 * +"Departure: " + flight.getDeparture()); }
			 */

			return flightList;
		}
	}

	public void op() {
		FlightDetails flight = flightDetailsRepository.findByFlightId(5);

		/*
		 * flightDetails.setArrival(null); flightDetails.setDeparture(null);
		 */
		//2022-03-11 02:15:30
		flight.setArrival(LocalDateTime.of(2022, 03, 11, 13, 29));
		flight.setDeparture(LocalDateTime.of(2022, 03, 11, 8, 46));
		LocalDateTime tempDateTime = LocalDateTime.from(flight.getDeparture());
		long hours = tempDateTime.until(flight.getArrival(), ChronoUnit.HOURS);
		tempDateTime = tempDateTime.plusHours(hours);
		long minutes = tempDateTime.until(flight.getArrival(), ChronoUnit.MINUTES);
		tempDateTime = tempDateTime.plusMinutes(minutes);
		flight.setDuration(hours + " hr " + minutes + " min");
		/*
		 * System.out.println(flightDetails.getArrival());
		 * System.out.println(flightDetails.getDeparture());
		 */

		flightDetailsRepository.save(flight);

	}

	@Override
	public void deleteFlightById(Integer id) {
		flightDetailsRepository.deleteById(id);
	}

	@Override
	public List<Integer> getAllFlightsId() {
		return flightDetailsRepository.findAllByFlightId();
	}

}
