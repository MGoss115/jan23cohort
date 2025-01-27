<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for forms -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!-- for validation -->
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<style>
table, th, td {
  border:1px solid black;
}
</style>
<head>
<meta charset="UTF-8">
<title>Dojos and Ninjas</title>
</head>
<body>
	<header>
	<h1><c:out value="${oneDojo.location}" /> Location Ninjas</h1>
		<nav>
			<a href="/">Home</a>
		</nav>
	</header>
	<main>
		<table style="width:75%">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
			<c:forEach var="l" items="${oneDojo.ninjas}">
				<tr>
					<td><c:out value="${l.firstName}"></c:out></td>
					<td><c:out value="${l.lastName}"></c:out></td>
					<td><c:out value="${l.age}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</main>
	<footer>
	
	</footer>
</body>
</html>







	