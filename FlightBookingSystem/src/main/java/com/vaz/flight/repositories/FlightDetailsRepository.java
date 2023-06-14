package com.vaz.flight.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vaz.flight.models.FlightDetails;

@Repository
public interface FlightDetailsRepository extends JpaRepository<FlightDetails, Integer> {

	@Modifying(clearAutomatically = true)
	@Query("select u from FlightDetails u WHERE u.source = :source and u.destination =:destination and u.departure >= :departure")
	public List<FlightDetails> findBySourceAndDestinationAndDeparture(@Param("source") String source,
			@Param("destination") String destination, @Param("departure") LocalDateTime departure);

	@Modifying(clearAutomatically = true)
	@Query("select u.flightId from FlightDetails u")
	public List<Integer> findAllByFlightId();

	public FlightDetails findByFlightId(Integer id);
}
