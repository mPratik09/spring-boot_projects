<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flights</title>
</head>
<body>
	
	<form action="findFlights" method="get">
		<table border="2">
			<tr>
				<td>Departure From:</td>
				<td><input type="text" name="from"></td>
			</tr>
			<tr>
				<td>Arrival At:</td>
				<td><input type="text" name="to"></td>
			</tr>
			<tr>
				<td>Date:</td>
				<td><input type="text" name="departureDate"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Search"></td>
			</tr>
		</table>
	</form>
</body>
</html>




