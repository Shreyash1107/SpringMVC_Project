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
<link href="<c:url value='/resources/CSS/home.css' />" rel="stylesheet" />
<script src="<c:url value='/resources/JS/home.js' />"></script>
<style type="text/css">
.mycls {
	background-color:  #c31432;/* fallback for old browsers */
	 background: -webkit-linear-(to right, #240b36, #c31432);
	background: linear-gradient(to right, #240b36, #c31432);
	overflow: hidden; 
}
</style>
</head>
<body>
	<div class="container-fluid mycls" style="background-color: red">
		<div class="row">
			<!-- Sidebar -->
			<div class="col-md-3 sidebar">
				<h4 class="text-center">Modules</h4>
				<div class="nav flex-column nav-pills menubar" id="v-pills-tab"
					role="tablist" aria-orientation="vertical">
					<a class="nav-link text-white mb-2" href="batch">Batch Master</a> <a
						class="nav-link text-white mb-2" href="alumni">Alumni Master</a> <a
						class="nav-link text-white mb-2" href="#">Event Master</a> <a
						class="nav-link text-white mb-2" href="#">Attendance Master</a> <a
						class="nav-link text-white mb-2" href="#">Feedback Master</a> <a
						class="nav-link text-white mb-2" href="#">Settings</a>
				</div>
			</div>
			<!-- Content Area -->
			<div class="col-md-9 content">
				<c:if test="${not empty msg}">
					<div class="alert alert-success">${msg}</div>
				</c:if>
				<div class="form-container shadow p-4 mb-5 rounded">
					<h5 class="text-center mb-4">Add Batch Details</h5>
					<form name='frm' id="frm" action='add' method='POST'
						onsubmit="validateName()">
						<div class="form-group">
							<input type="text" name="batchyear" id="txtBatch"
								class="form-control" placeholder="Enter Passout Year"
								onkeyup="validateBatch()" autocomplete="off"> <small
								id="s" class="form-text text-muted"></small>
						</div>
						<div class="form-group d-flex justify-content-center">
							<input type='submit' name='s' id="btn" value='Add New Batch'
								class="btn btn-primary px-5 py-2 font-weight-bold"
								style="margin-top: 20px" />
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
