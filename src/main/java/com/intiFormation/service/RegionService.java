package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IRegionDao;
import com.intiFormation.model.Region;

@Service
public class RegionService implements IRegionService {

	
	@Autowired
	private IRegionDao regionDao;
	
	public List<Region> getAll()
	{
		List<Region> regions=regionDao.findAll();
		return regions;
	}
	
	public Region getById(int id)
	{
		Region region=regionDao.findById(id).get();
		return region;
	}
	
	public void merge(Region region)
	{
		regionDao.save(region);
	}
	
	public void delete(int id)
	{
		regionDao.deleteById(id);
	}
}
