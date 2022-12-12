package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IUtilisateurDao;
import com.intiFormation.model.Utilisateur;

@Service
public class UtilisateurService implements IUtilisateurService {

	@Autowired
	IUtilisateurDao utiDao;
	
	
	
	
	
	public IUtilisateurDao getUtiDao() {
		return utiDao;
	}

	public void setUtiDao(IUtilisateurDao utiDao) {
		this.utiDao = utiDao;
	}

	@Override
	public void merge(Utilisateur uti) {
		utiDao.save(uti);
		
	}

	@Override
	public Utilisateur getById(int id) {
		Utilisateur uti = utiDao.findById(id).get();
		return uti;
	}

	@Override
	public List<Utilisateur> getAll() {
		List<Utilisateur> utilisateurs = utiDao.findAll();
		return utilisateurs;
	}


	@Override
	public void delete(int id) {
		utiDao.deleteById(id);
		
	}
	
	@Override
	public Utilisateur findByUsername(String username)
	{
		return utiDao.findByUsername(username);
	}

}
