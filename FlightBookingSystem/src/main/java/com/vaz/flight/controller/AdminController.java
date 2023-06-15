package com.vaz.flight.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.vaz.flight.models.Airport;
import com.vaz.flight.models.Customer;
import com.vaz.flight.models.FlightDetails;
import com.vaz.flight.models.Seat;
import com.vaz.flight.services.AdminService;
import com.vaz.flight.services.AirportService;
import com.vaz.flight.services.CustomerService;
import com.vaz.flight.services.FlightService;
import com.vaz.flight.services.SeatService;
import com.vaz.flight.services.TicketBookingService;
import com.vaz.flight.services.TravelCustomerService;



@Controller
@SessionAttributes({ "role" })
public class AdminController {

	@Autowired
	private AdminService adminService;
	@Autowired
	private FlightService flightService;
	@Autowired
	private SeatService seatService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private AirportService airportService;
	@Autowired
	private TicketBookingService ticketBookingService;
	@Autowired
	private TravelCustomerService travelCustomerService;

	@GetMapping("/getAllCustomer")
	public String adminCustomerGet(ModelMap model, Authentication authentication) {
		model.addAttribute("customerList", adminService.getAllCustomerDetails());
		return "GetAllCustomer";
	}

	@GetMapping("/getAllFlight")
	public String adminAllFlightGet(ModelMap model, Authentication authentication) {
		model.addAttribute("flightList", flightService.getAllFlightDetails());
		return "GetAllFlight";
	}

	@GetMapping("/getAllSeat")
	public String adminAllSeatGet(ModelMap model, Authentication authentication) {
		model.addAttribute("seatList", seatService.getAllSeats());
		return "GetAllSeat";
	}

	@GetMapping("/updatecustomer")
	public String adminUpdateCustomerGet(@RequestParam int id, ModelMap model) {
		model.addAttribute("customer", customerService.getCustomerById(id));
		return "UpdateUser";
	}

	@PostMapping("/updatecustomer")
	public String adminAddCustomerPost(@ModelAttribute("customer") Customer customer, BindingResult bindingResult,
			ModelMap model) {
		customerService.saveCustomerDetails(customer);
		return "redirect:/getAllCustomer";
	}

	@GetMapping("/addcustomer")
	public String adminAddCustomerGet(ModelMap model) {
		model.addAttribute("customer", new Customer());
		return "AddCustomer";
	}

	@PostMapping("/addcustomer")
	public String adminUpdateCustomerPost(@ModelAttribute("customer") Customer customer, BindingResult bindingResult,
			ModelMap model) {
		customerService.saveCustomerDetails(customer);
		return "redirect:/getAllCustomer";
	}

	@GetMapping("/deletecustomer")
	public String adminDeleteCustomerGet(@RequestParam int id, ModelMap model) {
		customerService.deleteCustomerById(id);
		return "redirect:/getAllCustomer";
	}

	@GetMapping("/updateflight")
	public String adminUpdateFlightGet(@RequestParam int id, ModelMap model) {
		model.addAttribute("flightDetails", flightService.getFlightById(id));
		return "UpdateFlight";
	}

	@PostMapping("/updateflight")
	public String adminUpdateFlightPost(@ModelAttribute("flightDetails") FlightDetails flightDetails,
			BindingResult bindingResult, ModelMap model) {
		flightService.saveFlightDetails(flightDetails);
		return "redirect:/getAllFlight";
	}

	@GetMapping("/deleteflight")
	public String admindeleteFlightGet(@RequestParam int id, ModelMap model) {
		flightService.deleteFlightById(id);
		return "redirect:/getAllFlight";
	}

	@GetMapping("/updateseat")
	public String adminUpdateSeatGet(@RequestParam int id, ModelMap model) {
		model.addAttribute("seat", seatService.getSeatById(id));
		return "UpdateSeat";
	}

	@PostMapping("/updateseat")
	public String adminUpdateSeatPost(@ModelAttribute("seat") Seat seat, BindingResult bindingResult, ModelMap model) {
		seatService.saveSeat(seat);
		return "redirect:/getAllSeat";
	}

	@GetMapping("/deleteseat")
	public String adminDeleteSeatGet(@RequestParam int id, ModelMap model) {
		seatService.deleteSeatById(id);
		return "redirect:/getAllSeat";
	}

	@GetMapping("/getallairport")
	public String adminAirportAllGet(ModelMap model) {
		model.addAttribute("airportList", airportService.getAllAirportDetails());
		return "GetAllAirport";
	}

	@GetMapping("/updateairport")
	public String adminAirportGet(@RequestParam int id, ModelMap model) {
		model.addAttribute("airport", airportService.getAirportDetailsById(id));
		return "UpdateAirport";
	}

	@PostMapping("/updateairport")
	public String adminAirportPost(@ModelAttribute("airport") Airport airport, ModelMap model,
			BindingResult bindingResult) {
		airportService.saveAirportDetails(airport);
		return "redirect:/getallairport";
	}

	@GetMapping("/deleteairport")
	public String adminAirportDeleteGet(@RequestParam int id, ModelMap model) {
		airportService.deleteAirportDetailsById(id);
		return "redirect:/getallairport";
	}

	@GetMapping("/addairport")
	public String adminAirportAddGet(ModelMap model) {
		model.addAttribute("airport", new Airport());
		model.addAttribute("flightDetailsIdList", flightService.getAllFlightsId());
		return "AddAirport";
	}

	@PostMapping("/addairport")
	public String adminAirportAddPost(@ModelAttribute("airport") Airport airport, ModelMap model,
			BindingResult bindingResult) {
		airportService.saveAirportDetails(airport);
		return "redirect:/getallairport";
	}

	@GetMapping("/getallticketbooking")
	public String adminTicketBookingAllGet(ModelMap model) {
		model.addAttribute("ticketBookingDetails", ticketBookingService.getAllTicketBookingDetails());
		return "GetAllTicketBooking";
	}

	@GetMapping("/deleteticketbooking")
	public String adminTicketBookingDeleteGet(@RequestParam int id, ModelMap model) {
		ticketBookingService.deleteTicketById(id);
		return "redirect:/getallticketbooking";
	}
	
	@GetMapping("/getticketbookingcustomerinfo")
	public String adminTicketBookingCustomerInfo(@RequestParam int id, ModelMap model) {
		model.addAttribute("ticketBookingDetailstraveler", travelCustomerService.findByTicketId(id));
		return "GetTravelCustomerDetails";
	}

}