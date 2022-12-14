package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Rendezvous;

public interface IRendezvousService {

	
	public List<Rendezvous> getAll();
	public Rendezvous getById(int id);
	public void merge(Rendezvous region);
	public void delete(int id);
}
