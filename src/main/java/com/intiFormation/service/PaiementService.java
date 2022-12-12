package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IPaiementDao;
import com.intiFormation.model.Paiement;



@Service
public class PaiementService implements IPaiementService {
	
	@Autowired
	IPaiementDao paiementDao;
	
	
	@Override
	public void merge(Paiement paiement) {
		paiementDao.save(paiement);
		
	}

	@Override
	public Paiement getById(int id) {
		Paiement paiement = paiementDao.findById(id).get();
		return paiement;
	}

	@Override
	public List<Paiement> getAll() {
		List<Paiement> paiements = paiementDao.findAll();
		return paiements;
	}


	@Override
	public void delete(int id) {
		paiementDao.deleteById(id);
		
	}

}
