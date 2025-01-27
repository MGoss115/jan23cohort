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
<!-- My CSS -->
<link rel='stylesheet' href='/css/style.css'>

<meta charset="UTF-8">
<title>Books Api</title>
</head>
<body>
	<header>
		<h1>Books API</h1>
		<nav>
		
		</nav>
	</header>
	<main>
		<h1>All Books</h1>
		<div class="container">
			<table style="width:90%">
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>Language</th>
					<th># Pages</th>
				</tr>
					<c:forEach var="book" items="${books}">
				<tr>
					<td><c:out value="${book.id}"></c:out></td>
					<td><a href="/books/${book.id}"><c:out value="${book.title}"></c:out></a></td>
					<td><c:out value="${book.language}"></c:out></td>
					<td><c:out value="${book.numberOfPages}"></c:out></td>
					<td><a href="/books/${book.id}/edit"><button>Edit</button></a></td>
					<td>	
						<form action="/books/${book.id}" method="post">
					    <input type="hidden" name="_method" value="delete">
					    <button value="Delete">Delete</button>
					    </form>
					</td>
				</tr>
					</c:forEach>
			</table>
		</div>
	</main>
	<footer>
	
	</footer>
</body>
</html>