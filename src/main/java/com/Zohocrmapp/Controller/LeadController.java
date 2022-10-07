package com.Zohocrmapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Zohocrmapp.Entity.Contacts;
import com.Zohocrmapp.Entity.Lead;
import com.Zohocrmapp.Services.ContactsService;
import com.Zohocrmapp.Services.LeadService;
import com.Zohocrmapp.utilities.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private ContactsService  contactservice;
	
	@Autowired
	private LeadService leadservice;
	
	@RequestMapping("/viewLeadPage")
	public String viewLeadPage() {
		return "create_lead";
	}
	
	@RequestMapping("/Savelead")
	public String saveLead(@ModelAttribute("lead") Lead lead) {
		leadservice.SaveOneLead(lead);
		return "lead_info";
		
	}
	
	
	@RequestMapping("/ComposeEmail")
	public String ComposeEmail(@RequestParam("email") String email,ModelMap model) {
		model.addAttribute("email", email);
		return "compose_email";
		
	}
	
	@RequestMapping("/ConvertLead")
	public String ConvertLead(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadservice.getOneLead(id);
		
		Contacts con=new Contacts();
		con.setFirstName(lead.getFirstName());
		con.setLastName(lead.getLastName());
		con.setEmail(lead.getEmail());
		con.setMobile(lead.getMobile());
		con.setSource(lead.getSource());
		
		contactservice.SaveOneLead(con);
		
		leadservice.deleteOneLead(id);
		
		List<Contacts> contact= contactservice.findOneContact();
		model.addAttribute("contact", contact);
		return "list_contact";
	}
	
	@RequestMapping("/listall")
	public String getAllLeads(ModelMap model) {
		List<Lead> lead=leadservice.findOneLead();
		model.addAttribute("lead", lead);
		return "lead_list";
	}
	
	@RequestMapping("/findLeadById")
	public String findLeadById(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadservice.getOneLead(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}

}
