package com.vaz.flight.security;




import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component("Oauth2UserSuccessHandler")
public class Oauth2UserSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler{

	public Oauth2UserSuccessHandler() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		
		HttpSession session = request.getSession();
		CustomOAuth2User authUser = (CustomOAuth2User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		session.setAttribute("user",authUser.getAttribute("name"));
		session.setAttribute("userEmail",authUser.getAttribute("email"));
		session.setAttribute("authorities", authentication.getAuthorities());

		// set our response to OK status
		response.setStatus(HttpServletResponse.SC_OK);

		super.onAuthenticationSuccess(request, response, authentication);
	}

}
