package com.intiFormation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiFormation.model.Region;
import com.intiFormation.service.IRegionService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class RegionController {

	@Autowired
	private IRegionService regionService;
	
	@GetMapping("/regions")
	public List<Region> selectAll()
	{
		List<Region> regions=regionService.getAll();
		return regions;
	}

	@GetMapping("/regions/{id}")
	public Region selectById(@PathVariable("id") int id)
	{
		Region region=regionService.getById(id);
		return region;
	}

	@PutMapping("/regions")
	public void merge(@RequestBody Region region)
	{
		regionService.merge(region);
	}

	@DeleteMapping("/regions/{id}")
	public void delete(@PathVariable("id") int id)
	{
		Region region=regionService.getById(id);
		regionService.delete(id);
	}
}
