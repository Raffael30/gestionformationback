package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IPaiementDao;
import com.intiFormation.model.Formation;
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
	
	public List<Paiement> getByFormation_id(int id)
	{
		List<Paiement> paiements=paiementDao.findByFormation_id(id);
		return paiements;
	}
	
	public List<Paiement> getByUtilisateur_id(int id)
	{
		List<Paiement> paiements=paiementDao.findByUtilisateur_id(id);
		return paiements;
	}
	
	public List<Paiement> getByFormation_idAndUtilisateur_id(int idFormation, int idUtilisateur)
	{
		List<Paiement> paiements=paiementDao.findByFormation_idAndUtilisateur_id(idFormation,idUtilisateur);
		return paiements;
	}

}
