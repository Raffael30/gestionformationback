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

import com.intiFormation.model.Formation;
import com.intiFormation.service.IFormationService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class FormationController {
	
	
	@Autowired
	private IFormationService formationService;
	
	

	@GetMapping("/formations")
    public List<Formation> selectAll()
    {
        List<Formation> formations = formationService.getAll();
        return formations;
        
    }
    
    @GetMapping("/formations/{id}")
    public Formation selectById(@PathVariable("id") int id)
    {
    	Formation formation = formationService.getById(id);
        return formation;
        
    }
    


    @PutMapping("/formations")
    public void merge(@RequestBody Formation formation)
    {
    	formationService.merge(formation);
    }
    
    @DeleteMapping("/formations/{id}")
    public void delete(@PathVariable("id") int id)
    {
    	formationService.delete(id);
    }
    

}
