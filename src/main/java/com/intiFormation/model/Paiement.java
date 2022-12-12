package com.intiFormation.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Paiement {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private double montant;
	
	@ManyToOne
	@JoinColumn(name = "idStatut")
	private Statut statut;
	
	
	@ManyToOne
	@JoinColumn(name = "idFormation")
	private Formation formation;
	
	@ManyToOne
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Statut getStatut() {
		return statut;
	}
	public void setStatut(Statut statut) {
		this.statut = statut;
	}
	
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Paiement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
