package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IMessageDao;
import com.intiFormation.model.Message;

@Service
public class MessageService implements IMessageService {

	@Autowired
	IMessageDao messageDao;
	
	
	

	@Override
	public void merge(Message message) {
		messageDao.save(message);
		
	}

	@Override
	public Message getById(int id) {
		Message message = messageDao.findById(id).get();
		return message;
	}

	@Override
	public List<Message> getAll() {
		List<Message> messages = messageDao.findAll();
		return messages;
	}

	@Override
	public void delete(int id) {
		messageDao.deleteById(id);
		
	}
	
	

}
