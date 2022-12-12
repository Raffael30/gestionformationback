package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IRoleDao;
import com.intiFormation.model.Role;

@Service
public class RoleService implements IRoleService {

	@Autowired
	IRoleDao rolDao;
	
	
	
	
	
	public IRoleDao getRolDao() {
		return rolDao;
	}

	public void setRolDao(IRoleDao rolDao) {
		this.rolDao = rolDao;
	}

	@Override
	public void merge(Role rol) {
		rolDao.save(rol);
		
	}

	@Override
	public Role getById(int id) {
		Role rol = rolDao.findById(id).get();
		return rol;
	}

	@Override
	public List<Role> getAll() {
		List<Role> roles = rolDao.findAll();
		return roles;
	}

	@Override
	public void delete(int id) {
		rolDao.deleteById(id);
		
	}
	
	

}
