package com.codespy.airline.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class PropertyFileReader {

	@Value("${pdf.dirPlace}")
	private String dirPlace;

	@Value("${spring.mail.username}")
	private String email;

	public String getDirPlace() {
		return dirPlace;
	}

	public void setDirPlace(String dirPlace) {
		this.dirPlace = dirPlace;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
