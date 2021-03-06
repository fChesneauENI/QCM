package fr.qcm.fd.dal.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnection
{
	/**
	 * @author ENI Ecole
	 * @param none
	 * @return Connection
	 * @throws SQLException
	 */
	public static Connection seConnecter()throws SQLException
	{
		Connection cnx = null;
		InitialContext jndi=null;
		DataSource ds=null;
		
		//----> Obtenir une r�f�rence sur le contexte initial JNDI
		try
		{
			jndi=new InitialContext();
		}
		catch(NamingException e)
		{
			throw new SQLException("Erreur d'acc�s au contexte initial JNDI");
		}
		
		//----> recherche du pool de connexion dans l'annuaire
		try
		{
			ds=(DataSource)jndi.lookup("java:comp/env/jdbc/dsBDD_QCM");
		}
		catch(NamingException e)
		{
			throw new SQLException("Objet introuvable dans l'arbre JNDI:"+e.getMessage());
		}
		
		//----> obtenir une connexion
		try
		{
			cnx = ds.getConnection();
			return cnx;
		}
		catch(SQLException e)
		{
			throw new SQLException("Impossible d'obtenir une connexion:"+e.getMessage());}
		}
}
