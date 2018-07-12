package fr.qcm.fd.beans;

import java.io.Serializable;

public class User implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idUser;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private Profil profil;
	private String promo;
	
	
	
	//Constructors
	public User() {
		super();
	}
	public User(int idUser, String nom, String prenom, String email, String password, Profil profil) {
		super();
		this.idUser = idUser;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.profil= profil;
	}
	public User(int idUser, String nom, String prenom, String email, Profil profil) {
		super();
		this.idUser = idUser;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.profil = profil;
	}
	public User(String nom, String prenom, String email, Profil profil) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.profil= profil;
	}
	
	//Getters/Setters
	public int getidUser() {
		return idUser;
	}
	public void setidUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public Profil getProfil() {
		return profil;
	}
	public void setProfil(Profil profil) {
		this.profil = profil;
	}
	public String getPromo() {
		return promo;
	}
	public void setPromo(String promo) {
		this.promo = promo;
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", password="
				+ password + ", profil=" + profil.toString() + ", promo=" + promo + "]";
	}
	
	
}
