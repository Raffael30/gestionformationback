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

import com.intiFormation.model.Paiement;
import com.intiFormation.service.IPaiementService;



@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class PaiementController {
	
	@Autowired
	private IPaiementService paiementService;
	
	

	@GetMapping("/paiements")
    public List<Paiement> selectAll()
    {
        List<Paiement> paiements = paiementService.getAll();
        return paiements;
        
    }
    
    @GetMapping("/paiements/{id}")
    public Paiement selectById(@PathVariable("id") int id)
    {
    	Paiement paiement = paiementService.getById(id);
        return paiement;
        
    }
    


    @PutMapping("/paiements")
    public void merge(@RequestBody Paiement paiement)
    {
    	paiementService.merge(paiement);
    }
    
    @DeleteMapping("/paiements/{id}")
    public void delete(@PathVariable("id") int id)
    {
    	paiementService.delete(id);
    }
    

}
