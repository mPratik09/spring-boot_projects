<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr>
			<td colspan="2">Checked In 03..</td>
		</tr>
		<tr>
			<td>Passenger name:</td>
			<td>${reservation.passenger.getpFirstName() }</td>
		</tr>
		<tr>
			<td>Operating Airlines:</td>
			<td>${reservation.flight.getOperatingAirlines()}</td>
		</tr>
		<br/><br/>
		<form action="finalConfirmation" method="post">
			<tr>
				<td>Entered Reservation Id:</td>
				<td><input type="text" name="id" value="${reservation.id}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>Number Of Bags:</td>
				<td><input type="text" name="numOfBags"></td>
			</tr>
<!--			<tr> 
				<td>Checked In Status:</td>
				<td><input type="text" name="checkedIn"></td>
			</tr> 	
-->
			<tr>
				<td colspan="2"><input type="submit" value="Update 03"></td>
			</tr>
		</form>
	</table>
	<br/>	<br/>	<br/>	<br/>	<br/>
		${msg}
		${reservationId.id}
</body>
</html>