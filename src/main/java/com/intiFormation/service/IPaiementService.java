package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Paiement;

public interface IPaiementService {
	
	public void merge(Paiement paiement);
	public Paiement getById(int id);
	public List<Paiement> getAll();
	public void delete(int id);

}
