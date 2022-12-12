package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Region;

public interface IRegionService {

	public List<Region> getAll();
	public Region getById(int id);
	public void merge(Region region);
	public void delete(int id);
}
