<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Convert Hours to Minutes</title>
</head>
<body>
<form action = "HourToMinutes" method = "post">
Convert hours to minutes
<input type = "hours" name = "userHours" seize= "10">
<input type = "submit" value = " Calculate to minutes"/>
</form>
<form action = "minutesToTimeServlet" method = "post">
Convert minutes to hours
<input type = "minutes" name = "userMinutes" seize= "10">
<input type = "submit" value = " Calculate to Time"/>
</form>
</body>
</html>