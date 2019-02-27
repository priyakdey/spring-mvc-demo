<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Demo</title>
	<style type="text/css">
		.error {color: red}
	</style>
</head>
<body>
	<h1>Spring MVC Demo App - Customer Login Page</h1>
	<hr>
	<h3>Login Form</h3>
	
	
	<form:form action="processForm" modelAttribute="customer">
		First Name : <form:input path="firstName" />
			<br>
		Last Name* : <form:input path="lastName" />
		<!-- In the event of error, display the message -->
			<form:errors path="lastName" cssClass="error" />
			<br><br>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>