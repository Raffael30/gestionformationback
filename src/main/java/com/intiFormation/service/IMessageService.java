package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Message;

public interface IMessageService {
	
	public void merge(Message message);
	public Message getById(int id);
	public List<Message> getAll();
	public void delete(int id);

}
