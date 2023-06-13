package com.vaz.flight.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vaz.flight.enums.SocialLogin;

@Entity
@Table(name = "likes")
public class User {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private boolean enabled;
	@Enumerated(EnumType.STRING)
	private SocialLogin socialLogin;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public SocialLogin getSocialLogin() {
		return socialLogin;
	}

	public void setSocialLogin(SocialLogin socialLogin) {
		this.socialLogin = socialLogin;
	}

}