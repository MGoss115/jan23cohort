<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for forms -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!-- for validation -->
<%@ page isErrorPage="true" %>


<!DOCTYPE html>
<html>
<style>
table, th, td {
  border:1px solid black;
}
</style>
<head>
<meta charset="UTF-8">
<title>Dojo and Ninjas</title>
</head>
<body>
	<header>
	<h1>New Dojo</h1>
		<nav>
		<a href="/ninjas">Add Ninja</a>
		</nav>
	</header>
	<main>
		<table style="width:25%">
			<tr>
				<th>Location</th>
			</tr>
			<c:forEach var="l" items="${dojos}">
				<tr>
					<td><a href="/dojos/${l.id}"><c:out value="${l.location}"></c:out></a></td>
				</tr>
			</c:forEach>
		</table> 
		<h2>Add Dojo</h2>
		<form:form action="/dojos/new" method="post" modelAttribute="dojo">
		    <p>
		        <form:label path="location">Location Name:</form:label>
		        <form:errors path="location"/>
		        <form:input path="location"/>
		    </p>   
		    <button>Submit</button>
		</form:form> 
	</main>
	<footer>
	
	</footer>
</body>
</html>