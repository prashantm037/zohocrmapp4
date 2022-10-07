package com.Zohocrmapp.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private JavaMailSender mailSend;

	@Override
	public void SendEmail(String To, String sub, String emailBody) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(To);
		message.setText(sub);
		message.setText(emailBody);
		
		mailSend.send(message);

	}

}
