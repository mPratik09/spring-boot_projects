<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>	
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Details</title>
</head>
<body>
	
	<h2>1. Your ticket is confirmed..</h2>
	<table border="2">
		<tr>
			<th colspan="2">Confirmation Details</th>
		</tr>
		<tr>
			<td>Passenger's First Name:</td>
 			<td>${firstName}</td> 
		</tr>
		<tr>
			<td>Passenger's Last Name:</td>
			<td>${lastName}</td>
		</tr>
		<tr>
			<td>Passenger's Middle Name:</td>
			<td>${middleName}</td>
		</tr>
		<tr>
			<td>Passenger's Email:</td>
			<td>${email}</td>
		</tr>
		<tr>
			<td>Passenger's Phone Num:</td>
			<td>${phone}</td>
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