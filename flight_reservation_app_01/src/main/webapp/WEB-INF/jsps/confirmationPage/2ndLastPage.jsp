<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	
	
	<style type="text/css">
	
	
 	
	.container h2{
		margin: -20px 0 50px;
	}
	
		.container .container-1 input{
		padding: 0px 0;
	}
	
	.button-form {
		display: flex;
		flex-direction: row;
		margin-top: -10px;
	}
	
	
	
	
	</style>
	
	
</head>
<body>
<h2>2</h2>
	
	
	<div class="main-container">
		<div class="container">
	
			<table border="1" class="container-1">
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
			
		</div>
	
	
<!-- 	<br />	<br />	<br />	<br />			 -->

		<div class="container">
	
			<form action="towardsLastPage" method="post">
				<h2>Passenger Details</h2>
				
					<div class="container-1">
	<!-- 						<input type="text" name="from"> -->
						<input type="text" name="pFirstName" required>
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
						<label>Last Name:</label>
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
	
	
	
	
	
	
	
	
	
	
	