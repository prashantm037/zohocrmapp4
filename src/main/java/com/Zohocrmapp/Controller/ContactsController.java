package com.Zohocrmapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Zohocrmapp.Entity.Contacts;
import com.Zohocrmapp.Services.ContactsService;

@Controller
public class ContactsController {
	
	@Autowired
	private ContactsService contactservice;
	
	
	@RequestMapping("/listallcontacts")
	public String listAllContacts(ModelMap model) {
		List<Contacts> contact= contactservice.findOneContact();
		model.addAttribute("contact", contact);
		return "list_contact";
	}
	
	@RequestMapping("/findcontactById")
	public String findcontactById(@RequestParam("id") long id,ModelMap model) {
		Contacts contact = contactservice.getonecontact(id);
		model.addAttribute("contact", contact);
		return "Contacts_info";
	}

}
