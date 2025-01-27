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
<title>Book Club</title>
</head>
<body>
<header>
		<h1>Add a Book to Your Shelf</h1>
		<nav>
			<c:if test="${ user_id != null }">
				<a href="/dashboard">Dashboard</a>
				<a href="/add">Add Book</a>
				<a href="/logout">Logout</a>
			</c:if>
			<c:if test="${ user_id == null }">
				<a href="/logReg">Login</a>
			</c:if>
		</nav>
	</header>
	<main>
		<h1>Welcome, <c:out value="${theUser.firstName}" /></h1>
		<a href="/logout"><button>Logout</button></a>
		<p>
			Books from everyone's shelves:
		</p>
		<table style="width:75%">
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author Name</th>
				<th>Posted By</th>
			</tr>
			<c:forEach var="b" items="${books}">
				<tr>
					<td><c:out value="${b.id}"></c:out></td>
					<td><a href="/book/${ b.id }"><c:out value="${b.title}"></c:out></a></td>
					<td><c:out value="${b.author}"></c:out></td>
					<td><c:out value="${b.owner.firstName}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</main>
</body>
</html>