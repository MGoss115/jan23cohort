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
<title>Save Travels</title>
</head>
<body>
	<header>
	<h1>Save Travels</h1>
		<nav>
		
		</nav>
	</header>
	<main>
		<table style="width:75%">
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="t" items="${travels}">
				<tr>
					<td><a href="/travel/${t.id}"><c:out value="${t.name}"></c:out></a></td>
					<td><c:out value="${t.vendor}"></c:out></td>
					<td><c:out value="${t.amount}"></c:out></td>
					<td>
						<a href="/travels/${t.id}/edit">Edit</a>	
						<form action="/travel/${t.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button value="Delete">Delete</button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
		<h2>Add an Expense</h2>
		<form:form action="/travels" method="post" modelAttribute="travel">
		    <p>
		        <form:label path="name">Expense Name</form:label>
		        <form:errors path="name"/>
		        <form:input path="name"/>
		    </p>
		    <p>
		        <form:label path="vendor">Vendor</form:label>
		        <form:errors path="vendor"/>
		        <form:input path="vendor"/>
		    </p>
		    <p>
		        <form:label path="amount">Amount</form:label>
		        <form:errors path="amount"/>     
		        <form:input path="amount" min="0"/>
		    </p>    
		   	<p>
		        <form:label path="description">Description</form:label>
		        <form:errors path="description"/>     
		        <form:textarea type="text" path="description"/>
		    </p>    
		    <button>Submit</button>
		</form:form> 
	</main>
	<footer>
	
	</footer>
</body>
</html>