<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Location</title>
</head>
<body>
	<h2>Add Location Details Here 01..</h2>

	<form action="saveLoc" method="get">
		<table border="1">
			<tr>
				<th>Id:</th>
				<th><input type="text" name="id"></th>
			</tr>
			<tr>
				<th>Code:</th>
				<th><input type="text" name="code"></th>
			</tr>
			<tr>
				<th>Name:</th>
				<th><input type="text" name="name"></th>
			</tr>
			<tr>
				<th>Type:</th>
				<td>Urban:<input type="radio" name="type" value="urban">
					Rural:<input type="radio" name="type" value="rural"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
<!-- 				<td colspan="2"><input type="submit" value="Save" /></td> -->
			</tr>
		</table>
	</form>
	
	${msg}
	<br/>	<br/>	<br/>	<br/>
	<a href="listLoc">Show All Locations</a>

</body>
</html>