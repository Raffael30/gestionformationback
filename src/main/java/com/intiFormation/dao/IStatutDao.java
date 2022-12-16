package com.intiFormation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.model.Statut;

public interface IStatutDao extends JpaRepository<Statut, Integer>{
	public List<Statut> findByTypeOrType(String type, String general);

}
