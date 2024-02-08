<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add new contact</title>
</head>
<body>
	<div>
		<form:form action="addcontactprocess" modelAttribute="contobj">
			<table>
				<tr>
					<td>First name</td>
					<td><form:input path="firstname"/></td>
				</tr>
				<tr>
					<td>Last name</td>
					<td><form:input path="lastname"/></td>
				</tr>
				<tr>
					<td>Email ID</td>
					<td><form:input path="emailid"/></td>
				</tr>
				<tr>
					<td>City</td>
					<td><form:input path="city"/></td>
				</tr>
				<tr>
					<td>Mobile Number</td>
					<td><form:input path="mobilenumber"/></td>
				</tr>
				<tr>
					<td>Office Number</td>
					<td><form:input path="officenumber"/></td>
				</tr>
				<tr>
					<td>address</td>
					<td><form:input path="addresscontact"/></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Validate" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>