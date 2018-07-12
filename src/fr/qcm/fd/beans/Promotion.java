package fr.qcm.fd.beans;

import java.io.Serializable;

public class Promotion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private char codePromo;
	private String libelle;
	
	public Promotion() {
		super();
	}

	public Promotion(char codePromo, String libelle) {
		super();
		this.codePromo = codePromo;
		this.libelle = libelle;
	}

	public Promotion(String libelle) {
		super();
		this.libelle = libelle;
	}

	public char getCodePromo() {
		return codePromo;
	}

	public void setCodePromo(char codePromo) {
		this.codePromo = codePromo;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	

}
