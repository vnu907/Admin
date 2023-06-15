package com.vaz.flight.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;


@Component
public class LoginFailureHandler extends SimpleUrlAuthenticationFailureHandler {

	/*
	 * @Autowired private CustomerService customerService;
	 */

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {

		String username = request.getParameter("username");
		System.out.println("onAuthenticationFailure email: " + username);
		request.setAttribute("username", username);

		String redirectURL = "/login?error=true";

		if (exception.getMessage().contains("Please Verify Your Identity/ Email/Username does not exists.")) {
			redirectURL = "/login?verifyemail=true";
		} 

		super.setDefaultFailureUrl(redirectURL);
		super.onAuthenticationFailure(request, response, exception);
	}

}