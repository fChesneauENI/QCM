package fr.qcm.fd.beans;

import java.io.Serializable;

public class SectionTest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int nbQuestionsATirer;
	private int idTest;
	private int idTheme;
	
	public SectionTest() {
		super();
	}
	public SectionTest(int nbQuestionsATirer, int idTest, int idTheme) {
		super();
		this.nbQuestionsATirer = nbQuestionsATirer;
		this.idTest = idTest;
		this.idTheme = idTheme;
	}
	public SectionTest(int idTest, int idTheme) {
		super();
		this.idTest = idTest;
		this.idTheme = idTheme;
	}
	public int getNbQuestionsATirer() {
		return nbQuestionsATirer;
	}
	public void setNbQuestionsATirer(int nbQuestionsATirer) {
		this.nbQuestionsATirer = nbQuestionsATirer;
	}
	public int getIdTest() {
		return idTest;
	}
	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}
	public int getIdTheme() {
		return idTheme;
	}
	public void setIdTheme(int idTheme) {
		this.idTheme = idTheme;
	}
	

}
