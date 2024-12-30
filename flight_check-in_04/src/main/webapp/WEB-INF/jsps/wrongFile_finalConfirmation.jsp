<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Final Confirmation</title>
</head>
<body>
	
	<label>Passenger's Name:</label>
	${reservation.passenger.getpFirstName() }
	${reservation.passenger.getpLastName() }
	
	<label>Operating Airlines:</label>
	${reservation.flight.getOperatingAirlines}
	
	<form action="finalConfirmation" method="post">
 		<input type="hidden" name="id" value="${reservation.id}"> 

		Number of Bags:<input type="text" name="numOfBags" />	<br/>		
		Checked In Status:<input type="text" name="status"/>	<br/>
		<input type="submit" value="Proceed">
	</form>
	
		<br/>
	<br/>
	<br/>
	
	${msg} ${reservation.id} 
	
		
</body>
</html>