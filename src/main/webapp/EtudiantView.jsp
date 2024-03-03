<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body>
<form action="controleur" method="post" >
<input type="text" name="motCle" value="${modele.motCle}">
<input type="submit" value="OK">
</form>
<table border="1" width="80%">
<tr>
<th>ID</th> <th>Nom</th> <th>Prénom</th> <th>date_naissance</th> <th>adresse</th> 
<th>email</th> <th>année_études</th> <th>departement</th>
</tr>
<c:forEach items="${modele.etudiants}" var="e">
<tr>
<td>${e.idEtudiant}</td>
<td>${e.nom}</td>
<td>${e.prenom}</td>
<td>${e.dateNaiss}</td>
<td>${e.adresse}</td>
<td>${e.email}</td>
<td>${e.anneeEtudes}</td>
<td>${e.dep}</td>
</tr>
</c:forEach>
</table>
</body>
</html>