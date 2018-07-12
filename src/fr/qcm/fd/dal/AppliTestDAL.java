package fr.qcm.fd.dal;

import java.sql.SQLException;

import fr.qcm.fd.dal.util.DBConnection;


public class AppliTestDAL {

	public static void main(String[] args) throws DALException, SQLException {

		
		//DÃ©claration et instanciation de la DAO
		
DBConnection acces = new DBConnection();
		try{DBConnection.seConnecter();
		System.out.println("connection ok");
		
		}catch (SQLException e){
			System.out.println("connection down");
			e.printStackTrace();
		}
		//Instanciation du jeu d'essai 
		
	/*		this.idUser = idUser;
		 	this.nom = nom;
			this.prenom = prenom;
			this.email = email;
			this.password = password;
		*/	
		 
	//	User c1 = new User("Paul","Durand","PaulDurand@yahoo.fr","058e7d18");
	//	User c2 = new User("Paul","Dupont","Imp. de la gariggue","","07810","Crussol","0493018823","072h7x93","pDurand@pdupont.com","",false);
	//	User c3 = new User("Robert","Bidochon","Imp. des français moyens","","91300","L'essonne-Gelès","0123456789","014f9x92","rBidochon@bd.com","",false);
/*
		System.out.println("Ajout des clients en BDD... ");

			clientDAO.insert(c1);			
			clientDAO.insert(c2);			
			clientDAO.insert(c3);


			//Sélection de l'article par id
			System.out.println(clientDAO.selectById(3).toString());
			
			//Sélection de tous les clients
			List<Client> clients = clientDAO.selectAll();
			afficherClients(clients);
		
			//Modification d'un client
			System.out.println("\nModification d'un article  : " );
			System.out.println("Article avant modification : "  + c1.toString());
			c1.setCodeClient(1);
			c1.setPrenomClient("Paul");
			c1.setNomClient("Amar");
			c1.setAdresse1("rekhov ben yehuda");
			clientDAO.update(c1);
			System.out.println("Article aprÃ¨s modification  : " + c1.toString() );
				
			
		//Suppression d'un article
			System.out.println("\nSuppression de l'article  : " + c1.toString());
			clientDAO.delete(1);
			System.out.println("Liste des articles après suppression : "  );
			afficherClients(clientDAO.selectAll());
			System.out.println("---------------------------------------------------------------");

		
		Agenda a1= new Agenda (1,LocalDate.parse("2015-07-12"),LocalTime.parse("10:15:30"),3);
		Agenda a2= new Agenda (1,LocalDate.parse("2015-08-24"),LocalTime.parse("14:30:00"),4);
		
		agendaDAO.insert(a1);
		agendaDAO.insert(a2);
	}

	
	private static void afficherUsers(List<User> users){
		/*StringBuffer sb = new StringBuffer();
		for(Article art: articles){
			sb.append(art.toString());
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
		for (User use: users)
		  {
			  System.out.println(use.toString()); 
		  }*/
		
	}
}
