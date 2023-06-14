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

	
	@Bean
	public String generateOneTimePassword() {
		PasswordEncoder encoder  =  NoOpPasswordEncoder.getInstance();
		String OTP = RandomString.make(8);
		String encodedOTP = encoder.encode(OTP);
		return encodedOTP;

	}
}
