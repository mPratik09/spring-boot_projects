<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check In 01</title>
</head>
<body>

	<table border="2">
		<tr>
			<td colspan="2">
				<h2 align="center">Checked In 01..</h2>
			</td>
		</tr>
		<tr>
			<td>Passenger Name:</td>
			<td> ${reservation.passenger.getpFirstName()}</td>
		</tr>
		<tr>
			<td>Operating Airlines: </td>
			<td> ${reservation.flight.getOperatingAirlines()}</td>
		</tr>
	
		<form action="finalConfirmation" method="post">			<!-- post	-->
	
			<tr>
				<td>Your Reservation Id:</td>
				<td><input type="text" name="id" value="${reservation.id}"
					readonly></td>
			</tr>
			<tr>
				<td>Num of Bags:</td>
				<td><input type="text" name="numOfBags"></td>
			</tr>
		<!-- 	<tr>
				<td>Checked In:</td>
				<td><input type="text" name="checkedIn"></td>
			</tr> -->
			<tr>
				<td colspan="2"><input type="submit" value="Save"></td>
			</tr>
		
		</form>
	</table>

</body>
</html>









