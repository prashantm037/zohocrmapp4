package com.Zohocrmapp.Services;

import java.util.List;

import com.Zohocrmapp.Entity.Lead;

public interface LeadService {
	
	public void SaveOneLead(Lead lead);

	public Lead getOneLead(long id);

	public void deleteOneLead(long id);

	public List<Lead> findOneLead();


}
