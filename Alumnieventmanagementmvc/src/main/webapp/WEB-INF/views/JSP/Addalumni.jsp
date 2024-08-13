<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, org.alumni.service.*, org.alumni.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Alumni</title>
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
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse bg-dark" id="navbarNav">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link text-white" href="addalumni">Add Alumni</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="viewalumni">View Alumni</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="#">Search Alumni</a>
                            </li>
                        </ul>
                    </div>
                </nav>
				<form name="frm" action="success" method="POST">
					<div class="form-group">
						<label for="exampleInputname">Name</label> 
						<input type="text"
							class="form-control" id="exampleInputname" name="name"
							aria-describedby="username" placeholder="Enter Name">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label> 
						<input type="email" class="form-control" id="exampleInputEmail1"
							name="email" aria-describedby="emailHelp"
							placeholder="Enter email"> 
						<small id="emailHelp"
							class="form-text text-muted">We'll never share your email
							with anyone else.</small>
					</div>
					<div class="form-group">
						<label for="exampleInputcontact">Contact</label> 
						<input type="contact" class="form-control" id="exampleInputcontact"
							name="contact" aria-describedby="contactHelp"
							placeholder="Contact"> 
						<small id="contactHelp"
							class="form-text text-muted">We'll never share your
							contact with anyone else.</small>
					</div>
					<div class="form-group">
						<label for="exampleInputage">Age</label> 
						<input type="number"
							class="form-control" id="exampleInputage" name="age"
							aria-describedby="username" placeholder="Age">
					</div>
					<div class="form-group">
						<label for="exampleInputcompname">Company</label> 
						<input type="text" class="form-control" id="exampleInputcompname"
							name="comp" aria-describedby="exampleInputcompname"
							placeholder="Company Name">
					</div>
					<div class="form-group mt-3">
						<label for="batchSelect">Select Batch ID</label> 
						<select class="form-control" id="batchSelect" name="bid">
							<option value="">Select ID</option>
							<c:forEach var="batch" items="${c}">
								<option value="${batch.getbid()}">${batch.getbid()}</option>
							</c:forEach>
						</select>
					</div>
					<div class="form-group d-flex justify-content-center">
						<input type='submit' name='s' id="btn" value='Add New Alumni'
							class="btn btn-dark px-5 py-2 font-weight-bold"
							style="margin-top: 20px" />
					</div>
					<c:if test="${not empty msg}">
					    <div class="alert alert-success">
					        ${msg}
					    </div>
					</c:if>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
