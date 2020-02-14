<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hour Time</title>
</head>
<body>
<p>${hoursToMinutes.getHours()} hours contains the following: <br />
${hoursToMinutes.getMinutes()} Minutes <br />
</p>
<a href="index.jsp">Select a new time conversion</a>
</body>
</html>