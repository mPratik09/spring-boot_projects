<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h2>New User Registration..</h2>
	<form action="saveReg" method="post">
		<table border="2">
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstname"></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastname"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="Submit" value="Save"></td>
			</tr>
		</table>
	</form>
	<br />
	<br />
	<br />
	<br />
	<br /> ${msg}
</body>
</html>