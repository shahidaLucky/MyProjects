<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Greetings</title>
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

	<!-- ------------Form --------------------- -->
	<br>
	<br>

	<h1>BNYM Greetings!</h1>
	<h2>${msg}</h2>

	<br>
	<div class="container">

		<!--<form action="/BNYMApplication/saveUser" method="POST">
					<div class="form-group">


						<button type="submit" class="btn btn-dark" name="submit">Submit</button>
						<input type="button" class="btn btn-dark"
							onclick="location.href= '${pageContext.request.contextPath}/registrationBoot'"
							value="Create New User" />
				</form> -->
		<!--<button type="submit" class="btn btn-dark" name="submit">Submit</button>-->
		<input type="button" class="btn btn-dark"
							onclick="location.href= '${pageContext.request.contextPath}/newapplication'"
							value="Apply" />
	</div>
</body>

</html>
