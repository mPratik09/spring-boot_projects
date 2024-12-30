<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User Registration..</title>
</head>
<body>
<h2>New Registration..</h2>
	<form action="saveReg" method="get">
		<table border="2">

			<tr>
				<td>First Name:</td>
				<td><input type="text" name="first_name"></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="last_name"></td>
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
				<td colspan="2"><input type="submit" value="Save"></td>
			</tr>
		</table>
		<br/>
		<br/>
		<br/>
		<br/>
		${msg}

		<!--  		firstName; lastName; email; password;	-->

	</form>
</body>
</html>