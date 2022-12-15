package com.intiFormation.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Utilisateur extends Personne {
	
	private String username;
	private String password;
	
	@Temporal(TemporalType.DATE)
	private Date dateInscription;
	
	
	@ManyToOne
	@JoinColumn(name = "idRole")
	private Role role;
	
	@OneToMany(mappedBy = "formateur")
	@JsonIgnore
	private List<Formation> formation;
	
	
	@ManyToMany
	@JoinTable(name = "utilisateur_formation",
    joinColumns = @JoinColumn(name = "idUtilisateur"),
    inverseJoinColumns = @JoinColumn(name = "idFormation"))
	@JsonIgnore
	private List<Formation> formations;
	
	@OneToMany(mappedBy = "utilisateur")
	@JsonIgnore
	private List<Paiement> paiement;
	
	@OneToMany(mappedBy = "utilisateur")
	@JsonIgnore
	private List<Rendezvous> rendezvous;
	
	
	@OneToMany(mappedBy = "utilisateur")
	@JsonIgnore
	private List<Message> message;
	
	

	public List<Rendezvous> getRendezvous() {
		return rendezvous;
	}

	
	
	
	public List<Message> getMessage() {
		return message;
	}




	public void setMessage(List<Message> message) {
		this.message = message;
	}




	public void setRendezvous(List<Rendezvous> rendezvous) {
		this.rendezvous = rendezvous;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	
	public List<Paiement> getPaiement() {
		return paiement;
	}

	public void setPaiement(List<Paiement> paiement) {
		this.paiement = paiement;
	}

	

	public List<Formation> getFormation() {
		return formation;
	}


	public void setFormation(List<Formation> formation) {
		this.formation = formation;
	}




	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
