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
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css"> 
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<!-- My CSS -->
<link rel="stylesheet" type="text/css" href="/css/styles.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia">
<meta charset="UTF-8">
<title>Our Family Pets</title>
</head>
<body>
	<header>
		<nav>
		
		</nav>
	</header>
	<main class="container">
		<section class="register">
			<h1>Register</h1>
				<form:form action="/register" method="post" modelAttribute="newUser">
					<p>
				        <form:label path="firstName">First Name:</form:label>
				        <form:errors path="firstName"/>
				        <form:input path="firstName"/>
				    </p>
				    <p>
				        <form:label path="lastName">Last Name:</form:label>
				        <form:errors path="lastName"/>
				        <form:input path="lastName"/>
				    </p>
				    <p>
				        <form:label path="userName">User Name:</form:label>
				        <form:errors path="userName"/>
				        <form:input path="userName"/>
				    </p>
				    <p>
				        <form:label path="email">Email:</form:label>
				        <form:errors path="email"/>
				        <form:input path="email"/>
				    </p>
				    <p>
				        <form:label path="password">Password:</form:label>
				        <form:errors path="password"/>     
				        <form:input type="password" path="password" min="0"/>
				    </p>    
				   	<p>
				        <form:label path="confirm">Confirm Password:</form:label>
				        <form:errors path="confirm"/>     
				        <form:input type="password"
				        path="confirm" min="0"/>
				    </p>    
				    <button>Submit</button>
				</form:form> 	
		</section>
		<section class="login">
			<h1>Login</h1>
				<form:form action="/login" method="post" modelAttribute="newLogin">
				    <p>
				        <form:label path="email">Email:</form:label>
				        <form:errors path="email"/>
				        <form:input path="email"/>
				    </p>
				    <p>
				        <form:label path="password">Password:</form:label>
				        <form:errors path="password"/>     
				        <form:input type="password" path="password" min="0"/>
				    </p>    
				    <button>Submit</button>
			</form:form> 	
		</section>
	</main>
	<footer>
	
	</footer>
</body>
</html>