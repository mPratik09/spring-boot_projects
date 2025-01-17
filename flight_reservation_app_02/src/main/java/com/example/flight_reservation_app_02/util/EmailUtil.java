package com.example.flight_reservation_app_02.util;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

	@Autowired
	private JavaMailSender sender;									// JavaMailSender built in class
//			MimeMessage message = sender.createMimeMessage();		//	MimeMessage built in class

	public void sendItinerary(String toAddress, String filePath) {
		MimeMessage message = sender.createMimeMessage(); 			// MimeMessage built in class

		try {
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
			messageHelper.setTo(toAddress);
			messageHelper.setSubject("Itinerary of Flight...");
			messageHelper.setText("Please find the attached");
			messageHelper.addAttachment("Itinerary", new File(filePath));
//				messageHelper.setTo(toAddress);
//				messageHelper.setText(emailSubject);
//				messageHelper.setSubject(emailBody);

			sender.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
