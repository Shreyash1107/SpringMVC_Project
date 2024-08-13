<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
    integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
    crossorigin="anonymous">
<script
    src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
    integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
    crossorigin="anonymous"></script>
<script
    src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
    crossorigin="anonymous"></script>
<link href="<c:url value='/resources/CSS/alumni.css' />"
    rel="stylesheet" />
<script src="<c:url value='/resources/JS/home.js' />"></script>
</head>
<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-3 sidebar">
                <h4 class="text-center">Modules</h4>
                <div class="nav flex-column nav-pills menubar" id="v-pills-tab"
                    role="tablist" aria-orientation="vertical">
                    <a class="nav-link text-white mb-2" href="batch">Batch Master</a> 
                    <a class="nav-link text-white mb-2" href="alumni">Alumni Master</a> 
                    <a class="nav-link text-white mb-2" href="#">Event Master</a> 
                    <a class="nav-link text-white mb-2" href="#">Attendance Master</a> 
                    <a class="nav-link text-white mb-2" href="#">Feedback Master</a> 
                    <a class="nav-link text-white mb-2" href="#">Settings</a>
                </div>
            </div>
            <div class="col-md-9 content">
                <nav class="navbar navbar-expand-lg navbar-light bg-light mb-4">
                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarNav" aria-controls="navbarNav"
                        aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse bg-dark" id="navbarNav">
                        <ul class="navbar-nav">
                            <li class="nav-item"><a class="nav-link text-white"
                                href="addalumni">Add Alumni</a></li>
                            <li class="nav-item"><a class="nav-link text-white"
                                href="viewalumni">View Alumni</a></li>
                            <li class="nav-item"><a class="nav-link text-white" href="#">Search Alumni</a></li>
                        </ul>
                    </div>
                </nav>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">Aid</th>
                            <th scope="col">Name</th>
                            <th scope="col">Email</th>
                            <th scope="col">Contact</th>
                            <th scope="col">Age</th>
                            <th scope="col">Company</th>
                            <th scope="col">Bid</th>
                            <th scope="col">Update</th>
                            <th scope="col">Delete</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="alumni" items="${a}">
                        <tr>
                            <td>${alumni.getaid()}</td>
                            <td>${alumni.getname()}</td>
                            <td>${alumni.getemail()}</td>
                            <td>${alumni.getcontact()}</td>
                            <td>${alumni.getage()}</td>
                            <td>${alumni.getCompany()}</td>
                            <td>${alumni.getBid()}</td>
                            <td><a href="">Update</a></td>
                            <td><a href="remove?aid=${alumni.getaid()}">Delete</a></td>
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
