<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Available Flights 02</title>
</head>
<body>
	<h2>${msg}</h2>
	<table border="1">
		<tr>
			<th>Flight Id</th>
			<th>Airlines</th>
			<th>Departure City</th>
			<th>Arrival City</th>
			<th>Departure Time</th>
			<th>Select Flights</th>
		</tr>
		<c:forEach items="${findFlight}" var="findFlight">
			<tr>
				<td>${findFlight.id}</td>
				<td>${findFlight.operatingAirlines}</td>
				<td>${findFlight.departureCity}</td>
				<td>${findFlight.arrivalCity}</td>
				<td>${findFlight.estimatedDepartureTime}</td>
				
 				<td><a href="showCompleteReservation?flightId=${findFlight.id}">Select</a></td>
<%--				<td><a href="displayReservation?flightId=${findFlight.id}">Select</a></td>  --%>
			</tr>
		</c:forEach>
	</table>
</body>
</html>