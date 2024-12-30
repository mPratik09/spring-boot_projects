<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Location</title>
</head>
<body>
	<h2>Add location details here 02..</h2>

	<form action="saveLoc" method="get">
		<table border="2">
			<tr>
				<td>Id:</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>Code:</td>
				<td><input type="text" name="code" /></td>
			</tr>
			<tr>
				<th>Name:</th>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Type:</td>
				<td>Urban <input type="radio" name="type" value="urban" />
					Rural <input type="radio" name="type" value="rural" />
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form>
	
	${msg}

	<br/>	<br/>	<br/>	<br/>	
	<a href="listLoc">Show All Locations</a>
	
</body>
</html>