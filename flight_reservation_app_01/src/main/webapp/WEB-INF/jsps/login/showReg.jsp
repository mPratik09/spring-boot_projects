

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	
	<div class="container">

		<form action="saveReg" method="post">
			<h2>New User Registration</h2>
			
			<div class="container-1">
				<input type="text" name="firstName" required>
				<label>First Name:</label>
			</div>
			
			<div class="container-1">
				<input type="text" name="lastName" required="required">
				<label>Last Name:</label>
			</div>
			
			<div class="container-1">
				<input type="text" name="email" required="required">
				<label>Email:</label>
			</div>
			
			<div class="container-1">
				<input type="password" name="password" required="required">
				<label>Password:</label>
			</div>
			
			<div class="container-1">
				<input type="password" name="reEnterPassword" required="required">
				<label>Re-Enter Password:</label>
			</div>
			
			<div class="logout-form">
				<form action="showReg" method="post">
					<input type="submit" value="Save" id="logout">
				</form>
			</div>
		</form>
		
	</div>

		<br/>	<br/>	<br/>
	
</body>
</html>








<%-- 
	
	<body>
		
			<form action="saveReg" method="post">
				<h2>New User Registration</h2>
				<table border="1">
					<tr>
						<td>First Name:</td>
						<td><input type="text" name="firstName"></td>
					</tr>
					<tr>
						<td>Last Name:</td>
						<td><input type="text" name="lastName"></td>
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
						<td>Re-Enter Password:</td>
						<td><input type="password" name="reEnterPassword"></td>
					</tr>
					<tr>
						<td colspan="2"><input type = "submit"	value= "Save"></td>
					</tr>
				</table>
			</form>
			<br/>	<br/>	<br/>
		
		 	${msg}
	 	
	</body>
	
 --%>



































