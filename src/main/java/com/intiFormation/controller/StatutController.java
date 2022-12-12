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

import com.intiFormation.model.Statut;
import com.intiFormation.service.IStatutService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class StatutController {

	@Autowired
	IStatutService statutService;

	@GetMapping("/statuts")
	public List<Statut> selectAll()
	{
	    List<Statut> statuts = statutService.getAll();
	    return statuts;
	}


	@GetMapping("/statuts/{id}")
	public Statut selectById(@PathVariable("id") int id)
	{
	    Statut statut = statutService.getById(id);
	    return statut;
	}


	@PutMapping("/statuts")
	public void merge(@RequestBody Statut statut)
	{
	    statutService.merge(statut);
	}


	@DeleteMapping("/statuts/{id}")
	public void delete(@PathVariable("id") int id)
	{
	    statutService.delete(id);
	}
	
}
