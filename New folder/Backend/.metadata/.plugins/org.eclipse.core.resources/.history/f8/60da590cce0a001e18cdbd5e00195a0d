package com.codespy.airline.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.codespy.airline.models.Airport;
import com.codespy.airline.models.CreditCard;
import com.codespy.airline.models.FlightDetails;
import com.codespy.airline.models.Search;
import com.codespy.airline.models.Seat;
import com.codespy.airline.models.TicketBooking;
import com.codespy.airline.models.TravelCustomer;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class PdfJasper {

	public void exportReport(TicketBooking ticket, CreditCard credit, FlightDetails flight, Seat seat, Search search, Airport sourceAirport, Airport destinationAirport) {
		int listOfPassengar = search.getPassenger();
		String path = "D:\\pdfrepo";
		String imagePath = "C:\\Users\\prash\\git\\AirLine\\src\\main\\resources\\static\\images\\icons\\"
				+ flight.getImageName();
		List<TravelCustomer> travelCustomer = ticket.getTravelCustomer();
		List<TravelCustomer> tempCustomer = new ArrayList<TravelCustomer>();
		tempCustomer.add(new TravelCustomer());
		for (int i = 0; i < travelCustomer.size(); i++) {
			tempCustomer.add(travelCustomer.get(i));
		}
		// load file and compile it
		try {
			File file = ResourceUtils.getFile("classpath:jasperPdf.jrxml");
			JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(tempCustomer);
			Map<String, Object> parameters = new HashMap<>();
			parameters.put("TravelCustomerAllData", dataSource);
			parameters.put("image", imagePath);
			parameters.put("flightName", flight.getFlightName());
			parameters.put("flightNumber", flight.getFlightNumber());
			parameters.put("source", flight.getSource());
			parameters.put("arrival", flight.returnArrivalHourAndMinute());
			parameters.put("datearrive", flight.getArrivalFormatedDate());
			parameters.put("airportarrive", destinationAirport.getNameofairport());
			parameters.put("duration", flight.getDuration());
			parameters.put("destination", flight.getDestination());
			parameters.put("departure", flight.returnDepartureHourAndMinute());
			parameters.put("datedepart", flight.getDepartureFormatedDate());
			parameters.put("airportdepart", sourceAirport.getNameofairport());
			parameters.put("pnrNumber", ticket.getPnrNumber());
			parameters.put("email", ticket.getEmail());
			parameters.put("phoneNumber", ticket.getPhoneNumber());
			parameters.put("ticketCost",
					seat.getPriceforbooking() * listOfPassengar + (seat.getTax() * listOfPassengar));
			parameters.put("cancellationCharge", seat.getPriceforcancel());
			parameters.put("cardNumber", credit.getCardnumber());
			parameters.put("cvv", credit.getCvv());
			parameters.put("expiryandvalidity", credit.getExpiryMonth() + "/" + credit.getExpiryYear());
			parameters.put("websiteName", "codeSpy.com");
			parameters.put("websiteEmail", "codespy@gmail.com");
			parameters.put("customerCare", "+9199999999");
			parameters.put("socialLink", "youtube,telegram");
			parameters.put("bookingId", ticket.getBookingId());
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
			JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\" + flight.getFlightName() +ticket.getBookingId() + ".pdf");
		} catch (FileNotFoundException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		} catch (JRException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();

		}

	}

}