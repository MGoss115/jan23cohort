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
	<div class="book">
		<h1><c:out value="${b.title}"></c:out></h1>
		<h4>Description: <c:out value="${b.description}" ></c:out></h4>
		<h4>Language: <c:out value="${b.language}" ></c:out></h4>
		<h4>Number of Pages: <c:out value="${b.numberOfPages}" ></c:out></h4>
	</div>
	</main>
	<footer>
	
	</footer>
</body>
</html>