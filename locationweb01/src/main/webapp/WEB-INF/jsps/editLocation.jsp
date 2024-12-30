<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying All Records..</title>
</head>

<body>
	<table border="1">
		<form action="updateLoc" method="post">
		
			<tr>
				<th>Id</th>
				<td><input type="text" name ="id" value="${id}" readonly="readonly"></td>
			</tr>
			
			<tr>
				<th>Code</th>
				<td><input type="text" name ="code" value="${code}"></td>
			</tr>
			
			<tr>
				<th>Name</th>
				<td><input type="text" name ="name" value="${name}"></td>
			</tr>
			
			<tr>
				<th>Type:</th>
				<td>Urban:<input type="radio" name="type" value="urban">
					Rural:<input type="radio" name="type" value="rural"></td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" value="Update">
				</td>
			</tr>
			
		</form>
	</table>
	
	<br/>	<br/>	<br/>	<br/>
	<a href="displayLocation">Show All Locations</a>
	
</body>
</html>