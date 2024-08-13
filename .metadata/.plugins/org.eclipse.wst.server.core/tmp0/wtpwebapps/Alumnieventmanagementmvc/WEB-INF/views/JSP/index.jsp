<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
<link href="<c:url value='/resources/CSS/style.css' />" rel="stylesheet"/>
<!-- Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>
<!-- Bootstrap JavaScript Bundle (with Popper.js) -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="<c:url value='/resources/JS/Login.js' />"></script>
</head>
<body>
    <form name="frm" action="validate" method="POST" onsubmit="return validateForm()">
        <center>
            <div class="wrapper">
                <h3>Login Form</h3>
                <div class="container">
                    <i class="fas fa-user"></i>
                    <input type="text" name="Username" placeholder="Enter Username"><br><br>
                    <i class="fas fa-lock"></i>
                    <input type="password" name="Password" placeholder="Enter Password"><br><br>
                    <input type="submit" name="log" value="Login"><br><br>
                </div>
                <div class="reference">
                    <strong>If you don't have an Account</strong><br><br>
                    <a href="reg">Register here</a>
                </div>
            </div>
        </center>
    </form>
</body>
</html>
