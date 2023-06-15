package com.vaz.flight.security;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;


@Primary
@Component("LoginSuccessHandler")
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		HttpSession session = request.getSession();
		CustomCustomerUserDetails customerDetails = (CustomCustomerUserDetails) SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		session.setAttribute("user", customerDetails.getCustomer().getFirstname());
//		System.out.println("Customer: -" + customerDetails.getCustomer());
		session.setAttribute("userObj", customerDetails.getCustomer());
		session.setAttribute("username", customerDetails.getCustomer().getUsername());
		session.setAttribute("authorities", authentication.getAuthorities());
		response.setStatus(HttpServletResponse.SC_OK);
		/* System.out.println(customerDetails.getCustomer()); */
	
		super.onAuthenticationSuccess(request, response, authentication);
	}

}
