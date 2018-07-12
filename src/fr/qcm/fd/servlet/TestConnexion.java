package fr.qcm.fd.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.el.util.ConcurrentCache;

import fr.qcm.fd.dal.util.DBConnection;

/**
 * Servlet implementation class TestConnexion
 */
@WebServlet("/TestConnexion")
public class TestConnexion extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestConnexion() {
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
		PrintWriter out = null;
		try {
			Connection cnx = DBConnection.seConnecter();
			response.setContentType("text/html");
			out = response.getWriter();
			out.append("<html><head><title>connection</title></head><body>");
			out.append("connexion ok");
			out.append("</body></html>");
			out.flush();
			
		} catch (SQLException e) {
			response.setContentType("text/html");
			out = response.getWriter();
			out.append("<html><head><title>connection</title></head><body>");
			out.append("probleme connexion : "+e.getMessage());
			out.append("</body></html>");
			out.flush();
		} finally {
			out.close();
		}
	}

}
