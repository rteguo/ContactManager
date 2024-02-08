<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit contact</title>
</head>
<body>
	<div>
	<h2>Edit contact</h2>
		<form:form action="editcontactprocess" modelAttribute="data">
			<table>
				<tr>
					<td>First name</td>
					<td><form:input path="firstname" autocomplete="data.firstname"/></td>
				</tr>
				<tr>
					<td>Last name</td>
					<td><form:input path="lastname" autocomplete="data.lastname"/></td>
				</tr>
				<tr>
					<td>Email ID</td>
					<td><form:input path="emailid" autocomplete="data.emailid"/></td>
				</tr>
				<tr>
					<td>City</td>
					<td><form:input path="city" autocomplete="{data.city}"/></td>
				</tr>
				<tr>
					<td>Mobile Number</td>
					<td><form:input path="mobilenumber" autocomplete="{data.mobilenumber}"/></td>
				</tr>
				<tr>
					<td>Office Number</td>
					<td><form:input path="officenumber" autocomplete="{data.officenumber}"/></td>
				</tr>
<!-- 				<tr> -->
<!-- 					<td>Address</td> -->
<%-- 					<td><form:input path="addresscontact" autocomplete="{data.addresscontact.area"/></td> --%>
<!-- 				</tr> -->
				<tr>
					<td></td>
					<td><input type="submit" value="Validate" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>