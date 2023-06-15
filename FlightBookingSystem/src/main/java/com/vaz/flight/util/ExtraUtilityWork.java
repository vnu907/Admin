package com.vaz.flight.util;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.vaz.flight.enums.SeatClass;
import com.vaz.flight.models.Search;
import com.vaz.flight.models.SeatStatus;

import net.bytebuddy.utility.RandomString;


@SuppressWarnings("deprecation")
@Configuration
public class ExtraUtilityWork {

	public SeatStatus updateSeats(SeatStatus seatStatus, Search search) {
		String classOfJourney = search.getClassOfjourney();
		int passenger = search.getPassenger();
		if (classOfJourney.equals(SeatClass.ECONOMY.label)) {
			seatStatus.setAvailableSeats(seatStatus.getAvailableSeats() - passenger);
			seatStatus.setBookedSeats(seatStatus.getBookedSeats() + passenger);
			seatStatus.setEconomyseatsavailable(seatStatus.getEconomyseatsavailable() - passenger);
			seatStatus.setEconomyseatsbooked(seatStatus.getEconomyseatsbooked() + passenger);
		} else if (classOfJourney.equals(SeatClass.BASIC_ECONOMY.label)) {
			seatStatus.setAvailableSeats(seatStatus.getAvailableSeats() - passenger);
			seatStatus.setBookedSeats(seatStatus.getBookedSeats() + passenger);
			seatStatus.setBasiceconomyseatsavailable(seatStatus.getBasiceconomyseatsavailable() - passenger);
			seatStatus.setBasiceconomyseatsbooked(seatStatus.getBasiceconomyseatsbooked() + passenger);
		} else if (classOfJourney.equals(SeatClass.PREMIUM_ECONOMY.label)) {
			seatStatus.setAvailableSeats(seatStatus.getAvailableSeats() - passenger);
			seatStatus.setBookedSeats(seatStatus.getBookedSeats() + passenger);
			seatStatus.setPremiumeconomyseatsavailable(seatStatus.getPremiumeconomyseatsavailable() - passenger);
			seatStatus.setPremiumeconomyseatsbooked(seatStatus.getPremiumeconomyseatsbooked() + passenger);
		} else if (classOfJourney.equals(SeatClass.BUSINESS.label)) {
			seatStatus.setAvailableSeats(seatStatus.getAvailableSeats() - passenger);
			seatStatus.setBookedSeats(seatStatus.getBookedSeats() + passenger);
			seatStatus.setBusinessseatsavailable(seatStatus.getBusinessseatsavailable() - passenger);
			seatStatus.setBusinessseatsbooked(seatStatus.getBusinessseatsbooked() + passenger);
		} else {
			seatStatus.setAvailableSeats(seatStatus.getAvailableSeats() - passenger);
			seatStatus.setBookedSeats(seatStatus.getBookedSeats() + passenger);
			seatStatus.setFirstseatsavailable(seatStatus.getFirstseatsavailable() - passenger);
			seatStatus.setFirstseatsbooked(seatStatus.getFirstseatsbooked() + passenger);
		}

		return seatStatus;
	}
	
	@Bean
	public String generateOneTimePassword() {
		PasswordEncoder encoder  =  NoOpPasswordEncoder.getInstance();
		String OTP = RandomString.make(8);
		String encodedOTP = encoder.encode(OTP);
		return encodedOTP;

	}
}
