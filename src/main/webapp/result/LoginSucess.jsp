<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome ${userobj.username }</h3>
<a href="logoutprocess" >Logout</a>
<div id="menu">
	<h3>Login success</h3>
	<ol>
		<li>Contact management
			<ol>
				<li><a href="addcontact" >Create new contact</a></li>
				<li><a href="displaycontact" >View contacts</a></li>
				<li><a href="updatecontact" >Update a contact</a></li>
				<li><a href="deletecontact" >Delete a contact</a></li>
			</ol>
		</li>
		<li>Address management
			<ol>
				<li><a href="addaddress" >Create new address</a></li>
				<li><a href="displayaddress" >View address</a></li>
				<li><a href="updateaddress" >Update address</a></li>
			</ol>
		</li>
		
	</ol>
</div>

</body>
</html>