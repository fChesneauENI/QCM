package fr.qcm.fd.beans;

import java.io.Serializable;

public class Profil implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codeProfil;
	private String libelle;
	
	public Profil() {
		super();
	}

	public Profil(int codeProfil, String libelle) {
		super();
		this.codeProfil = codeProfil;
		this.libelle = libelle;
	}

	public Profil(String libelle) {
		super();
		this.libelle = libelle;
	}

	public int getCodeProfil() {
		return codeProfil;
	}

	public void setCodeProfil(int codeProfil) {
		this.codeProfil = codeProfil;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
