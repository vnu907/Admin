package com.vaz.flight.security;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.vaz.flight.services.CustomerUserDetails;
import com.vaz.flight.services.CustomOAuth2UserService;


@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpidySecurityConfig  extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomerUserDetails userDetails;

	@Autowired
	private CustomOAuth2UserService customoAuth2UserService;
	/*
	 *
	 * 
	 * @Autowired(required=true) private PasswordEncoder encode;
	 */
	/*
	 * @Autowired private BeforeAuthenticationFilter beforeLoginFilter;
	 */
	@Autowired
	@Qualifier("LoginSuccessHandler")
	private LoginSuccessHandler loginSuccessHandler;

	@Autowired
	@Qualifier("Oauth2UserSuccessHandler")
	private Oauth2UserSuccessHandler oauthSuccessHandler;

	@Autowired
	private LoginFailureHandler loginFailureHandler;

	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)

	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable().authorizeRequests()
				.antMatchers("/", "/images/**", "/css/**", "/js/**", "/webjars/**", "/login", "/signup", "/verify",
						"/oauth2/**", "/oauth2/authorization/google", "/403", "/about", "/contact", "**.css", "**.jpg",
						"**.png", "**.js", "/moredetails", "/payment", "/privacypolicy")
				.permitAll().and().authorizeRequests()
				.antMatchers("/getAllCustomer", "/updatecustomer", "/deletecustomer", "/getAllFlight", "/getAllSeat",
						"/updateflight", "/deleteflight", "/updateseat", "/deleteseat", "/getallairport",
						"/updateairport", "/deleteairport", "/addairport", "/addcustomer", "/getallticketbooking",
						"/deleteticketbooking")
				.hasAuthority("ADMIN")
				.antMatchers("/paymentProcess", "/filedownload/**", "/getticketbookingcustomerinfo", "/userinfo",
						"/deletebooking")
				.hasAnyAuthority("CUSTOMER", "ROLE_USER", "ADMIN")
				// Following line denotes that all requests must be authenticated.
				// Hence, once a request comes to our application, we will check if the user is
				// authenticated or not.
				.anyRequest().authenticated().and()
				.addFilterBefore(beforeAuthentication(), BeforeAuthenticationFilter.class).formLogin()
				.loginPage("/login").permitAll().usernameParameter("username").loginProcessingUrl("/processLogin")
				.successHandler(loginSuccessHandler).failureHandler(loginFailureHandler).and().oauth2Login()
				.loginPage("/login").userInfoEndpoint().userService(customoAuth2UserService).and()
				.successHandler(oauthSuccessHandler).failureHandler(loginFailureHandler).and().exceptionHandling()
				.accessDeniedPage("/403").and().sessionManagement().sessionFixation().none().and().logout()
				.logoutSuccessUrl("/");
	}

	/*
	 * @Bean public AuthenticationFailureHandler authenticationFailureHandler() {
	 * return new CustomAuthenticationFailureHandler(); }
	 */

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetails);
		authProvider.setPasswordEncoder(passwordEncoder());
		return authProvider;
	}

	@Bean
	public BeforeAuthenticationFilter beforeAuthentication() {
		return new BeforeAuthenticationFilter();
	}

}