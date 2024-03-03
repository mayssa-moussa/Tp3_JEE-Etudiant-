package test;

import java.util.List;

import metier.Etudiant;
import metier.MetierImpl;
public class TestMetier {
public static void main(String[] args) {
MetierImpl metier= new MetierImpl();
List<Etudiant> etud = metier.getEtudiantsParMotCle("m");
for (Etudiant E: etud)
System.out.println(E.getNom()+" "+E.getPrenom());
}
}