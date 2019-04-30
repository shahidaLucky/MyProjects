<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>User Details</title>
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
				<h3>BNY All User Details</h3>
				<p>${msg}</p>
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
						<th>Email</th>
						<th>Password</th>
						<th>Action</th>

					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${user.id}</td>
						<td>${user.email}</td>
						<td>${user.password}</td>

						<td><a href="/BNYMApplication/edit?id=${user.id}">Edit</a>
							&nbsp;&nbsp;&nbsp; <a
							href="/BNYMApplication/delete?id=${user.id}">Delete</a></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

</body>

</html>
