package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IMessageDao;
import com.intiFormation.model.Message;

@Service
public class MessageService implements IMessageService {

	@Autowired
	IMessageDao rolDao;
	
	
	
	
	
	public IMessageDao getRolDao() {
		return rolDao;
	}

	public void setRolDao(IMessageDao rolDao) {
		this.rolDao = rolDao;
	}

	@Override
	public void merge(Message rol) {
		rolDao.save(rol);
		
	}

	@Override
	public Message getById(int id) {
		Message rol = rolDao.findById(id).get();
		return rol;
	}

	@Override
	public List<Message> getAll() {
		List<Message> messages = rolDao.findAll();
		return messages;
	}

	@Override
	public void delete(int id) {
		rolDao.deleteById(id);
		
	}
	
	

}
