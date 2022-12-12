package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Role;

public interface IRoleService {
	
	public void merge(Role rol);
	public Role getById(int id);
	public List<Role> getAll();
	public void delete(int id);

}
