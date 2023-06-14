package com.vaz.flight.services;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vaz.flight.models.Customer;


@Transactional
@Service("customerservice")
public interface CustomerService {

	public Customer getCustomerById(Integer id);

	public List<Customer> getAllCustomerDetails();
	
	public List<Customer> getAllCustomerDetailsExceptAdmin();

	public Customer saveCustomerDetails(Customer customer);

	public void deleteCustomer(Customer customer);

	public void deleteCustomerById(Integer id);

	public Customer getCustomerByUsername(String username);

	public void updateCustomer(Customer customer);

}