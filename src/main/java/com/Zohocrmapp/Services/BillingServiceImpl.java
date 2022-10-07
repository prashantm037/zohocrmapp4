package com.Zohocrmapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Zohocrmapp.Entity.Billing;
import com.Zohocrmapp.Repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;
	
	
	@Override
	public void saveBill(Billing bill) {
		billingRepo.save(bill);
	}
	
	
}
