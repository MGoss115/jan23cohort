<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<h1>Fruit List</h1>

   	<table>
  <tr>
    <th>Name</th>
    <th>Price</th>
  </tr>
  <tr>
     <td class="col">
     	<c:forEach var="oneFruit" items="${fruitList}">
	       <c:out value="${oneFruit.name} ${oneFruit.price}"></c:out>
	    <br />
    	</c:forEach>
     </td>     	
  </tr>
</table>
</body>
</html>