<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Header tag -->
<%@ include file="headertags.jsp"%>
<!-- injecting headertag -->

<title>Home Page</title>
<!-- My custom styles -->
<link href="./css/modules/customstyle.css" rel="stylesheet">
<style type="text/css">
.errormsg {
	color: red;
}
</style>
</head>

<body>
	<!-- Navbar -->
	<!-- Injecting navbar -->
	<%@ include file="navbar.jsp"%>
	<!-- end Navbar -->

	<!-- Start your project here-->
	<!-- ------------Form --------------------- -->

	<div>
		<br>
		<h2 style="text-align:center;">${msg}</h2>
		<div style="background-color: #dadada;" class="container">

			<form:form style="background-color: #dadada;" action="saveApplication"
				method="POST" modelAttribute="userProfile">

				<div class="form-group">
					<label for="name">Username: </label>
					<form:input type="text" placeholder="Enter Username"
						class="form-control" id="username" path="username" />
					<!-- Form Error -->
					<small> <form:errors path="username" cssClass="errormsg" />
					</small>
				</div>

				<div class="form-group">
					<label for="name">Password: </label>
					<form:input type="password" placeholder="Enter Password"
						class="form-control" id="password" path="password" />
					<!-- Form Error -->
					<small> <form:errors path="password" cssClass="errormsg" />
					</small>
				</div>


				<div class="form-group">
					<label for="name">Email: </label>
					<form:input type="email" placeholder="Enter Email"
						class="form-control" id="email" path="employee.email" />
					<!-- Form Error -->
					<small> <form:errors path="employee.email"
							cssClass="errormsg" />
					</small>
				</div>

				<div class="form-group">
					<label for="course">First Name :</label>
					<form:input type="text" id="name" class="form-control"
						path="employee.firstName" />
					<!-- Form Error -->
					<small> <form:errors path="employee.firstName"
							cssClass="errormsg" />
					</small>
				</div>

				<div class="form-group">
					<label for="course">Last Name :</label>
					<form:input type="text" id="name" class="form-control"
						path="employee.lastName" />
					<!-- Form Error -->
					<small> <form:errors path="employee.lastName"
							cssClass="errormsg" />
					</small>
				</div>

				<div class="form-group">
					<label for="mobile">Mobile :</label>
					<form:input type="text" id="mobile" class="form-control"
						path="employee.mobile" />
					<!-- Form Error -->
					<small> <form:errors path="employee.mobile"
							cssClass="errormsg" />
					</small>
				</div>

				<div>
					<p>
						<b>Address: </b>
					</p>
				</div>

				<div class="form-group">
					<label for="streetLine1">Street Line1 :</label>
					<form:input type="text" class="form-control"
						path="employee.address.streetLine1" />
					<small> <form:errors path="employee.address.streetLine1"
							cssClass="errormsg" />
					</small>
				</div>
				<div class="form-group">
					<label for="streetLine2">Street Line2 :</label>
					<form:input type="text" class="form-control"
						path="employee.address.streetLine2" />
					<small> <form:errors path="employee.address.streetLine2"
							cssClass="errormsg" />
					</small>
				</div>
				<div class="form-group">
					<label for="city">City :</label>
					<form:input type="text" class="form-control"
						path="employee.address.city" />
					<small> <form:errors path="employee.address.city"
							cssClass="errormsg" />
					</small>
				</div>

				<div class="form-group">
					<label for="state">State :</label>
					<form:input type="text" class="form-control" id="street"
						path="employee.address.state" />
					<small> <form:errors path="employee.address.state"
							cssClass="errormsg" />
					</small>
				</div>
				<div class="form-group">
					<label for="zipCode">ZipCode :</label>
					<form:input type="text" class="form-control" id="zipCode"
						path="employee.address.zipCode" />
					<small> <form:errors path="employee.address.zipCode"
							cssClass="errormsg" />
					</small>
				</div>

				<div class="form-group">
					<label for="designation">Designation :</label>
			
					<form:select path="employee.employeeJobBasic.designation"
						class="form-control">
						<option value="Developer">Developer</option>
						<option value="ProjectManager">Project Manager</option>
						<option value="SoftwareQA">Software QA</option>
							<option value="SDET">SDET</option>
						<option value="ScrumMaster">Scrum Master</option>
						<option value="ProgramManager">Program Manager</option>
					</form:select>

					<!-- Form Error -->
					<small> <form:errors
							path="employee.employeeJobBasic.designation" cssClass="errormsg" />
					</small>
				</div>
				<div class="form-group">
					<label for="inService">In Service :</label>
					<form:select path="employee.employeeJobBasic.inService"
						class="form-control">
						<form:option value="Yes" label="Yes" />
						<form:option value="No" label="NO" />
					</form:select>
				</div>

				<div class="form-group">
					<label for="dob">Join Date :</label>
					<form:input type="Date" class="form-control" id="joinDate"
						path="employee.employeeJobBasic.joinDate" />
					<!-- Form Error -->
					<small> <form:errors
							path="employee.employeeJobBasic.joinDate" cssClass="errormsg" />
					</small>
				</div>
				<br>

				<button type="submit" class="btn btn-success btn-block" name="submit">Register</button>
				<br/>
			</form:form>

		</div>
	</div>


	<!-- /Start your project here-->
	<!-- Footer -->
	<%@ include file="footer.jsp"%>
	<!-- injecting footer -->
</body>
</html>
