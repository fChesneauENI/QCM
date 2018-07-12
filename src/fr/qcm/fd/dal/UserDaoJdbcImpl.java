package fr.qcm.fd.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.qcm.fd.beans.Profil;
import fr.qcm.fd.beans.User;
import fr.qcm.fd.dal.util.DBConnection;
import fr.qcm.fd.dal.util.PasswordTools;


public class UserDaoJdbcImpl implements DAO<User>
{
	private static final String SQLLOGIN="SELECT idUtilisateur, nom, prenom, email, password, utilisateur.codeProfil, profil.libelle FROM utilisateur "
										+ "INNER JOIN profil ON utilisateur.codeProfil = profil.codeProfil "
										+ "WHERE email=? AND password=?";
	private static final String SQLSELECTALLCANDIDAT="SELECT idUtilisateur, nom, prenom, email, utilisateur.codeProfil, profil.libelle, codePromo FROM utilisateur "
										+ "INNER JOIN profil ON utilisateur.codeProfil = profil.codeProfil "
										+ "WHERE profil.libelle='candidat'";
	private static final String SQLINSERT="";
	
	//Singleton
	private static UserDaoJdbcImpl instance= new UserDaoJdbcImpl();
	
	
	//Constructor
	private UserDaoJdbcImpl()
	{
		
	}
		
	//Pseudo-constructor
	public static UserDaoJdbcImpl getInstance()
	{
		return instance;
	}
	
	public User selectByCredentials (String log, String mdp) throws DALException
	{
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		User user = null;

		try
		{
			cnx = DBConnection.seConnecter();
			rqt = cnx.prepareStatement(SQLLOGIN);
			rqt.setString(1, log);
			rqt.setString(2, PasswordTools.getInstance().hashMD5(mdp));
			rs = rqt.executeQuery();
			
			if (rs.next())
				{
				user = new User(rs.getInt("idUtilisateur"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("email"),
						rs.getString("password"),
						new Profil(rs.getInt("codeProfil"),rs.getString("libelle")));				
				}
				
		} catch (SQLException e)
		{
			throw new DALException("Login Attempt request failed - Mail utilisateur = " + log , e);
		}
		finally
		{
			try {
				if (rs != null)
					{
					rs.close();
					}
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
				e.printStackTrace();
			}
		}
		return user;
	}
	
	@Override
	public void insert(User data) throws DALException {
		// TODO Auto-generated method stub
		Connection cnx = null;
		PreparedStatement rqt = null;
		try {
			cnx = DBConnection.seConnecter();
			rqt = cnx.prepareStatement(SQLINSERT, Statement.RETURN_GENERATED_KEYS);
			rqt.setString(1, data.getNom());
			rqt.setString(2, data.getPrenom());
			rqt.setString(3, data.getEmail());
			rqt.setString(4, data.getpassword());
			rqt.setInt(5, data.getProfil().getCodeProfil());

			int nbRows = rqt.executeUpdate();
			if(nbRows == 1)
				{
				ResultSet rs = rqt.getGeneratedKeys();
				if(rs.next())
					{
						data.setidUser(rs.getInt(1));
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
	public User selectById(int id) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	public static ArrayList<User> selectAllCandidat() throws DALException {
		
			Connection cnx = null;
			Statement rqt = null;
			ResultSet rs = null;
			ArrayList<User> listeUsers = new ArrayList<User>();
			try
			{
				cnx = DBConnection.seConnecter();
				rqt = cnx.createStatement();
				rs = rqt.executeQuery(SQLSELECTALLCANDIDAT);
				User user = null;

				while (rs.next())
				{
					user = new User(rs.getInt("idUtilisateur"),
							rs.getString("nom"),
							rs.getString("prenom"),
							rs.getString("email"),
							new Profil(rs.getInt("codeProfil"),rs.getString("libelle")));
					listeUsers.add(user);
				}
			}
			catch (SQLException e)
			{
				throw new DALException("selectAllCandidat request failed - " , e);
			}
			finally
			{
				try
				{
					if (rs != null){
						rs.close();
					}
					if (rqt != null){
						rqt.close();
					}
					if(cnx!=null){
						cnx.close();
					}
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
			return listeUsers;
		
	}

	@Override
	public void update(User data) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> selectAll() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}
}
