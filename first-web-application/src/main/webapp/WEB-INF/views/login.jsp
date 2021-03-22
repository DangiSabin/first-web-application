<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yahoo!!!!!!!! From JSP</title>
</head>
<body>
<form action="/spring-mvc/login" method="post">
<p><font color="red">${errorMessage}</font></p>
Enter your name <input type="text" name="name"/></br>
Password<input type="password" name="password"></br>
<input type="submit">
</form>

</body>
</html>