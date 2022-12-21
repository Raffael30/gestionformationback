package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Utilisateur;

public interface IUtilisateurService {
	
	public void merge(Utilisateur utilisateur);
	public Utilisateur getById(int id);
	public List<Utilisateur> getAll();
	public void delete(int id);
	public Utilisateur findByUsername(String username);
	public List<Utilisateur> findByRole_nom(String username);
	public List<Utilisateur> selectUtilisateurFormation(Integer[] tab);

}
