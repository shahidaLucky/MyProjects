<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Form Error -->

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>New Application Page</title>
<style type="text/css">
.errormsg {
	color: red;
}
</style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-12" style="background-color: lightgrey;">
				<h3>BNY Application Page</h3>

			</div>
		</div>
	</div>

	<!--------------------------- Nav Bar ---------------------------->
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<!-- Brand/logo -->
		<a class="navbar-brand" href="#">BNY</a>

		<!-- Links -->
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="#">Link 1</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Link 2</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Link 3</a></li>
		</ul>
	</nav>

	<!-- ----------------------End of Nav -------------------------------------------->

	<!-- ------------Form --------------------- -->
	<br>
	<br>
	<h2>${msg}</h2>
	<br>
	<div class="container">

	 <form:form action="/BNYMApplication/saveApplication" method="POST"
			modelAttribute="applicant">
			
			
			<div class="form-group">
				<label for="name">Applicant ID: </label>
				<form:input placeholder="Enter ID"
					class="form-control" id="id" path="id" />
				<label for="name">Applicant Name: </label>
				<form:input type="text" placeholder="Enter Name"
					class="form-control" id="name" path="sName" />
				<!-- Form Error -->
				<small> <form:errors path="sName" cssClass="errormsg" />
				</small>
			</div>
			<div class="form-group">
				<label for="course">Course :</label>
				<form:input type="text" id="course" class="form-control"
					path="sCourse" />
					<!-- Form Error -->
				<small> <form:errors path="sCourse" cssClass="errormsg" />
				</small>
					
			</div>
			<div class="form-group">
				<label for="mobile">Mobile :</label>
				<form:input type="text" id="mobile" class="form-control"
					path="sMobile" />
					<!-- Form Error -->
				<small> <form:errors path="sMobile" cssClass="errormsg" />
				</small>
			</div>
			<div class="form-group">
				<label for="dob">Date of birth :</label>
				<form:input type="Date" class="form-control" id="dob" path="sDOB" />
				<!-- Form Error -->
				<small> <form:errors path="sDOB" cssClass="errormsg" />
				</small>
			</div>

			<div class="form-group">
				<label for="skills">Skills :</label> <select multiple
					class="form-control" id="skill" name="sSkills">
					<option>Java</option>
					<option>SQL</option>
					<option>JavaScript</option>
					<option>HTML</option>
					<option>Spring MVC</option>
				</select>
			</div>
			<div><p><b>Address: </b></p></div>
			<div class="form-group">
				<label for="street">Street :</label>
				<form:input type="text" class="form-control" 
					path="sAddress.street" />
					<small> <form:errors path="sAddress.street" cssClass="errormsg" />
				</small>
			</div>
		
			<div class="form-group">
				<label for="city">City :</label>
				<form:input type="text" class="form-control" 
					path="sAddress.city" />
				<small> <form:errors path="sAddress.city" cssClass="errormsg" />
				</small>
			</div>
			<div class="form-group">
				<label for="state">State :</label>
				<form:input type="text" class="form-control" id="street" 
					path="sAddress.state" />
				<small> <form:errors path="sAddress.state" cssClass="errormsg" />
				</small>
			</div>
			<div class="form-group">
				<label for="zipcode">ZipCode :</label>
				<form:input type="text" class="form-control" id="zipcode"
					path="sAddress.zipcode" />
				<small> <form:errors path="sAddress.zipcode" cssClass="errormsg" />
				</small>
			</div>
			<button type="submit" class="btn btn-dark" name="submit">Apply</button>

		</form:form>

		
	</div>

</body>

</html>
