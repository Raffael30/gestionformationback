package com.intiFormation.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	private String lieu;
	private double prix;
	
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	
	@ManyToMany
	@JoinTable(name = "formation_utilisateur",
    joinColumns = @JoinColumn(name = "idFormation"),
    inverseJoinColumns = @JoinColumn(name = "idUtilisateur"))
	private List<Utilisateur> utilisateurs;
	
	
	@ManyToOne
	@JoinColumn(name = "idFormateur")
	private Utilisateur formateur;
	
	
	@OneToMany(mappedBy = "formation")
	@JsonIgnore
	private List<Paiement> paiements;
	
	
	
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
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	public List<Paiement> getPaiements() {
		return paiements;
	}
	public void setPaiements(List<Paiement> paiements) {
		this.paiements = paiements;
	}
	
	
	public Utilisateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Utilisateur formateur) {
		this.formateur = formateur;
	}
	
	
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
