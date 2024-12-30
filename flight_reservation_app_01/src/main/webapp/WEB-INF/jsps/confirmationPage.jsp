<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Ticket Details</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	
	<style type="text/css">
	
		.container {
	 		width: 500px;
		}
		
		.container-1 {
	 		font-weight: bold; 	 	
		}	 
		
		 .container-2 {
			font-style: italic;
		} 
		
		 .container-1, .container-2 {
			padding: 14px 10px;
			color: #fff;
			border-bottom: 1px solid #fff;
		} 
		
		td{
			text-align: center;
		}
		
	</style>
	
</head>
<body>

	<div class="logout-form">
		<form action="logout" method="post">
			<input type="submit" value="Log Out" id="logout">
		</form>
	</div>
		
<%--
 	<%
		if(session.getAttribute("emailId")!=null) {
	%>	 --%>
	
	<div class="container">
		<h2>Confirmation Details</h2>
		<table border="0">		

			<tr>
				<td class="container-1">Reservation Id:</td>
	 			<td class="container-2">${rId}</td> 
			</tr>
			
	<%-- 
			<tr>
				<td class="container-1">New Entry:</td>
	 			<td class="container-2">${abc}</td> 
			</tr>
	 --%>
	 		 
			<tr>
				<td class="container-1">Passenger's First Name:</td>
	 			<td class="container-2">${firstName}</td> 
			</tr>
			<tr>
				<td class="container-1">Passenger's Last Name:</td>
				<td class="container-2">${lastName}</td>
			</tr>
			<tr>
				<td class="container-1">Passenger's Middle Name:</td>
				<td class="container-2">${middleName}</td>
			</tr>
			<tr>
				<td class="container-1">Passenger's Email:</td>
				<td class="container-2">${email}</td>
			</tr>
			<tr>
				<td class="container-1">Passenger's Phone Num:</td>
				<td class="container-2">${phone}</td>
			</tr>
			<tr>
				<td class="container-1">Operating Airlines:</td>
				<td class="container-2">${operatingAirlines}</td>
			</tr>
			<tr>
				<td class="container-1">Departure City:</td>
				<td class="container-2">${departureCity}</td>
			</tr>
			<tr>
				<td class="container-1">Arrival City:</td>
				<td class="container-2">${arrivalCity}</td>
			</tr>
			<tr>
				<td class="container-1">Estimated Departure Time:</td>
				<td class="container-2">${estimatedDepartureTime}</td>
			</tr>
		</table>
	</div>
	
<%-- 
	<%
		}
	%>	
 --%>	

</body>
</html>