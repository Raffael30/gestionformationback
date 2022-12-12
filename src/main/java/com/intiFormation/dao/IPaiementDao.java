package com.intiFormation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.model.Paiement;

public interface IPaiementDao extends JpaRepository<Paiement, Integer> {

}
