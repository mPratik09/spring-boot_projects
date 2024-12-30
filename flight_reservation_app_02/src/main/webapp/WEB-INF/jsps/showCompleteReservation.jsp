<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Complete Reservation 02</title>
</head>
<body>
	<h2>Show Complete Reservation..</h2>

	<table border="2">
		<tr>
			<th>Operating Airlines:</th>
			<td>${flight.operatingAirlines}</td>
		</tr>
		<tr>
			<th>Departure City:</th>
			<td>${flight.departureCity}</td>
		</tr>
		<tr>
			<th>Arrival City:</th>
			<td>${flight.arrivalCity}</td>
		</tr>
		<tr>
			<th>Departure Date and Time:</th>
			<td>${flight.dateOfDeparture}</td>
		</tr>
	</table>

	<br />
	<br />
	<br />
	<br />

	<form action="confirmReservation" method="get">
		<table border="2">

			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td>Middle Name:</td>
				<td><input type="text" name="middleName"></td>
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
				<td>Phone:</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<input type="hidden" name="flightId" value="${flight.id}">
			<tr>
				<td colspan="2"><input type="submit" value="Save"></td>
			</tr>


			<!-- 	public String confirmReservation(@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("middleName") String middleName,
			@RequestParam("email") String email, @RequestParam("phone") String phone,
			@RequestParam("flightId") Long flightId, ModelMap modelMap) {
 -->

		</table>
	</form>

</body>
</html>