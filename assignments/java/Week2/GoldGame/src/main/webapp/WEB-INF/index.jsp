<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<p>
		Your Gold: <c:out value="${count}" />
	</p>
	<form action="/" method="post">
		<label for="farm" name="farm">Farm</label>
		<input type="hidden" name="farm"/>
		<h4>(earns 10-20 gold)</h4>
		<button>Find Gold!</button>
	</form>
	<br />
	<form action="/cave" method="post">
		<label for="cave" name="cave">Cave</label>
		<input type="hidden" name="cave"/>
		<h4>(earns 5-10 gold)</h4>
		<button>Find Gold!</button>
	</form>
	<br />
	<form action="/house" method="post">
		<label for="house" name="house">House</label>
		<input type="hidden" name="house"/>
		<h4>(earns 2-5 gold)</h4>
		<button>Find Gold!</button>
	</form>
	<br />
	<form action="/quest" method="post">
		<label for="quest" name="quest">Quest</label>
		<input type="hidden" name="quest"/>
		<h4>(earns/takes 0-50 gold)</h4>
		<button>Find Gold!</button>
	</form>
	<section>
		<h3>Activities:</h3>
		<textarea name="output" id="" cols="30" rows="10">
			<c:out value="${output}" /> ---> <%= new Date() %>
		</textarea>
	</section>
</body>
</html>