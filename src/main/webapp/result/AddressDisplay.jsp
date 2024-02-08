<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Address list</title>
</head>
<body>
<h2>Address list</h2>
<div>
	<table border="1">
		<tr>
			<th>Address ID</th>
			<th>Block / Flat number</th>
			<th>Area</th>
			<th>City</th>
			<th>Zipcode</th>
			<th>Username</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
	
		<tr>
			<td>${data.adressid}</td>
			<td>${data.block}</td>
			<td>${data.area}</td>
			<td>${data.city}</td>
			<td>${data.zipcode}</td>
			<td>${data.useraddress.username}</td>
			<td><a href="updateaddress/${data.adressid}">Update</a></td>
			<td><a href="deleteaddress/${data.adressid}">Delete</a></td>
		</tr>
	</table>
	<a href="addaddress" >Create new address</a>
</div>
</body>
</html>