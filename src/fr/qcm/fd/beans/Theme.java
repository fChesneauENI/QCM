package fr.qcm.fd.beans;

import java.io.Serializable;

public class Theme implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idTheme;
	private String libelle;
	
	public Theme() {
		super();
	}

	public Theme(int idTheme, String libelle) {
		super();
		this.idTheme = idTheme;
		this.libelle = libelle;
	}

	public Theme(String libelle) {
		super();
		this.libelle = libelle;
	}

	public int getIdTheme() {
		return idTheme;
	}

	public void setIdTheme(int idTheme) {
		this.idTheme = idTheme;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
