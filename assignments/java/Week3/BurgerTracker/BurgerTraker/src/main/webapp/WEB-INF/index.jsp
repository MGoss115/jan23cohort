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
<title>Burger Tracker</title>
</head>
<body>
<header>
	<h1>Burger Tracker</h1>
		<nav>
		
		</nav>
	</header>
	<main>
		<table style="width:75%">
			<tr>
				<th>Burger Name</th>
				<th>Restaurant Name</th>
				<th>Rating (out of 5)</th>
				<th>Action</th>
			</tr>
			<c:forEach var="b" items="${burgers}">
				<tr>
					<td><c:out value="${b.name}"></c:out></td>
					<td><c:out value="${b.restaurant}"></c:out></td>
					<td><c:out value="${b.rating}"></c:out></td>
					<td><a href="/burgers/${b.id}/edit">Edit</a></td>
				</tr>
			</c:forEach>
		</table>
		<h2>Add a Burger</h2>
		<form:form action="/burgers" method="post" modelAttribute="burger">
		    <p>
		        <form:label path="name">Burger Name</form:label>
		        <form:errors path="name"/>
		        <form:input path="name"/>
		    </p>
		    <p>
		        <form:label path="restaurant">Restaurant Name</form:label>
		        <form:errors path="restaurant"/>
		        <form:input path="restaurant"/>
		    </p>
		    <p>
		        <form:label path="rating">Rating</form:label>
		        <form:errors path="rating"/>     
		        <form:input type="number" path="rating" min="1" max="5"/>
		    </p>    
		   	<p>
		        <form:label path="note">Notes</form:label>
		        <form:errors path="note"/>     
		        <form:textarea type="text" path="note"/>
		    </p>    
		    <button>Submit</button>
		</form:form> 
	</main>
	<footer>
	
	</footer>
</body>
</html>