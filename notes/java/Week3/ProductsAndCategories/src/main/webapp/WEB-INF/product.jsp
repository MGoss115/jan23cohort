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
	<h1><c:out value="${product.name}"/></h1>
	<nav>
		<a href="/">Home</a>
	</nav>
	<div class="container">
		<h2>Categories:</h2>
		<section>
		<c:forEach var="c" items="${cat }">
		<ul>
			<li><c:out value="${c.name}"/></li>
		</ul>
		</c:forEach>
		</section>
		<section>
		<form:form action="/product/${product.id }" method="post" modelAttribute="products">
			<input type="hidden" name="_method" value="put">
			<p>
				<select name="categoryId" id="categoryId" class="input">
	   			 	<c:forEach var="c" items="${category}">
	    				<option value="${c.id}">${c.name}</option>
	    			</c:forEach>
				</select>
		    </p>  
		    <button>Submit</button>
		</form:form> 
		</section>
	</div>

</body>
</html>