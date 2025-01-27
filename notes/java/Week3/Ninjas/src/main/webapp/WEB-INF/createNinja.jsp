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
	<h1>New Ninja</h1>
		<nav>
			<a href="/">Add Dojo</a>
		</nav>
	</header>
	<main>
<%-- 		<table style="width:75%">
			<tr>
				<th>Location Name</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
			<c:forEach var="n" items="${ninjas}">
				<tr>
					<td><c:out value="${n.dojo.location}"></c:out></td>
					<td><c:out value="${n.firstName}"></c:out></td>
					<td><c:out value="${n.lastName}"></c:out></td>
					<td><c:out value="${n.age}"></c:out></td>
					<td>
						<a href="#">Edit</a>	
						<form action="#" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button value="Delete">Delete</button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</table> --%>
		<h2>Add Ninja</h2>
		<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
			<p>
				<form:label path="dojo">Dojo:</form:label>
		        <form:select path="dojo">
		        <c:forEach var="d" items="${dojos}">
		            <!--- Each option VALUE is the id of the person --->
		            <form:option value="${d.id}" path="person">
		            <!--- This is what shows to the user as the option --->
		                <c:out value="${d.location}"/>
		            </form:option>
		        </c:forEach>
		    </form:select>
		    </p>  
		     <p>
		        <form:label path="firstName">First Name:</form:label>
		        <form:errors path="firstName"/>
		        <form:input path="firstName"/>
		    </p>
		    <p>
		        <form:label path="lastName">Last Name:</form:label>
		        <form:errors path="lastName"/>
		        <form:input path="lastName"/>
		    </p>
			<p>
		        <form:label path="age">Age:</form:label>
		        <form:errors path="age"/>
		        <form:input  path="age"/>
		    </p>  
		    <button>Submit</button>
		</form:form> 
	</main>
	<footer>
	
	</footer>
</body>
</html>