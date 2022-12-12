package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IFormationDao;
import com.intiFormation.model.Formation;

@Service
public class FormationService implements IFormationService {
	
	@Autowired
	IFormationDao formationDao;
	
	
	@Override
	public void merge(Formation formation) {
		formationDao.save(formation);
		
	}

	@Override
	public Formation getById(int id) {
		Formation formation = formationDao.findById(id).get();
		return formation;
	}

	@Override
	public List<Formation> getAll() {
		List<Formation> formations = formationDao.findAll();
		return formations;
	}


	@Override
	public void delete(int id) {
		formationDao.deleteById(id);
		
	}
	
}
