<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring-MVC-Demo-App Home Page</title>
</head>
<body>

	<h2>Student Welcome Page</h2>
	<hr>
	<br>
	<!-- Model attribute mapped to the object and its fields and passed on to the view -->
	<h3>Hello ${student.firstName} ${student.lastName}</h3>
	<br>
	<h3>Nationality : ${student.country}</h3>
	<br>
	<h3>Favourite Language : ${student.favouriteProgrammingLanguage}</h3>
	<br>
	Operating Systems Familiar With :
	<ul>
		<c:forEach var="temp" items="${student.operatingSystem}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
</body>
</html>	