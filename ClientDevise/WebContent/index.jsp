<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Converstion Devise</title>
</head>
<h2><center>Converstion de devise</center></h2>
<body>
	<form action="ClientServlet" method=post>
		
			
			
		Euro : 	<input type="text" name="moneyIn">
		
		TO : 	<select name="deviseIn"> 

				<c:forEach items="${listeDevise}" var="titre"  >

					<option value='<c:out value="${ titre }"></c:out>'><c:out
							value="${ titre }"></c:out></option>
				</c:forEach>
			</select> 

		<button type="submit">Convertir</button>
	</form>
	Resulat : 
	<input type="text" name="moneyOut" value="${requestScope.moneyOut }">
</body>
</html>