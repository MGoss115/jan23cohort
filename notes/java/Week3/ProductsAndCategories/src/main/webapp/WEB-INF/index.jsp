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
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css"> 
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<!-- My CSS -->
<link rel='stylesheet' href='/css/styles.css'>
<meta charset="UTF-8">
<title>Products and Categories</title>
</head>
<body>
	<header>
		<h1>Home Page</h1>
		<nav>
			<a href="/new">New Product</a>
			<a href="/newCat">New Category</a>
		</nav>
	</header>
	<main>
		<div class="container">
			<table style="width:75%">
			<tr>
				<th>Products</th>
				<th>Categories</th>
			<tr>
       		<td>
       			<ul>
		       		<c:forEach var="p" items="${products}">
		       			<li><a href="/product/${p.id }"><c:out value="${p.name}" ></c:out></a></li>
		       		</c:forEach>
		       	</ul>
       		</td>
       		<td>
       			<ul>
		       		<c:forEach var="c" items="${categories}">
		       			<li><a href="/category/${c.id }"><c:out value="${c.name}" ></c:out></a></li>
		       		</c:forEach>
		       	</ul>
       		</td>
       	</tr>
		
		</table>
		</div>
	</main>
	<footer>
	
	</footer>
</body>
</html>