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
<title>Products and Categories</title>
</head>
<body>
	<main class="container">
	<h2>New Category</h2>
		<form:form action="/createCat" method="post" modelAttribute="category">
		    <p>
		        <form:label path="name">Name:</form:label>
		        <form:errors path="name"/>
		        <form:input path="name"/>
		    </p>   
		    <button>Submit</button>
		</form:form> 
	</main>
	<footer>
	
	</footer>
</body>
</html>