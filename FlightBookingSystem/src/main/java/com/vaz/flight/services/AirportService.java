package com.vaz.flight.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.vaz.flight.models.Airport;

@Transactional
@Service

public interface AirportService {
	public Airport getAirportDetailsById(Integer id);
	public List<Airport> getAllAirportDetails();
	public void saveAirportDetails(Airport airport);
	public void deleteAirportDetails(Airport airport);
	public void deleteAirportDetailsById(Integer id);
	public Airport getAirportDetailsByFlightIdAndCity(Integer flightid, String city);
	
}
