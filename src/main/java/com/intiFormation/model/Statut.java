package com.intiFormation.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Statut {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	
	@JsonIgnore
	@OneToMany(mappedBy = "statut")
	private List<Paiement> paiements;
	
	@JsonIgnore
	@OneToMany(mappedBy = "statut")
	private List<Prospect> prospects;
	
	@JsonIgnore
	@OneToMany(mappedBy = "statut")
	private List<Rendezvous> rendezvous;
	
	
	public List<Paiement> getPaiements() {
		return paiements;
	}
	public void setPaiements(List<Paiement> paiements) {
		this.paiements = paiements;
	}
	public List<Prospect> getProspects() {
		return prospects;
	}
	public void setProspects(List<Prospect> prospects) {
		this.prospects = prospects;
	}
	public List<Rendezvous> getRendezvous() {
		return rendezvous;
	}
	public void setRendezvous(List<Rendezvous> rendezvous) {
		this.rendezvous = rendezvous;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Statut() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
