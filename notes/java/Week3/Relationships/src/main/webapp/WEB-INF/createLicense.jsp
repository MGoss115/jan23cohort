<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
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
	<h1>New License</h1>
		<nav>
		
		</nav>
	</header>
	<main>
		<table style="width:75%">
			<tr>
				<th>Name</th>
				<th>License Number</th>
				<th>Expiration Date</th>
				<th>State</th>
			</tr>
			<c:forEach var="l" items="${licenses}">
				<tr>
					<td><c:out value="${l.person.firstName} ${l.person.lastName}"></c:out></td>
					<td><c:out value="${l.number}"></c:out></td>
					<td><c:out value="${l.expirationDate}"></c:out></td>
					<td><c:out value="${l.state}"></c:out></td>
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
		<h2>Add License</h2>
		<form:form action="/licenses/new" method="post" modelAttribute="license">
		     <p>
		        <form:label path="state">State:</form:label>
		        <form:errors path="state"/>
		        <form:input path="state"/>
		    </p>
		    <p>
		        <form:label path="number">License Number:</form:label>
		        <form:errors path="number"/>
		        <form:input path="number"/>
		    </p>
		<%--     <p>
		        <form:label path="expirationDate">Exp. Date:</form:label>
		        <form:errors path="expirationDate"/>
		        <form:input  path="expirationDate"/>
		    </p> --%>
		    <p>
		        <form:select path="person">
		        <c:forEach var="onePerson" items="${persons}">
		            <!--- Each option VALUE is the id of the person --->
		            <form:option value="${onePerson.id}" path="person">
		            <!--- This is what shows to the user as the option --->
		                <c:out value="${onePerson.firstName}"/>
		                <c:out value="${onePerson.lastName}"/>
		            </form:option>
		        </c:forEach>
		    </form:select>
		    </p>  
		    <button>Submit</button>
		</form:form> 
	</main>
	<footer>
	
	</footer>
</body>
</html>