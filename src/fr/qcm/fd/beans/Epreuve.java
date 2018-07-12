package fr.qcm.fd.beans;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Epreuve  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idEpreuve;
	private LocalDateTime dateDebutValidite;
	private LocalDateTime dateFinValidite;
	private int tempsEcoule;
	private char etat;
	private float noteObtenue;
	private char niveauObtenu;
	private Test test;
	private User utilisateur;
	
	//Constructors
	public Epreuve() {
		super();
	}

	public Epreuve(int idEpreuve, LocalDateTime dateDebutValidite, LocalDateTime dateFinValidite, int tempsEcoule,
			char etat, float noteObtenue, char niveauObtenu, Test test, User utilisateur) {
		super();
		this.idEpreuve = idEpreuve;
		this.dateDebutValidite = dateDebutValidite;
		this.dateFinValidite = dateFinValidite;
		this.tempsEcoule = tempsEcoule;
		this.etat = etat;
		this.noteObtenue = noteObtenue;
		this.niveauObtenu = niveauObtenu;
		this.test = test;
		this.utilisateur = utilisateur;
	}

	public Epreuve(LocalDateTime dateDebutValidite, LocalDateTime dateFinValidite, int tempsEcoule, char etat,
			float noteObtenue, char niveauObtenu, Test test, User utilisateur) {
		super();
		this.dateDebutValidite = dateDebutValidite;
		this.dateFinValidite = dateFinValidite;
		this.tempsEcoule = tempsEcoule;
		this.etat = etat;
		this.noteObtenue = noteObtenue;
		this.niveauObtenu = niveauObtenu;
		this.test = test;
		this.utilisateur = utilisateur;
	}

	//Getters/Setters
	public int getIdEpreuve() {
		return idEpreuve;
	}

	public void setIdEpreuve(int idEpreuve) {
		this.idEpreuve = idEpreuve;
	}

	public LocalDateTime getDateDebutValidite() {
		return dateDebutValidite;
	}

	public void setDateDebutValidite(LocalDateTime dateDebutValidite) {
		this.dateDebutValidite = dateDebutValidite;
	}

	public LocalDateTime getDateFinValidite() {
		return dateFinValidite;
	}

	public void setDateFinValidite(LocalDateTime dateFinValidite) {
		this.dateFinValidite = dateFinValidite;
	}

	public int getTempsEcoule() {
		return tempsEcoule;
	}

	public void setTempsEcoule(int tempsEcoule) {
		this.tempsEcoule = tempsEcoule;
	}

	public char getEtat() {
		return etat;
	}

	public void setEtat(char etat) {
		this.etat = etat;
	}

	public float getNoteObtenue() {
		return noteObtenue;
	}

	public void setNoteObtenue(float noteObtenue) {
		this.noteObtenue = noteObtenue;
	}

	public char getNiveauObtenu() {
		return niveauObtenu;
	}

	public void setNiveauObtenu(char niveauObtenu) {
		this.niveauObtenu = niveauObtenu;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public User getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(User utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Epreuve [idEpreuve=" + idEpreuve + ", dateDebutValidite=" + dateDebutValidite + ", dateFinValidite="
				+ dateFinValidite + ", tempsEcoule=" + tempsEcoule + ", etat=" + etat + ", noteObtenue=" + noteObtenue
				+ ", niveauObtenu=" + niveauObtenu + ", Test=" + test.toString() + ", Utilisateur=" + utilisateur.toString() + "]";
	}
	
	

}
