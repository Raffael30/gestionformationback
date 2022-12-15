package com.intiFormation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.model.Formation;
import com.intiFormation.model.Utilisateur;

public interface IFormationDao extends JpaRepository<Formation, Integer> {


}
