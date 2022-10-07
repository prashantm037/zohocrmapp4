package com.Zohocrmapp.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Zohocrmapp.Entity.Lead;
import com.Zohocrmapp.Repository.Leadrepository;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private Leadrepository LeadRepo;
	

	@Override
	public void SaveOneLead(Lead lead) {
	 LeadRepo.save(lead);
	}


	@Override
	public Lead getOneLead(long id) {
		Optional<Lead> findById = LeadRepo.findById(id);
		return  findById.get();
	}


	@Override
	public void deleteOneLead(long id) {
		LeadRepo.deleteById(id);
		
	}


	@Override
	public List<Lead> findOneLead() {
		List<Lead> lead = LeadRepo.findAll();
		return lead;
	}
	
	

}
