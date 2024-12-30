<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Search Flights</title>
	<link rel="stylesheet" type="text/css" href="style.css">
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
			<h2>Search Flights</h2>
			
				<div class="container-1">
<!-- 				<input type="text" name="from"> -->
					<input type="text" name="from" required>
					<label>Departure From:</label>
				</div>
			
				<div class="container-1">
					<input type="text" name="to" required>
					<label>Arrival at:</label>
				</div>
				
				<div class="container-1">
					<input type="text" name="departureDate" required>
					<label>Date:</label>
				</div>
				
				<div class="button-form">
					<input type="submit" value="Search" id="submit">
				</div>
			
<!-- 					<tr>
						<div class="button-form">
							<input type="submit" value="Search" id="submit">
						</div>
					</tr>
-->
		</form>
	</div>
	
	<%-- 
	<%
		}
	%>
	 --%>
	
</body>
</html>				





				
<!-- 			FILE NAME:	searchFlights.jsp
				
	<form action="findFlights" method="post">
		<table border="1">
			<tr>
				<td>Departure From: </td>
				<td><input type = "text"	name="from"></td>
			</tr>
			<tr>
				<td>Arrival At: </td>
				<td><input type = "text"	name="to"></td>
			</tr>
			<tr>
				<td>Date: </td>
  				<td><input type = "text"	name="departureDate"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"	value="Search"></td>
			</tr>
		</table>
	</form>
	
-->



