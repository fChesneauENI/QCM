package fr.qcm.fd.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import fr.qcm.fd.beans.User;
import fr.qcm.fd.dal.DALException;
import fr.qcm.fd.dal.UserDaoJdbcImpl;
import fr.qcm.fd.dal.util.DBConnection;

/**
 * Servlet implementation class UserManager
 */
public class UserManager extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		RequestDispatcher dispatcher;
		String log= request.getParameter("identifiant");
		String mdp= request.getParameter("motdepasse");
		
		try
		{
			Connection cnx = DBConnection.seConnecter();
			User user= UserDaoJdbcImpl.getInstance().selectByCredentials(log, mdp);
			User userConnecte = null;

			// Si l'animateur est déjà  connecté, on redirige vers le menu animateur
			userConnecte = (User)request.getSession().getAttribute("userConnecte");
			//System.out.println("userConnecte !" + userConnecte);
			if (userConnecte!=null) {
				System.out.println("Connecté !");
				redirectionAccueilCandidat(request, response);
				return;
			}	
			
			// si tous les champs ne sont pas renseignés, revenir sur la page du formulaire
			if ((log == null) || (log.length() == 0) 
				|| (mdp == null) || (mdp.length() == 0))
			{
				request.setAttribute("error", "Veuillez remplir tous les champs");
				dispatcher = getServletContext().getRequestDispatcher("/Login/authentification.jsp");
				dispatcher.forward(request, response);
				return;
			}
			
			if (user!=null)
			{	
				response.getWriter().println("Cheers !!!");
				HttpSession session = request.getSession();

		        session.setAttribute("user", user);
		        
		        request.setAttribute("user", user);
		        request.getRequestDispatcher("/accueilCandidat.jsp").forward(request, response);
		        
			}
			else
			{
				response.getWriter().println("Faiiiiil !!!");
			}
		}
		catch (DALException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
protected void redirectionAccueilCandidat(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// En fonction de la méthode de redirection utilisée (forward ou sendRedirect()),
		// l'utilisateur pourra voir ou non l'URL de la ressource : 
		
		// L'utilisation d'un forward masque la nouvelle ressource demandée (car tout 
		// se passe au sein du serveur d'application) 
		System.out.println("Redirection !");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/accueilCandidat");
		dispatcher.forward(request, response);
		
		// L'utilisation d'un sendRedirect expose le nom de la page à l'utilisateur (car
		// une reponse 302 est renvoyée au navigateur qui doit obligatoirement connaitre l'URL
		// de la ressource pour refaire une requete HTTP)
		//response.sendRedirect(request.getContextPath()+"/animateur/menuAnimateurPage");
	}

}
