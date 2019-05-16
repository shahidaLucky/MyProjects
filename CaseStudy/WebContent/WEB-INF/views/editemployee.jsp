<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Header tag -->
<%@ include file="headertags.jsp"%>
<!-- injecting headertag -->

<title>Edit Page</title>

</head>

<body>
	<!-- Navbar -->
	<!-- Injecting navbar -->
	<%@ include file="navbar.jsp"%>


	<!-- Start your project here-->
	<br>
	<br>
	<div class="container">
		<h2>Applicant Details:</h2>

		<div class="table-responsive">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Email</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Mobile</th>
						<th>City</th>
						<th>State</th>
						<th>Street line1</th>
						<th>Street line2</th>
						<th>Zip Code</th>
						<th>Designation</th>
						<th>In Service</th>
						<th>Join Date</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<form:form action="editEmployee" method="post"
						modelAttribute="applicationForm">
						<tr>
							<td><form:hidden path="id" /></td>
							<td><form:input path="email" /></td>
							<td><form:input path="firstName" /></td>
							<td><form:input path="lastName" /></td>
							<td><form:input path="mobile" /></td>
							<td><form:input path="address.city" /></td>
							<td><form:input path="address.state" /></td>
							<td><form:input path="address.streetLine1" /></td>
							<td><form:input path="address.streetLine2" /></td>
							<td><form:input path="address.zipCode" /></td>
							<td><form:input path="employeeJobBasic.designation" /></td>
							<td><form:input path="employeeJobBasic.inService" /></td>
							<td><form:input path="employeeJobBasic.joinDate" /></td>
						</tr>
						<tr>
							<td><input class="btn btn-dark" type="submit" value="Save"></td></tr>
					</form:form>
				</tbody>
			</table>
		

			<!-- /Start your project here-->


			<!-- Footer -->
			<%@ include file="footer.jsp"%>
			<!-- injecting footer -->
		</div>
	</div>
</body>

</html>
