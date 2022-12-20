package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Formation;


public interface IFormationService {
	
	public void merge(Formation formation);
	public Formation getById(int id);
	public List<Formation> getAll();
	public void delete(int id);
	public List<Formation> getByUtilisateur_id(int id);
	public List<Formation> getByNomContaining(String nom);

}
