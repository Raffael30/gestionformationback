package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IStatutDao;
import com.intiFormation.model.Statut;


@Service
public class StatutService implements IStatutService{

	@Autowired
	IStatutDao statutDao;
	
	@Override
	public Statut getById(int id) 
	{
	    Statut statut = statutDao.findById(id).get();
	    return statut;
	}

	@Override
	public List<Statut> getAll()
	{
	    List<Statut> statuts = statutDao.findAll();
	    return statuts;
	}
		
	@Override
	public void merge(Statut statut)
	{		
	    statutDao.save(statut);
	}
	
	@Override
	public void delete(int id)
	{
	    statutDao.deleteById(id);
	}
	
	@Override
	public List<Statut> getByTypeOrType(String type, String general){
		List<Statut> statuts = statutDao.findByTypeOrType(type, general);
		return statuts;
		
	}
	
}
