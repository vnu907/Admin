//package com.vaz.flight;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class FlightBookingSystemApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(FlightBookingSystemApplication.class, args);
//	}
//
//}


package com.vaz.flight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vaz.flight.models.PropertyFileReader;

@SpringBootApplication(scanBasePackages = { "com.vaz.flight.*" })

@EnableConfigurationProperties({ PropertyFileReader.class })
@EnableJpaRepositories("com.vaz.flight.repositories")
@EntityScan("com.vaz.flight.models")
public class FlightBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingSystemApplication.class, args);
	}

}




