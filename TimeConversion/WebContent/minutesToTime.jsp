<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Minutes to hour and seconds</title>
</head>
<body>
<p>${userTime.getMinutes()} Minutes turns into: <br />
${userTime.getHours()} hours <br />
${userTime.getNewMinutes()} minutes that is <br />
${userTime.getSeconds()} seconds <br />

</p>
<a href="index.jsp">Select a new time conversion</a>
</body>
</html>