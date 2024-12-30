<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Check In.. 01</title>
</head>
<body>
	<table border="2">
		<form action="startCheckIn" method="post">			<!-- GET GET GET	 -->  
		<tr>
			<td>Enter Your Reservation Id:</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="Submit" value="Proceed"></td>
		</tr>
		</form>
	</table>
	
	<br><br><br><br>
	${reservation.id}<br><br><br>
	${reservation}
</body>
</html>