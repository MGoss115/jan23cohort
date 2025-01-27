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
<title>Save Travels</title>
</head>
<body>
	<header>
		<h1>Expense Details</h1>
	</header>
	<main>
		<a href="/">Go Back</a>
	<div>
		<h3>Expense Name: <c:out value="${travel.name}"></c:out></h3>
		<h3>Expense Description: <c:out value="${travel.description}"></c:out></h3>
		<h3>Vendor: <c:out value="${travel.vendor}" ></c:out></h3>
		<h3>Amount Spent: $<c:out value="${travel.amount}"></c:out> </h3>
	</div>
	</main>
	<footer>
	
	</footer>
</body>
</html>