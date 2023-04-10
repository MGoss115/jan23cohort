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
<title>Joy Bundler</title>
</head>
<body style="margin:10vw;">
	<h1>Add a Name!</h1>
	<form:form action="/addPerson" method="post" modelAttribute="${ person }">
    		<section>
    			<label for="name">Name:</label>
    			<input type="text" name="name" id="" />
    			<form:errors path="name" class="text-danger" />
    		</section>
    		<section>
    			<label for="gender">Gender:</label>
    			<input type="text" name="gender" id="" />
    			<form:errors path="gender" class="text-danger" />
    		</section>
    		<section>
    			<label for="origin">Origin:</label>
    			<input type="text" name="origin" id="" />
    			<form:errors path="origin" class="text-danger" />
    		</section>
    		<section>
    			<label for="meaning">Meaning:</label>
    			<textarea name="meaning" id="" cols="30" rows="10"></textarea>
    			<form:errors path="meaning" class="text-danger" />
    		</section>
    		<section>
    		<input type="hidden" name="owner" value="${ user_id }" />
    		</section>
    		<button>Add Submit</button>
    	</form:form>

</body>
</html>