package web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.ImetierCatalogue;
import metier.MetierImpl;
import metier.Etudiant;
@WebServlet (name="cs",urlPatterns= {"/controleur"})
public class ControleurServlet extends HttpServlet {
private ImetierCatalogue metier;
@Override
public void init() throws ServletException {
metier=new MetierImpl();
}
@Override
protected void doPost(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
	String mc=request.getParameter("motCle");
	EtudiantModele mod = new EtudiantModele();
	mod.setMotCle(mc);
	List<Etudiant> etuds = metier.getEtudiantsParMotCle(mc);
	mod.setEtudiants(etuds);
	request.setAttribute("modele", mod);
	request.getRequestDispatcher("EtudiantView.jsp").forward(request,response);
	}
	}
