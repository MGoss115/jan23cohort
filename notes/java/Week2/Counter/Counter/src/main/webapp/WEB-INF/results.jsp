<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Here's Your Omikuji!</h1>
	<main>
		<p>
			In <c:out value="${ num }" /> years, you will live in <c:out value="${ city }"/> with <c:out value="${ name }" /> as your roommate, selling <c:out value="${ hobby }" />. The next time you see a <c:out value="${ thing }" />, you will have good luck. Also, <c:out value="${ something }" />
		</p>
	</main>
</body>
</html>