 <%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Modifier une Voiture</title>
</head>
<body>
<form action="saveVoitures" method="post">
<pre>
id : <input type="text" name="idVoiture" value="${Voitures.IdVoiture}">
nom :<input type="text" name="nomVoiture" value="${Voitures.nomVoitures}">
prix :<input type="text" name="prixVoiture" value="${Voitures.prixVoiture}">
Date de retour :<input type="date" name="date">
<fmt:formatDate pattern="yyyy-MM-dd" value="${produit.dateCreation}" var="formatDate" />
<input type="date" name="date" value="${formatDate}"></input>
<input type="submit" value="Modifier">
</pre>
</form>
<br/>
<br/>
<a href="ListeVoiture">Liste Voiture</a>
</body>
</html>
