<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		
	<label>Passenger's Name:</label>
	${reservation.passenger.getpFirstName()}
	${reservation.passenger.getpLastName() }
	<br/>
	<label>Operating Airlines:</label>
	${reservation.flight.getOperatingAirlines()}
	
	
	<form action="finalConfirmation" method="post">

		Number of Bags:<input type="text" name="numOfBags" />	
		<br/>		
		<input type="hidden" name="id" value="${reservation.id}" readonly="readonly"> 
		<br/>
			
		<input type="submit" value="Proceed">
	</form>
	
	<br>
	<br>
	<br>
	${not_yet} ${reservation.id} 
	${msg} ${reservation.id} 
	
	
	
</body>
</html>