package com.intiFormation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiFormation.model.Utilisateur;
import com.intiFormation.service.IUtilisateurService;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class UtilisateurController {
	
	@Autowired
	private IUtilisateurService utilisateurService;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	

	@GetMapping("/utilisateurs")
    public List<Utilisateur> selectAll()
    {
        List<Utilisateur> utilisateurs = utilisateurService.getAll();
        return utilisateurs;
        
    }
    
    @GetMapping("/utilisateurs/{id}")
    public Utilisateur selectById(@PathVariable("id") int id)
    {
    	Utilisateur utilisateur = utilisateurService.getById(id);
        return utilisateur;
        
    }
    
    @GetMapping("/utilisateur/{username}")
    public Utilisateur selectByUsername(@PathVariable("username") String username)
    {
    	Utilisateur utilisateur = utilisateurService.findByUsername(username);
        return utilisateur;
        
    }
    
    @GetMapping("/utilisateurs/roles/{nomRole}")
    public List<Utilisateur> selectByNomRole(@PathVariable("nomRole") String nomRole)
    {
    	List<Utilisateur> utilisateurs = utilisateurService.findByRole_nom(nomRole);
        return utilisateurs;
        
    }


    @PutMapping("/utilisateurs/password")
    public void mergePassword(@RequestBody Utilisateur utilisateur)
    {
    	utilisateur.setPassword(bcrypt.encode(utilisateur.getPassword()));
    	utilisateurService.merge(utilisateur);
    }

    
    @PutMapping("/utilisateurs/informations")
    public void mergeInformations(@RequestBody Utilisateur utilisateur)
    {
    	utilisateurService.merge(utilisateur);
    }
    
    @PostMapping("/utilisateurs/fromArray")
    public List<Utilisateur> userFromArray( @RequestBody Integer[] tab)
    {
    	for(int val :tab)
    	{
    		System.out.println(val);
    	}
    	return this.utilisateurService.selectUtilisateurFormation(tab);
    }
    
    
    @PostMapping("/utilisateurs")
    public void add(@RequestBody Utilisateur utilisateur)
    {
    	utilisateur.setPassword(bcrypt.encode(utilisateur.getPassword()));
    	utilisateurService.merge(utilisateur);
    }
    
    @DeleteMapping("/utilisateurs/{id}")
    public void delete(@PathVariable("id") int id)
    {
    	utilisateurService.delete(id);
    }
    

}
