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
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" type="text/css" href="/css/style.css">
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Full Stack Lecture</title>
</head>
<body>
	<header>
		<nav>
			<c:if test="${ user_id != null }">
				<a href="/dashboard">Dashboard</a>
				<a href="/add">Add Book</a>
				<a href="/logout">Logout</a>
			</c:if>
			<c:if test="${ user_id == null }">
				<a href="/">Login</a>
			</c:if>
		</nav>
	</header>
    <main>
    	<h1><c:out value="${oneBook.title}" /></h1>
    	<h3>
    	<c:out value="${oneBook.owner.firstName}" /> read <c:out value="${oneBook.title}" /> by 
    	<c:out value="${oneBook.author}" /></h3>
    	<h3>Here are <c:out value="${oneBook.owner.firstName}" /> thoughts: <c:out value="${oneBook.description}" /></h3>
    	<c:if test="${ user_id == oneBook.owner.id }">
    		<a href="/books/${oneBook.id}/edit">Edit Info</a>
    		<form action="/book/${oneBook.id}" method="post">
			<input type="hidden" name="_method" value="delete"/>
			<button value="Delete">Delete</button>
		</form>
    	</c:if>
    </main>
    <footer>
    
    </footer>
</body>
</html>