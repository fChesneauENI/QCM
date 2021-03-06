package fr.qcm.fd.beans;

import java.io.Serializable;

public class ReponseTirage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idProposition;
	private int idQuestion;
	private int idEpreuve;
	public ReponseTirage() {
		super();
	}
	public ReponseTirage(int idProposition, int idQuestion, int idEpreuve) {
		super();
		this.idProposition = idProposition;
		this.idQuestion = idQuestion;
		this.idEpreuve = idEpreuve;
	}
	public int getIdProposition() {
		return idProposition;
	}
	public void setIdProposition(int idProposition) {
		this.idProposition = idProposition;
	}
	public int getIdQuestion() {
		return idQuestion;
	}
	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}
	public int getIdEpreuve() {
		return idEpreuve;
	}
	public void setIdEpreuve(int idEpreuve) {
		this.idEpreuve = idEpreuve;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
}
