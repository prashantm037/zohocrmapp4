package com.Zohocrmapp.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.Zohocrmapp.Entity.Contacts;
import com.Zohocrmapp.Entity.Lead;
import com.Zohocrmapp.Repository.ContactsRepostiry;

@Service
public class ContactsServiceImpl implements ContactsService {
	
	@Autowired
	private ContactsRepostiry contactRepo;

	@Override
	public void SaveOneLead(Contacts contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contacts> findOneContact() {
		List<Contacts> contact = contactRepo.findAll();
		return contact;
	}

	@Override
	public Contacts getonecontact(long id) {
		Optional<Contacts> findById = contactRepo.findById(id);
		return findById.get();
		
	}

	@Override
	public Contacts getOnecontactId(long id) {
		Optional<Contacts> findById = contactRepo.findById(id);
		Contacts contact = findById.get();
		return contact;
	}

	

}
