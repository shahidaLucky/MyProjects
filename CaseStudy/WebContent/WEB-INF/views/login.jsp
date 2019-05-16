<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home Page</title>
<!-- Header tag -->
<%@ include file="headertags.jsp"%>
<!-- injecting headertag -->
</head>
<body >
	<!-- Navbar -->
	<!-- Injecting navbar -->
	<%@ include file="navbar.jsp"%>

	<!-- main content of the page-->

	<div class="row">
		<div class="col">
			<img src="./images/book.jpg" alt="GlobalWell" width="600"
				height="600">
		</div>
		<div class="col">
			<h3>
				Know Your Affordable Tuition <br>Assistance Program
			</h3>
			<hr>
			<p>
			<li>Employees who are living in the United State of America.</li>
			<li>Employees who worked at Global Well for at least 1 year.</li>
			<li>Employees who scored ≥4.00 on their last yearly5+4.00000000000 performance
				appraisal</li>
			<li>The repayment interest rate for Global Well employees is
				2.99%</li>
			<li>In case of separation either by the Employee or by
				the Global Well prior to the projected repayment dateline, the
				employee has to repay the remaining balance on 15.99% interest rate</li><br>
			</p>
			<a href="seemore">see more...</a>
		</div>
		<div class="col">
		<div><h4>Welcome To Global Well !</h4></div>
		
		<div><h4>Interested In ATAP?</h4></div>
		<div><h5>Create your profile below</h5></div>
	<!-- 	<a href= "/CaseStudy/employeehome">Home Page After Employee Logged In</a> -->
			<form:form action="/CaseStudy/loginAction" class="login-form"
				method="POST">
				<h5 style="color: red">${registrationMsg}</h5>
				<h5 style="color: green">${doLogin}</h5>
				<h1>Login</h1>
				<div class="form-group">
					<label for="username">User Name</label> <input type="text"
						placeholder="Enter User Name" name="username" class="form-control"
						required>
				</div>
				<div>
					<label for="password">Password</label> <input type="password"
						placeholder="Enter Password" name="password" class="form-control"
						required>
				</div>
				<br/>
				<div>
					<button type="submit" class="btn btn-primary btn-block">Login</button>
				</div>
			</form:form>
			<br>
			<div class="reg-button-container">
				<a class="btn btn-info btn-block" href="employeeregistration">Create
					Profile</a>
			</div>
		</div>
	</div>
	</div>
	<br>
	<br>
	<!--/main content of the page-->

	<!-- Footer -->
	<%@ include file="footer.jsp"%>
	<!-- injecting footer -->
</body>
</html>
