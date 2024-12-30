<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Complete Reservation</title>
</head>
<body>
<h2>1</h2>
	<table border="1">
		<tr>
			<th colspan="2">Flight Details</th>
		</tr>
		<tr>
			<td>Operating Airlines:</td>
			<td>${flight.operatingAirlines}</td>
		</tr>
		<tr>
			<td>Departure City:</td>
			<td>${flight.departureCity}</td>
		</tr>
		<tr>
			<td>Arrival City:</td>
			<td>${flight.arrivalCity}</td>
		</tr>
		<tr>
			<td>Departure Date and Time:</td>
			<td>${flight.estimatedDepartureTime}</td>
		</tr>
	</table>
	<br />	<br />	<br />	<br />
	
<!-- 		<form action="confirmReservation"	method="post"> -->
	<form action="confirmReservation" method="get">
		<table border="1">	
			<th colspan="2">Passenger Details</th>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td>Middle Name:</td>
				<td><input type="text" name="middleName"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<input type="hidden" name="flightId" value="${flight.id}">
			<tr>
				<td colspan="2"><input type="submit" value="Save"></td>
			</tr>
		</table>	
		</form>


</body>
</html>


