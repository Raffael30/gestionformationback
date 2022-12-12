package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IUtilisateurDao;
import com.intiFormation.model.Utilisateur;

@Service
public class UtilisateurService implements IUtilisateurService {

	@Autowired
	IUtilisateurDao utilisateurDao;
	
	
	
	
	
	public IUtilisateurDao getUtiDao() {
		return utilisateurDao;
	}

	public void setUtiDao(IUtilisateurDao utilisateurDao) {
		this.utilisateurDao = utilisateurDao;
	}

	@Override
	public void merge(Utilisateur utilisateur) {
		utilisateurDao.save(utilisateur);
		
	}

	@Override
	public Utilisateur getById(int id) {
		Utilisateur utilisateur = utilisateurDao.findById(id).get();
		return utilisateur;
	}

	@Override
	public List<Utilisateur> getAll() {
		List<Utilisateur> utilisateurs = utilisateurDao.findAll();
		return utilisateurs;
	}


	@Override
	public void delete(int id) {
		utilisateurDao.deleteById(id);
		
	}
	
	@Override
	public Utilisateur findByUsername(String username)
	{
		return utilisateurDao.findByUsername(username);
	}

}
