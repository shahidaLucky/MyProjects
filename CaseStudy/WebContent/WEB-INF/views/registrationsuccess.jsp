<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
<!-- Header tag -->
<%@ include file="headertags.jsp"%>
<!-- injecting headertag -->

<title>Home Page</title>

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
					<tr>
						<td>${employee.email}</td>
						<td>${employee.firstName}</td>
						<td>${employee.lastName}</td>
						<td>${employee.mobile}</td>
						<td>${employee.address.city}</td>
						<td>${employee.address.state}</td>
						<td>${employee.address.streetLine1}</td>
						<td>${employee.address.streetLine2}</td>
						<td>${employee.address.zipCode}</td>
						<td>${employee.employeeJobBasic.designation}</td>
						<td>${employee.employeeJobBasic.inService}</td>
						<td><fmt:formatDate value="${employeeJobBasic.joinDate}"
								pattern="MM/dd/yyyy" /></td>
						<td><a href="/CaseStudy/edit?id=${employee.id}">Edit</a>
							&nbsp;&nbsp;&nbsp; <a href="/CaseStudy/delete?id=${employee.id}">Delete</a>
						</td>
					</tr>
				</tbody>
			</table>
			<input type="button" class="btn btn-dark"
				onclick="location.href= '${pageContext.request.contextPath}/newapplication'"
				value="Add Another Application" />
		</div>
	</div>


	<!-- /Start your project here-->


	<!-- Footer -->
	<%@ include file="footer.jsp"%>
	<!-- injecting footer -->


</body>

</html>
