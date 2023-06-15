package com.vaz.flight.security;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Component;

import com.vaz.flight.models.Customer;
import com.vaz.flight.services.CustomerService;




@Component
public class BeforeAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	@Autowired
	private CustomerService customerService;

	@Autowired
	@Override
	public void setAuthenticationManager(AuthenticationManager authManager) {
		super.setAuthenticationManager(authManager);
	}

	@Autowired
	@Override
	public void setAuthenticationFailureHandler(AuthenticationFailureHandler failureHandler) {
		super.setAuthenticationFailureHandler(failureHandler);
	}

	@Autowired
	@Override
	public void setAuthenticationSuccessHandler(AuthenticationSuccessHandler successHandler) {
		super.setAuthenticationSuccessHandler(successHandler);
	}

	public BeforeAuthenticationFilter() {
		super.setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher("/processLogin", "POST"));
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {

		String username = request.getParameter("username");

		Customer customer = customerService.getCustomerByUsername(username);
		if (customer != null) {
			try {
				if (customer.getEnabled() == false || customer.getEnabled() == null) {
					throw new InsufficientAuthenticationException(
							"Please Verify Your Identity/ Email/Username does not exists.");

				} else {
					return super.attemptAuthentication(request, response);
				}
			} catch (NullPointerException ex) {
				throw new InsufficientAuthenticationException(
						"Please Verify Your Identity/ Email/Username does not exists.");
			}

		}

		return super.attemptAuthentication(request, response);
	}


}
