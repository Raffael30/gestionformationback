package com.intiFormation.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Message {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String objet;
	
	@ManyToOne
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur;
	

	@OneToOne
	@JoinColumn(name = "idRendezvous")
	private Rendezvous rendezvous;
	
	
	
	public Rendezvous getRendezvous() {
		return rendezvous;
	}
	public void setRendezvous(Rendezvous rendezvous) {
		this.rendezvous = rendezvous;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
