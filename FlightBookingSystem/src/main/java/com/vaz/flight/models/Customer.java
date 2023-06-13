package com.vaz.flight.models;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customerid")
	private Integer customerid;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "emailid")
	private String emailid;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "phonenumber")
	private String phonenumber;
	@Column(name = "country")
	private String country;
	@Column(name = "role")
	private String role;
	@Column(name = "enabled", columnDefinition = "boolean default false")
	private Boolean enabled;
	@Column(name = "onetimepassword")
	private String oneTimePassword;

	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param customerid
	 * @param firstname
	 * @param lastname
	 * @param emailid
	 * @param username
	 * @param password
	 * @param phonenumber
	 * @param country
	 * @param role
	 * @param enabled
	 * @param oneTimePassword
	 */
	public Customer(Integer customerid, String firstname, String lastname, String emailid, String username,
			String password, String phonenumber, String country, String role, Boolean enabled, String oneTimePassword) {
		super();
		this.customerid = customerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.username = username;
		this.password = password;
		this.phonenumber = phonenumber;
		this.country = country;
		this.role = role;
		this.enabled = enabled;
		this.oneTimePassword = oneTimePassword;
	}

	/**
	 * @return the customerid
	 */
	public Integer getCustomerid() {
		return customerid;
	}

	/**
	 * @param customerid the customerid to set
	 */
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
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
	 * @return the emailid
	 */
	public String getEmailid() {
		return emailid;
	}

	/**
	 * @param emailid the emailid to set
	 */
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * @param phonenumber the phonenumber to set
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the oneTimePassword
	 */
	public String getOneTimePassword() {
		return oneTimePassword;
	}

	/**
	 * @param oneTimePassword the oneTimePassword to set
	 */
	public void setOneTimePassword(String oneTimePassword) {
		this.oneTimePassword = oneTimePassword;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", emailid=" + emailid + ", username=" + username + ", password=" + password + ", phonenumber="
				+ phonenumber + ", country=" + country + ", role=" + role + ", enabled=" + enabled
				+ ", oneTimePassword=" + oneTimePassword + "]";
	}


}
