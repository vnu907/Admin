package com.vaz.flight.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vaz.flight.models.Customer;
import com.vaz.flight.repositories.CustomerRepository;
import com.vaz.flight.services.CustomerService;
import com.vaz.flight.util.ExtraUtilityWork;


@Transactional
@Service

public class CustomerServiceImpl  implements CustomerService  {

	@Autowired
	private CustomerRepository customerRepository;


	@Autowired
	private ExtraUtilityWork extraUtilWork;

	@Override
	public Customer getCustomerById(Integer id) {
		return customerRepository.getById(id);
	}

	@Override
	public List<Customer> getAllCustomerDetails() {
		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomerDetails(Customer customer) {
		customer.setRole("CUSTOMER");
		customer.setOneTimePassword(extraUtilWork.generateOneTimePassword());
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		customerRepository.delete(customer);
	}


	@Override
	public Customer getCustomerByUsername(String username) {
		return customerRepository.findByUsername(username);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerRepository.updateCustomerByEnabled(customer.getEnabled(), customer.getCustomerid());
	}

	@Override
	public List<Customer> getAllCustomerDetailsExceptAdmin() {
		return customerRepository.findByRole("CUSTOMER");
	}

	@Override
	public void deleteCustomerById(Integer id) {
		customerRepository.deleteById(id);
	}
}
