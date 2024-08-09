<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link href="<c:url value='/resources/CSS/register.css' />" rel="stylesheet"/>
</head>
<body>
<center>
	<form name = "frm" action = "save" method = "POST">
		<div class="box">
		<h3>Registration Form</h3>
		<div class="reg">
			<input type="text" name="Username" value="" placeholder="Enter the Username"><br><br>
			<input  type="password" name="Password" value="" placeholder="Enter the Password"><br></br>
			<input  type="email" name="Email" value="" placeholder="Enter the Email"><br></br>
			<input  type="contact" name="Contact" value="" placeholder="Enter the Contact"><br></br>
			<input  type="submit" name="reg" value="Register" placeholder= ""><br></br>
		</div>
		</div>
	</form>
</center>
</body>
</html>