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

import com.intiFormation.model.Prospect;
import com.intiFormation.service.IProspectService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class ProspectController {

	@Autowired
	private IProspectService prospectService;
	
	@GetMapping("/prospects")
	public List<Prospect> selectAll()
	{
		List<Prospect> prospects=prospectService.getAll();
		return prospects;
	}

	@GetMapping("/prospects/{id}")
	public Prospect selectById(@PathVariable("id") int id)
	{
		Prospect prospect=prospectService.getById(id);
		return prospect;
	}

	@PutMapping("/prospects")
	public void merge(@RequestBody Prospect prospect)
	{
		prospectService.merge(prospect);
	}

	@DeleteMapping("/prospects/{id}")
	public void delete(@PathVariable("id") int id)
	{
		Prospect prospect=prospectService.getById(id);
		prospectService.delete(id);
	}
}
