<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Search Application</title>
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
				<h3>BNY Search Application Result</h3>
				<p>${msg}</p>
			</div>
		</div>
	</div>

	<!--------------------------- Nav Bar ---------------------------->
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<!-- Brand/logo -->
		<a class="navbar-brand" href="#">BNY</a>

		<!-- Links -->
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="#">Link 1</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Link 2</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Link 3</a></li>
		</ul>
		<form class="form-inline" method="get" action="search">
			<input class="form-control mr-sm-2" type="text"  name="keyword" 
				placeholder="Search Application">
			<button class="btn btn-success" type="submit">Search</button>
		</form>
	</nav>

	<!-- ----------------------End of Nav -------------------------------------------->

	<!--------------------------Table ----------------------------------- -->
	<br>
	<br>
	<div class="container">
		<h2>Applicant Details:</h2>

		<div class="table-responsive">

			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Applicant Name</th>
						<th>Course</th>
						<th>Mobile</th>
						<th>Date Of Birth</th>
						<th>Skills</th>
						<th>Street</th>
						<th>City</th>
						<th>State</th>
						<th>Zip Code</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${result}" var="applicant">
						<tr>
								<td>${applicant.id}</td>
								<td>${applicant.sName}</td>
								<td>${applicant.sCourse}</td>
								<td>${applicant.sMobile}</td>
								<td><fmt:formatDate value="${applicant.sDOB}"
										pattern="MM/dd/yyyy" /></td>
								<td>${applicant.sSkills}</td>
								<td>${applicant.sAddress.street}</td>
								<td>${applicant.sAddress.city}</td>
								<td>${applicant.sAddress.state}</td>
								<td>${applicant.sAddress.zipcode}</td>

						</tr>
		</c:forEach>
				</tbody>
			</table>
							<br>
			<div class="container">
			<tr>
			<td>
				<input type="submit" class="btn btn-dark" value="Save" /></td>
				</tr>
			</div>
		

			
		</div>
	</div>

</body>

</html>
