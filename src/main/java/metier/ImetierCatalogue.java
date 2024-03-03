package metier;

import java.util.List;
public interface ImetierCatalogue {
public List<Etudiant> getEtudiantsParMotCle(String mc);
public void addEtudiant(Etudiant p);
}