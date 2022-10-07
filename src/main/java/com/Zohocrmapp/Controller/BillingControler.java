package com.Zohocrmapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Zohocrmapp.Entity.Billing;
import com.Zohocrmapp.Entity.Contacts;
import com.Zohocrmapp.Services.BillingService;
import com.Zohocrmapp.Services.ContactsService;

@Controller
public class BillingControler {

	@Autowired
	private ContactsService contactservcie;
	
	@Autowired
	private BillingService billingservice;
	
	
	@RequestMapping("/GenerateBill")
	public String getContactId(@RequestParam("id") long id,ModelMap model) {
		Contacts contact=contactservcie.getOnecontactId(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	
	@RequestMapping("/SaveBill")
	public String saveBill(@ModelAttribute("bill") Billing bill) {
		billingservice.saveBill(bill);
		return "generate_bill";
		
	}
	
}
