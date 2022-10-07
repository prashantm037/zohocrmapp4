package com.Zohocrmapp.Services;

import java.util.List;

import com.Zohocrmapp.Entity.Contacts;
import com.Zohocrmapp.Entity.Lead;

public interface ContactsService {
	
	public void SaveOneLead(Contacts contact);

	public List<Contacts> findOneContact();

	public Contacts getonecontact(long id);

	public Contacts getOnecontactId(long id);


}
