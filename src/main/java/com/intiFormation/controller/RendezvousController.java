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

import com.intiFormation.model.Rendezvous;
import com.intiFormation.service.IRendezvousService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class RendezvousController {

	
	@Autowired
	private IRendezvousService rendezvousService;
	
	@GetMapping("/rendezvouss")
	public List<Rendezvous> selectAll()
	{
		List<Rendezvous> rendezvouss=rendezvousService.getAll();
		return rendezvouss;
	}

	@GetMapping("/rendezvouss/{id}")
	public Rendezvous selectById(@PathVariable("id") int id)
	{
		Rendezvous rendezvous=rendezvousService.getById(id);
		return rendezvous;
	}

	@PutMapping("/rendezvouss")
	public void merge(@RequestBody Rendezvous rendezvous)
	{
		rendezvousService.merge(rendezvous);
	}

	@DeleteMapping("/rendezvouss/{id}")
	public void delete(@PathVariable("id") int id)
	{
		
		rendezvousService.delete(id);
	}
}
