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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Burger Tracker</title>
</head>
<body style="margin:10vw;">
	<h1>Edit Burger</h1>
	<a href="/">Go Back</a>
	<form:form action="/burgers/${burger.id}" method="post" modelAttribute="burger">
		<input type="hidden" name="_method" value="put" />
		<p>
			<form:label path="name">Burger Name</form:label>
			<form:errors path="name" class="text-danger"/>
			<form:input path="name" style="width:250px;"/>
		</p>
		<p>
			<form:label path="restaurant">Restaurant Name</form:label>
			<form:errors path="restaurant" class="text-danger"/>
			<form:input path="restaurant" style="width:250px;"/>
		</p>
		<p>
			<form:label path="rating">Rating</form:label>
			<form:errors path="rating" class="text-danger"/>
			<form:input type="number" path="rating" min="1" max="5" style="width:250px;"/>
		</p>
		<p>
			<form:label path="note">Notes</form:label>
			<form:errors path="note" class="text-danger"/>
			<form:textarea type="text" path="note" rows="3" style="width:250px;"/>
		</p>
		<button>Submit</button>
	</form:form>

</body>
</html>