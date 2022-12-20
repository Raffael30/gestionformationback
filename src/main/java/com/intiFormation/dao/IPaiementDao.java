package com.intiFormation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.model.Paiement;

public interface IPaiementDao extends JpaRepository<Paiement, Integer> {

	public List<Paiement> findByUtilisateur_id(int id);
	public List<Paiement> findByFormation_id(int id);
	public List<Paiement> findByFormation_idAndUtilisateur_id(int idFormation, int idUtilisateur);
}
