package com.example.locationweb01.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

	@Autowired
	private JavaMailSender sender; 								// JavaMailSender built in class
//		MimeMessage message = sender.createMimeMessage();		//	MimeMessage built in class

	public void sendEmail(String toAddress, String emailSubject, String emailBody) {
		MimeMessage message = sender.createMimeMessage();		 // MimeMessage built in class
		MimeMessageHelper messageHelper = new MimeMessageHelper(message);

		try {
			messageHelper.setTo("PratikSir009@gmail.com");
			messageHelper.setSubject("Lcation Saved");
			messageHelper.setText("Location in saved into DB");
//			messageHelper.setTo(toAddress);
//			messageHelper.setText(emailSubject);
//			messageHelper.setSubject(emailBody);

			sender.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
