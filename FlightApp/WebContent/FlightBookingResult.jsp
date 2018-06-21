<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Details</title>
</head>
<body>
		<table>
		
		<tr>
		<td>Flight Name : ${flight.flightName}</td>
		</tr>
		<tr>
		<td>Source : ${flight.source}</td>
		</tr>
		<tr>
		<td>Destination : ${flight.destination}</td>
		</tr>
		<tr>
		<td>Fare : ${flight.fare}</td>
		</tr>
		<tr>
		<td>No. of seats : ${flight.noOfSeats}</td>
		</tr>
		<tr>
		<td>Aircraft Name : ${flight.aircraftName}</td>
		</tr>
		
		</table>
</body>
</html>