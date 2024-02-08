<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register page</title>
</head>
<body>
<h2>User Register</h2>
<form:form action="registerprocess" modelAttribute="userobj">
	<table>
		<tr>
			<td> User Name :</td>
			<td> <form:input path="username" /> </td>
		</tr>
		<tr>
			<td> Password :</td>
			<td> <form:password path="password" /> </td>
		</tr>
		<tr>
			<td> Email ID :</td>
			<td> <form:input path="emailid" /> </td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Register" />
		</tr>
	</table>
</form:form>
</body>
</html>