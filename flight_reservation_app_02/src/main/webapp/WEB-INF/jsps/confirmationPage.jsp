<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reserved</title>
</head>
<body>
			

	<h2>Ticket Reserved..</h2>

	<table border="2">
		<tr>
			<td colspan="2" align="center"><h3>Passenger Details</h3></td>
		</tr>
		<tr>
			<td>1st Name:</td>
			<td>${firstName}</td>
		</tr>
		<tr>
			<td>Father's/Husband's Name:</td>
			<td>${middleName}</td>
		</tr>
		<tr>
			<td>Surname:</td>
			<td>${lastName}</td>
		</tr>
		<tr>
			<td>Email Id:</td>
			<td>${email}</td>
		</tr>
		<tr>
			<td>Contact Num:</td>
			<td>${phone}</td>
		</tr>
		<tr>
			<td colspan="2" align="right"><h3>Flight Details</h3></td>
		</tr>
		<tr>
			<td>Operating Airlines:</td>
			<td>${operatingAirlines}</td>
		</tr>
		<tr>
			<td>Departure City:</td>
			<td>${departureCity}</td>
		</tr>
		<tr>
			<td>Arrival City:</td>
			<td>${arrivalCity}</td>
		</tr>
		<tr>
			<td>Estimated Departure Time:</td>
			<td>${estimatedDepartureTime}</td>
		</tr>
	</table>

</body>
</html>