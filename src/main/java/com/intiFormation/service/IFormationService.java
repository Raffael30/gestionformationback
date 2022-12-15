package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Formation;
import com.intiFormation.model.Utilisateur;

public interface IFormationService {
	
	public void merge(Formation formation);
	public Formation getById(int id);
	public List<Formation> getAll();
	public void delete(int id);

}
