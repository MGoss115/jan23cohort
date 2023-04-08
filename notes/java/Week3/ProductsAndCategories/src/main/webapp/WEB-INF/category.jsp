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
<head>
<meta charset="UTF-8">
<title>Products and Categories</title>
</head>
<body>
	<h1><c:out value="${category.name}"/></h1>
	<nav>
		<a href="/">Home</a>
	</nav>
	<div class="container">
		<h2>Products:</h2>
		<section>
		<c:forEach var="p" items="${prod }">
		<ul>
			<li><c:out value="${p.name}"/></li>
		</ul>
		</c:forEach>
		</section>
		<section>
		<form action="/category/${category.id}" method="post">
			<p>
				<select name="productId" id="productId">
	   			 	<c:forEach var="p" items="${products}">
	    				<option value="${p.id}">${p.name}</option>
	    			</c:forEach>
				</select>
		    </p>  
		    <button>Add</button>
		</form> 
		</section>
	</div>

</body>
</html>