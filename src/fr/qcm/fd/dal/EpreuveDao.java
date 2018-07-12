package fr.qcm.fd.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.List;

import fr.qcm.fd.beans.Epreuve;
import fr.qcm.fd.dal.util.DBConnection;

public class EpreuveDao implements DAO<Epreuve>
{
	private static final String SQLINSERT="INSERT INTO epreuve (dateDedutValidite,"
			+ "dateFinValidite, tempsEcoule, etat, note_obtenue, niveau_obtenu, "
			+ "idTest, idUtilisateur) VALUES (?,?,?,?,?,?,?,?)";

	//Singleton
		private static EpreuveDao instance= new EpreuveDao();
		
		
	//Constructor
	private EpreuveDao()
	{
			
	}
	
	//Pseudo-constructor
		public static EpreuveDao getInstance()
		{
			return instance;
		}

	@Override
	public void insert(Epreuve data) throws DALException {
		// TODO Auto-generated method stub
		Connection cnx = null;
		PreparedStatement rqt = null;
		try {
			cnx = DBConnection.seConnecter();
			rqt = cnx.prepareStatement(SQLINSERT, Statement.RETURN_GENERATED_KEYS);
			rqt.setString(1, data.getDateDebutValidite().toLocalDate().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
			rqt.setString(2, data.getDateFinValidite().toLocalDate().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
			//rqt.setInt(3, data.getTempsEcoule());
			rqt.setObject(3, null);
			//rqt.setString(4, String.valueOf(data.getEtat()));
			rqt.setString(4, "EA");
			//rqt.setFloat(5, data.getNoteObtenue());
			rqt.setObject(5, null);
			//rqt.setString(6, String.valueOf(data.getNiveauObtenu()));
			rqt.setObject(6, null);
			rqt.setInt(7, data.getTest().getIdTest());
			rqt.setInt(8, data.getUtilisateur().getidUser());

			int nbRows = rqt.executeUpdate();
			if(nbRows == 1)
				{
				ResultSet rs = rqt.getGeneratedKeys();
				if(rs.next())
					{
						data.setIdEpreuve(rs.getInt(1));
					}

				}
		}
		catch(SQLException e)
		{
			throw new DALException("Insert request failed - " + data, e);
		}
		finally
		{
			try
			{
				if (rqt != null)
				{
					rqt.close();
				}
				if(cnx!=null)
				{
					cnx.close();
				}
			}
			catch (SQLException e)
			{
				throw new DALException("close failed - ", e);
			}
		}
	}

	@Override
	public Epreuve selectById(int id) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Epreuve> selectAll() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Epreuve data) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws DALException {
		// TODO Auto-generated method stub
		
	}

}
