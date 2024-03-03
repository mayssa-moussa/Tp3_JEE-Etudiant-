package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
@Override
public List<Etudiant> getEtudiantsParMotCle(String mc) {
List<Etudiant> etud= new ArrayList<Etudiant>();
Connection conn=SingletonConnection.getConnection();
try {
PreparedStatement ps= conn.prepareStatement("select * from ETUDIANTS where NOM LIKE ?");
ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Etudiant E = new Etudiant();
E.setIdEtudiant(rs.getLong("ID_ETUDIANT"));
E.setNom(rs.getString("NOM"));
E.setPrenom(rs.getString("PRENOM"));
E.setDateNaiss(rs.getString("DATENAISS"));
E.setAdresse(rs.getString("ADRESSE"));
E.setEmail(rs.getString("EMAIL"));
E.setAnneeEtudes(rs.getInt("ANNEE_ETUDES"));
E.setDep(rs.getString("DEPARTEMENT"));

etud.add(E);
}
} catch (SQLException e) {
e.printStackTrace();
}
return etud;
}
@Override
public void addEtudiant(Etudiant p) {
// TODO Auto-generated method stub
}
}
