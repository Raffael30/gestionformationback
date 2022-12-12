package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IRendezvousDao;

import com.intiFormation.model.Rendezvous;


@Service
public class RendezvousService implements IRendezvousService {

	
	@Autowired
	private IRendezvousDao rendezvousDao;
	
	public List<Rendezvous> getAll()
	{
		List<Rendezvous> regions=rendezvousDao.findAll();
		return regions;
	}
	
	public Rendezvous getById(int id)
	{
		Rendezvous region=rendezvousDao.findById(id).get();
		return region;
	}
	
	public void merge(Rendezvous region)
	{
		rendezvousDao.save(region);
	}
	
	public void delete(int id)
	{
		rendezvousDao.deleteById(id);
	}
}
