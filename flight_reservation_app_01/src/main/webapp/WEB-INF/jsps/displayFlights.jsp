<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>List Of Available Flights</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	
	<style type="text/css">
		body {
			text-align: center;
		}
		.container-2 {
			padding: 10px;
		}
		
		h2{
			color:white;
		}
		
		.container .container-1 td{
			border-bottom: 1px solid #fff;
			color: #fff;
		}
		
/* 		.container .container-1 .container-2 {
		.container-1 .container-2 {
 */		.container .container-1 .container-2 {
			position: relative;
			width: 100%;
			padding: 10px 0;
			font-size: 16px;
			color: #fff;
			margin-bottom: 30px;
			border: none;
			border-bottom: 1px solid #fff;
			outline: none;
			background: transparent;
		}
				
		.container-3 {
			 font-style: italic;
		}
				
 		.partition {
			border: 5px solid #fff;
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
	%>	
	 --%>

	<div class="container">
		<form action="findFlights" method="post">
	
			<h2>List Of Flights</h2>	
			<table border="0" class="container-1">
				
				<c:forEach items="${findFlight}" var="findFlight">
					<tr>
						<td class="container-2">Flight Number</td>
						<td class="container-3">${findFlight.flightNumber}</td>
					</tr>
					<tr>
						<td class="container-2">Airlines</td>
						<td class="container-3">${findFlight.operatingAirlines}</td>
					</tr>
					<tr>
						<td class="container-2">Departure City</td>
						<td class="container-3">${findFlight.departureCity}</td>
					</tr>
					<tr>
						<td class="container-2">Arrival City</td>
						<td class="container-3">${findFlight.arrivalCity}</td>
					</tr>
					<tr>
						<td class="container-2">Departure Time</td>
						<td class="container-3">${findFlight.estimatedDepartureTime}</td>
					</tr>
					
					<tr>
						<td class="container-2">Select Flight</td>
						<div class="button-form">
							<td>	<a href="showCompleteReservation?flightId=${findFlight.id}" id="submit">Select</a>
							</td>
						</div>
					</tr>
					<tr>
						<td class="partition">	</td>
						<td class="partition">	</td>
					</tr>					
					
				</c:forEach>
			</table>
		</form>
	</div>
	
	<%-- 
	<%
		}
	%>	
	 --%>
	
</body>
</html>






<%-- 		
			<div class= "container">
			
				<h2>List Of Flights</h2>
					<div class="container-1">
						<label style="color: blue; font-weight: bold;">Flight Id</label>
						<label style="color: blue; font-weight: bold;">Airlines</label>
						<label style="color: blue; font-weight: bold;">Departure City</label>
						<label style="color: blue; font-weight: bold;">Arrival City</label>
						<label style="color: blue; font-weight: bold;">Departure Time</label>
						<label style="color: blue; font-weight: bold;">Select Flight</label>
					</div>
					<c:forEach items="${findFlight}" var="findFlight">
						<div class="container-1">
							<label>${findFlight.id}</label>
							<label>${findFlight.operatingAirlines}</label>
							<label>${findFlight.departureCity}</label>
							<label>${findFlight.arrivalCity}</label>
							<label>${findFlight.estimatedDepartureTime}</label>
							
							<div class="button-form">
								<a href="showCompleteReservation?flightId=${findFlight.id}" id="submit">Select</a>
		<!-- 						<input type="submit" value="login" id="submit"> -->
							</div>
		
							<td></td>
						</div>
					</c:forEach>
			</div>
			
			
--%>
	
	


<!-- 
			<th class="container-1">Airlines</th>
			<th class="container-1">Departure City</th>
			<th class="container-1">Arrival City</th>
			<th class="container-1">Departure Time</th>
			<th class="container-1">Select Flight</th>

-->



<%-- 
				<td>${findFlight.operatingAirlines}</td>
				<td>${findFlight.departureCity}</td>
				<td>${findFlight.arrivalCity}</td>
				<td>${findFlight.estimatedDepartureTime}</td>
				
				<td id="submit"><a href="showCompleteReservation?flightId=${findFlight.id}">Select</a></td>
				
--%>









