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
<head>
<!-- My CSS -->
<link rel='stylesheet' href='/css/style.css'>

<meta charset="UTF-8">
<title>Books Api</title>
</head>
<body>
	<header>
		<nav>
		
		</nav>
	</header>
	<main>
	<h1>New Book</h1>
		<form:form action="/books" method="post" modelAttribute="book">
		    <p>
		        <form:label path="title">Title</form:label>
		        <form:errors path="title"/>
		        <form:input path="title"/>
		    </p>
		    <p>
		        <form:label path="description">Description</form:label>
		        <form:errors path="description"/>
		        <form:textarea path="description"/>
		    </p>
		    <p>
		        <form:label path="language">Language</form:label>
		        <form:errors path="language"/>
		        <form:input path="language"/>
		    </p>
		    <p>
		        <form:label path="numberOfPages">Pages</form:label>
		        <form:errors path="numberOfPages"/>     
		        <form:input type="number" path="numberOfPages"/>
		    </p>    
		    <input type="submit" value="Submit"/>
		</form:form>  
	</main>
	<footer>
	
	</footer>
</body>
</html>