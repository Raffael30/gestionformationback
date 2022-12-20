package com.intiFormation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.model.Formation;


public interface IFormationDao extends JpaRepository<Formation, Integer> {

	public List<Formation> findByUtilisateurs_id(int id);
	public List<Formation> findByNomContaining(String nom);

}
