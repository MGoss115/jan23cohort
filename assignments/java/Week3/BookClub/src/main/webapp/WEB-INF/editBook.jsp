<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for forms -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!-- for validation -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<main>
	<form:form action="/books/${book.id}" method="post" modelAttribute="book">
		<input type="hidden" name="_method" value="put">
		    <p>
		        <form:label path="title">Title</form:label>
		        <form:errors path="title"/>
		        <form:input path="title" />
		    </p>
		    <p>
		        <form:label path="author">Author:</form:label>
		        <form:errors path="author"/>
		        <form:input path="author"/>
		    </p>   
		   	<p>
		        <form:label path="description">My Thoughts</form:label>
		        <form:errors path="description"/>     
		        <form:textarea type="text" path="description"/>
		    </p>
		    <section>
    			<input type="hidden" name="owner" value="${ user_id }" />
    		</section>   
		    <button>Update</button>
		</form:form> 
	</main>
	

</body>
</html>