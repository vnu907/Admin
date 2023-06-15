package com.vaz.flight.util;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.vaz.flight.models.Contact;
import com.vaz.flight.models.Customer;
import com.vaz.flight.models.FlightDetails;
import com.vaz.flight.models.PropertyFileReader;
import com.vaz.flight.models.TicketBooking;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import net.bytebuddy.utility.RandomString;

@Service
public class EmailService {
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private Configuration configuration;
	
	@Autowired
	private PropertyFileReader propertyFileReader;

	public void sendMail(TicketBooking ticket, FlightDetails flight,
			Map<String, String> model) throws IOException {
		String to = ticket.getEmail();
		String subject = "Email From VAZ flight ";
		String body = "This is email body";
		String fileToAttach = propertyFileReader.getDirPlace() + flight.getFlightName() + ticket.getBookingId() + ".pdf";
		model.put("body", body);
		FileSystemResource file = new FileSystemResource(new File(fileToAttach));
		MimeMessage message = mailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
					StandardCharsets.UTF_8.name());
			Template template = configuration.getTemplate("email.ftl");
			String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
			helper.setTo(to);
			helper.setFrom(propertyFileReader.getEmail());
			helper.setSubject(subject);
			helper.setText(html, true);
			helper.addAttachment(flight.getFlightName() + ".pdf", file);
			mailSender.send(message);
		} catch (MessagingException | IOException | TemplateException e) {
			e.printStackTrace();
		}
	}
	
	
	public void performOtpOperation(Customer customer) {
		Map<String, String> model = new HashMap<>();
		model.put("customerName", customer.getFirstname());
		model.put("OTP", customer.getOneTimePassword());
		String subject = "Verify Your Email";
//		String body = "Email Verification OTP";
		MimeMessage message = mailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
					StandardCharsets.UTF_8.name());
			Template template = configuration.getTemplate("otp.ftl");
			String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
			helper.setTo(customer.getEmailid());
			helper.setFrom(propertyFileReader.getEmail());
			helper.setSubject(subject);
			helper.setText(html, true);
			mailSender.send(message);
		} catch (MessagingException | IOException | TemplateException e) {
			e.printStackTrace();
		}
		
	}
	
	public Boolean sendEmailContact(Contact contact) {
		Map<String, String> model = new HashMap<>();
		model.put("customerName", contact.getFirstname()+" " + contact.getLastname());
		model.put("email", contact.getEmail());
		model.put("subject", contact.getSubject());
		String subject = "Message From " + contact.getFirstname();
		MimeMessage message = mailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
					StandardCharsets.UTF_8.name());
			Template template = configuration.getTemplate("contactmessage.ftl");
			String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
			helper.setTo("vnu0212@gmail.com");
			helper.setFrom(propertyFileReader.getEmail());
			helper.setSubject(subject);
			helper.setText(html, true);
			mailSender.send(message);
			return true;
		} catch (MessagingException | IOException | TemplateException e) {
			e.printStackTrace();
			return false;
		}
	}}
