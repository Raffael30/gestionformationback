package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IProspectDao;
import com.intiFormation.model.Prospect;

@Service
public class ProspectService implements IProspectService {

	
	@Autowired
	private IProspectDao prospectDao;
	
	public List<Prospect> getAll()
	{
		List<Prospect> prospects = prospectDao.findAll();
		return prospects;
	}
	
	public Prospect getById(int id)
	{
		Prospect prospect = prospectDao.findById(id).get();
		return prospect;
	}
	
	public void merge(Prospect prospect)
	{
		prospectDao.save(prospect);
	}
	
	public void delete(int id)
	{
		prospectDao.deleteById(id);
	}
}
