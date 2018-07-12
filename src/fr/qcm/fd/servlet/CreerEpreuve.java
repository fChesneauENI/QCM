package fr.qcm.fd.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.qcm.fd.beans.Test;
import fr.qcm.fd.beans.User;
import fr.qcm.fd.dal.TestDao;
import fr.qcm.fd.dal.UserDaoJdbcImpl;


/**
 * Servlet implementation class CreerEpreuve
 */
@WebServlet("/CreerEpreuve")
public class CreerEpreuve extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreerEpreuve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);	
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			
			/*
			 * Récupérer les données en base
			 */
			ArrayList<Test> tests = TestDao.selectAllTest();
			ArrayList<User> users = UserDaoJdbcImpl.selectAllCandidat();
			System.out.println(tests.get(0).toString());
			System.out.println(users.get(0).toString());
				
			/*
			 * Placer les tests dans le contexte de requete			
			 */
			request.setAttribute("listeTests", tests);
			request.setAttribute("listeUsers", users);
			
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/epreuve/creerEpreuve.jsp");
			dispatcher.forward(request,response);
			
		}catch (Exception e){
			request.setAttribute("erreur", e);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/erreurPage");
			dispatcher.forward(request,response);
		}
		
	}

}
