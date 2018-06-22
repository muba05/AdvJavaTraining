<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Details</title>
</head>
<body>
	<form method="post" action="FlightBook">
	<p>Flight Details <input type="submit" value="Create New" />
	</p> 
	</form>
	<table border="2" bordercolor="red">
	<tr>
	<th>Flight Name : </th>
	<th>Source : </th>
	<th>Destination : </th>
	<th>Fare : </th>
	<th>No. of seats : </th>
	<th>Aircraft Name : </th>
	</tr>
	<c:forEach items="${flightList}" var = "flight"  >
		<tr>
		<td>${flight.flightName}</td>
		<td>${flight.source}</td>
		<td>${flight.destination}</td>
		<td>${flight.fare}</td>
		<td>${flight.noOfSeats}</td>
		<td>${flight.aircraftName}</td>
		</tr>
		
	</c:forEach>
	</table>
</body>
</html>