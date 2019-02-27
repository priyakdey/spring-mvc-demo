<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <!-- Define the taglib to include the Spring MVC Form tags -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring-MVC-Demo-App Home Page</title>
</head>
<body>

	<h2>Student Registration Form</h2>
	<hr>
	<h3>Student Login Page</h3>
	<br>
	<!-- Model attribute should match the attribute Key we mapped in the controller -->
	<form:form action="processForm" modelAttribute="student">
	<!-- Spring MVC input tag -->
		First Name : <form:input path="firstName" />
		<br>
		Last Name : <form:input path="lastName" />
		<br><br>
		Country:
		<!-- Spring MVC Drop down select button -->
			<form:select path="country">
				<form:options items="${student.listOfCountries}"/>
			</form:select>
		<br><br>
		<!-- Spring MVC Radio Button -->
		<form:radiobuttons path="favouriteProgrammingLanguage" items="${student.listOfProgrammingLanguages}" />
		<br><br>
		<form:checkboxes path="operatingSystem" items="${student.operatingSystems}" />
		<br><br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>