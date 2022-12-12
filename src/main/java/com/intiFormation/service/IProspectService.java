package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Prospect;

public interface IProspectService {

	public List<Prospect> getAll();
	public Prospect getById(int id);
	public void merge(Prospect prospect);
	public void delete(int id);
}
