package fr.qcm.fd.beans;

import java.io.Serializable;

import javax.websocket.Decoder.Binary;

public class Question implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idQuestion;
	private String enonce;
	private Binary media;
	private int points;
	private int idTheme;
	
	public Question() {
		super();
	}
	
	public Question(int idQuestion, String enonce, Binary media, int points, int idTheme) {
		super();
		this.idQuestion = idQuestion;
		this.enonce = enonce;
		this.media = media;
		this.points = points;
		this.idTheme = idTheme;
	}
	
	public Question(String enonce, Binary media, int points, int idTheme) {
		super();
		this.enonce = enonce;
		this.media = media;
		this.points = points;
		this.idTheme = idTheme;
	}
	
	public int getIdQuestion() {
		return idQuestion;
	}
	
	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}
	
	public String getEnonce() {
		return enonce;
	}
	
	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}
	
	public Binary getMedia() {
		return media;
	}
	
	public void setMedia(Binary media) {
		this.media = media;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public int getIdTheme() {
		return idTheme;
	}
	
	public void setIdTheme(int idTheme) {
		this.idTheme = idTheme;
	}
	

}
