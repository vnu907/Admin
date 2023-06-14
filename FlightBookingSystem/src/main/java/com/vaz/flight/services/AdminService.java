package com.vaz.flight.services;

import java.util.List;




import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vaz.flight.models.Customer;
import com.vaz.flight.models.FlightDetails;
import com.vaz.flight.models.Seat;


@Transactional
@Service
public interface AdminService {
	public List<Customer> getAllCustomerDetails();
}
