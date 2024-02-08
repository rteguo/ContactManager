<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit an address</title>
</head>
<body>
	<div>
	<h2>Edit an address</h2>
		<form:form action="editaddressprocess" modelAttribute="data">
			<table>
				<tr>
					<td>Blok/Flat number</td>
					<td><form:input path="block" autocomplete="{data.block}"/></td>
				</tr>
				<tr>
					<td>Area</td>
					<td><form:input path="area" autocomplete="{data.area}"/></td>
				</tr>
				<tr>
					<td>City</td>
					<td><form:input path="city" autocomplete="{data.city}"/></td>
				</tr>
				<tr>
					<td>Zipcode</td>
					<td><form:input path="zipcode" autocomplete="data.zipcode"/></td>
				</tr>
<!-- 				<tr> -->
<!-- 					<td></td> -->
<%-- 					<td><form:hidden path="useraddress" value="1"/></td> --%>
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