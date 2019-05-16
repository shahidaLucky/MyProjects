<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Registration Page</title>
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
	</nav>

	<!-- ----------------------End of Nav -------------------------------------------->
	
	<!-- ------------Form --------------------- -->
	<br><br>
	<h4>${msg}<h4>
	<br>
	<div class="container">
		
		<form action="/BNYMApplication/newUser" method="POST">
			<div class="form-group">
				<label for="email">Email: *</label> <input type="email"
					class="form-control" id="email" placeholder="Enter email"
					name="email">
			</div>
			<div class="form-group">
				<label for="pwd">Password: *</label> <input type="password"
					class="form-control" id="pwd" placeholder="Enter password"
					name="password">
			</div>
			<div class="form-group">
				<label for="pwd">Confirm Password: *</label> <input type="password"
					class="form-control" id="pwd" placeholder="Re-Enter password"
					name="confirmPassword">
			</div>
			<div class="form-group form-check">
				<label class="form-check-label"> <input
					class="form-check-input" type="checkbox" name="remember">
					Remember me
				</label>
			</div>
			<button type="submit" class="btn btn-dark" name="submit">Submit</button>

		</form>
	</div>


</body>

</html>
