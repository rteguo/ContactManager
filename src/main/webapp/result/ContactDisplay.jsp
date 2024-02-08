<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact list</title>
</head>
<body>
<h2>Contact list</h2>
<div>
	<table border="1">
		<tr>
			<th>Contact ID</th>
			<th>First name</th>
			<th>Last name</th>
			<th>Email id</th>
			<th>Mobile number</th>
			<th>Address</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
	
		<tr>
			<td>${data.contactid}</td>
			<td>${data.firstname}</td>
			<td>${data.lastname}</td>
			<td>${data.emailid}</td>
			<td>${data.mobilenumber}</td>
			<td></td>
			<td><a href="updatecontact/${data.contactid}">Update</a></td>
			<td><a href="deletecontact/${data.contactid}">Delete</a></td>
		</tr>
		
	</table>
	<a href="addcontact" >Create new contact</a>
</div>
</body>
</html>