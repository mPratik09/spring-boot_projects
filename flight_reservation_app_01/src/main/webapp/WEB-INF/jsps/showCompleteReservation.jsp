<%@page import="com.example.flight_reservation_app_01.entity.Reservation"%>
<%@page import="java.util.Optional"%>
<%@page import="com.example.flight_reservation_app_01.repositories.ReservationRepository"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Show Complete Reservation</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	
	<style type="text/css">
	
	.container {
		width: 800px;
		display: flex;
		justify-content: space-between;
	}
 	
 	.container h2{
		margin: -10px 0 50px;
	}
	
	.partition{
		border: 1px solid #fff;
	}
	
		/* 		PERFECT		 */
	
 	.container .container-1 .container-2, .container-3 {
		text-align: center;
		border-bottom: 1px solid #fff;
	 	color: #fff;
	}	
	
	.container-2 {
 		font-weight: bold; 	 	
	}	 
	
	 .container-3 {
		font-style: italic;
	} 

	 .container .container-1 .container-2, .container-3 {
		padding: 30px 0;
	} 
	
	.button-form {
		display: flex;
		flex-direction: row;
		margin-top: -10px;
	}
	
	</style>
	
</head>
<body>

	<div class="logout-form">
		<form action="logOutServlet" method="post">
			<input type="submit" value="Log Out" id="logout">
		</form>
	</div>
		
<%-- 	<%
		if(session.getAttribute("emailId")!=null) {
	%>	 --%>
		
	<div class="container">
 		<div> 
 			<h2>Flight Details</h2> 
					<table border="0" class="container-1">
  						<tr>
							<td class="container-2">Flight Number:</td>
 							<td class="container-3">${flight.flightNumber}</td>
						</tr>  

  						<tr>
							<td class="container-2">Flight Number:</td>
 							<td class="container-3">${flight.flightNumber}</td>
						</tr>  
						
						<tr>
							<td class="container-2">Operating Airlines:</td>
							<td class="container-3">${flight.operatingAirlines}</td>
						</tr>
						<tr>
							<td class="container-2">Departure City:</td>
							<td class="container-3">${flight.departureCity}</td>
						</tr>
						<tr>
							<td class="container-2">Arrival City:</td>
							<td class="container-3">${flight.arrivalCity}</td>
						</tr>
						<tr>
							<td class="container-2">Departure Date and Time:</td>
							<td class="container-3">${flight.estimatedDepartureTime}</td>
						</tr>
					</table>
					
 				</div> 
					
			<div class="partition"></div>
	
			<form action="confirmReservation" method="post" >
				<h2>Passenger Details</h2>
				
					<div class="container-1">
						<input type="text" name="p_first_name" required>
						<label>First Name:</label>
					</div>
				
					<div class="container-1">
						<input type="text" name="pLastName" required>
						<label>Last Name:</label>
					</div>
					
 					<div class="container-1">
						<input type="text" name="pMiddleName" required>
						<label>Middle Name:</label>
					</div>
					
					<div class="container-1">
						<input type="text" name="pEmail" required>
						<label>Email Id:</label>
					</div>
					
					<div class="container-1">
						<input type="text" name="pPhoneNum" required>
						<label>Contact Number:</label>
					</div>
	
					
					<input type="hidden" name="flightId" value="${flight.id}">
					
					<tr>
						<div class="button-form">
							<input type="submit" value="Save" id="submit">
						</div>
					</tr>
			</form>
		</div>
	</div>
	
<%-- 	
	<%
		}
	%>	
 --%>

</body>
</html>

	


<%-- 

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
	
 --%>
	
	
<%--

 		<form action="towardsLastPage" method="post">
		<table border="1">	
			<th colspan="2">Passenger Details</th>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="pFirstName"></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="pLastName"></td>
			</tr>
			<tr>
				<td>Middle Name:</td>
				<td><input type="text" name="pMiddleName"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="pEmail"></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input type="text" name="pPhoneNum"></td>
 			</tr>
			<input type="hidden" name="flightId" value="${flight.id}">
			<tr> 
				<td colspan="2"><input id="submit"  type="submit" value="Save"></td>
			</tr>
		</table>	

	</form>

--%>
	
	
	
	
	
	
	
	
	
	
	