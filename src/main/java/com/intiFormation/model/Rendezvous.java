package com.intiFormation.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Rendezvous {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//@Temporal(TemporalType.DATE)
	private Date date;
	private String commentaire;
	
	private LocalDateTime horaire;
	
	@ManyToOne
	@JoinColumn(name = "idStatut")
	private Statut statut;

	
	@ManyToOne
	@JoinColumn(name = "idProspect")
	@JsonIgnore
	private Prospect prospect;
	
	@ManyToOne
	@JoinColumn(name = "idUtilisateur")
	@JsonIgnore
	private Utilisateur utilisateur;
	
	
	@OneToOne
	@JoinColumn(name = "idMessage")
	@JsonIgnore
	private Message message;
	
	
	
	
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Prospect getProspect() {
		return prospect;
	}

	public void setProspect(Prospect prospect) {
		this.prospect = prospect;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public LocalDateTime getHoraire() {
		return horaire;
	}

	public void setHoraire(LocalDateTime horaire) {
		this.horaire = horaire;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public Rendezvous() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
