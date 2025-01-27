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
<title>Relationships</title>
</head>
<body>
	<header>
	<h1>New Person</h1>
		<nav>
		
		</nav>
	</header>
	<main>
		<table style="width:75%">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="p" items="${persons}">
				<tr>
					<td><a href="/persons/${p.id}"><c:out value="${p.firstName}"></c:out></a></td>
					<td><c:out value="${p.lastName}"></c:out></td>
					<td>
						<a href="#">Edit</a>	
						<form action="#" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button value="Delete">Delete</button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
		<h2>Add Person</h2>
		<form:form action="/persons/new" method="post" modelAttribute="person">
		    <p>
		        <form:label path="firstName">First Name:</form:label>
		        <form:errors path="firstName"/>
		        <form:input path="firstName"/>
		    </p>
		    <p>
		        <form:label path="lastName">Last Name</form:label>
		        <form:errors path="lastName"/>
		        <form:input path="lastName"/>
		    </p>   
		    <button>Submit</button>
		</form:form> 
	</main>
	<footer>
	
	</footer>
</body>
</html>