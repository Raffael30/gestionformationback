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

import com.intiFormation.model.Role;
import com.intiFormation.service.IRoleService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class RoleController {
	
	@Autowired
	private IRoleService roleService;
	

	@GetMapping("/roles")
    public List<Role> selectAll()
    {
        List<Role> roles = roleService.getAll();
        return roles;
        
    }
    
    @GetMapping("/roles/{id}")
    public Role selectById(@PathVariable("id") int id)
    {
    	Role role = roleService.getById(id);
        return role;
        
    }

    @PutMapping("/roles")
    public void merge(@RequestBody Role role)
    {
    	roleService.merge(role);
    }
    
    @DeleteMapping("/roles/{id}")
    public void delete(@PathVariable("id") int id)
    {
    	roleService.delete(id);
    }
    


}
