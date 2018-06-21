<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight App</title>
</head>
<body>
	<form method="post" action="FlightBook">
		<table>
		<tr>
		<td>Flight Name : <input type="text" name="flightName" /></td>
		</tr>
		<tr>
		<td>Source : <input type="text" name="flightSource" /></td>
		</tr>
		<tr>
		<td>Destination : <input type="text" name="flightDestination" /></td>
		</tr>
		<tr>
		<td>Fare : <input type="text" name="flightFare" /></td>
		</tr>
		<tr>
		<td>No. of seats : <input type="text" name="flightSeat" /></td>
		</tr>
		<tr>
		<td>Aircraft Name : <input type="text" name="flightAir" /></td>
		</tr>
		<tr>
		<td><input type="submit" value="Add" /></td>
		</tr>
		
		</table>
	</form>	

</body>
</html>