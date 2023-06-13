package com.vaz.flight.models;

public class Contact {


	private String firstname;
	private String lastname;
	private String email;
	private String subject;

	/**
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param subject
	 */
	public Contact(String firstname, String lastname, String email, String subject) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.subject = subject;
	
}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Contact [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", subject="
				+ subject + "]";
	}

	/**
	 * 
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

}