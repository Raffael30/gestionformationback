package com.intiFormation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.model.Utilisateur;


public interface IUtilisateurDao extends JpaRepository<Utilisateur, Integer>{
	
	public Utilisateur findByUsername(String username);

}