<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
</head>
<body>
<h2>User Login</h2>
<form:form action="loginprocess" modelAttribute="userobj">
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
			<td></td>
			<td><input type="submit" value="LogIn" />
		</tr>
	</table>
	<a href="UserRegister">Register if new user</a>
</form:form>
</body>
</html>