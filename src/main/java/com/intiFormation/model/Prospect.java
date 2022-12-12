package com.intiFormation.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Prospect extends Personne {
	
	
	@ManyToOne
	@JoinColumn(name = "idStatut")
	private Statut statut;

	@OneToMany(mappedBy = "prospect")
	@JsonIgnore
	private List<Rendezvous> rendezvous;
	
	
	
	
	public List<Rendezvous> getRendezvous() {
		return rendezvous;
	}

	public void setRendezvous(List<Rendezvous> rendezvous) {
		this.rendezvous = rendezvous;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public Prospect() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
