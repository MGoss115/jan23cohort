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
	<h2>New Product</h2>
		<form:form action="/create" method="post" modelAttribute="product">
		    <p>
		        <form:label path="name">Name:</form:label>
		        <form:errors path="name"/>
		        <form:input path="name"/>
		    </p>
		   	<p>
		        <form:label path="description">Description:</form:label>
		        <form:errors path="description"/>     
		        <form:input path="description"/>
		    </p>   
		    <p>
		        <form:label path="price">Price:</form:label>
		        <form:errors path="price"/>     
		        <form:input path="price" min="0"/>
		    </p>    
		    <button>Submit</button>
		</form:form> 
	</main>
	<footer>
	
	</footer>
</body>
</html>