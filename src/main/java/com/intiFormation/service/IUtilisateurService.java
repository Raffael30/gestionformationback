package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Utilisateur;

public interface IUtilisateurService {
	
	public void merge(Utilisateur uti);
	public Utilisateur getById(int id);
	public List<Utilisateur> getAll();
	public void delete(int id);
	public Utilisateur findByUsername(String username);

}