package com.Zohocrmapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Zohocrmapp.utilities.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailservice;
	
	@RequestMapping("/SendEmail")
	public String SendEmail(@RequestParam("To") String To,@RequestParam("sub") String sub,@RequestParam("emailBody") String emailBody) {
		emailservice.SendEmail(To, sub, emailBody);
		return "compose_email";
		
	}

}
