package fr.qcm.fd.dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import fr.qcm.fd.beans.Test;
import fr.qcm.fd.dal.util.DBConnection;


public class TestDao implements DAO<Test>{
	
	private static final String SQLSELECTALLTEST="SELECT idTest, libelle, description, duree, seuil_haut, seuil_bas FROM test";

	@Override
	public void insert(Test data) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Test selectById(int id) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	public static ArrayList<Test> selectAllTest() throws DALException {
		
			Connection cnx = null;
			Statement rqt = null;
			ResultSet rs = null;
			ArrayList<Test> listeTests = new ArrayList<Test>();
			try
			{
				cnx = DBConnection.seConnecter();
				rqt = cnx.createStatement();
				rs = rqt.executeQuery(SQLSELECTALLTEST);
				Test test = null;

				while (rs.next())
				{
					test = new Test(rs.getInt("idTest"),
							rs.getString("libelle"),
							rs.getString("description"),
							rs.getInt("duree"),
							rs.getInt("seuil_haut"),
							rs.getInt("seuil_bas"));
					
					listeTests.add(test);
				}
			}
			catch (SQLException e)
			{
				throw new DALException("selectAll request failed - " , e);
			}
			finally
			{
				try
				{
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
			return listeTests;
		
	}

	@Override
	public void update(Test data) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Test> selectAll() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
