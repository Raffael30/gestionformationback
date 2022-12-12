package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Statut;

public interface IStatutService {

	public Statut getById(int id);

	public List<Statut> getAll();

	public void merge(Statut statut);

	public void delete(int id);
}
