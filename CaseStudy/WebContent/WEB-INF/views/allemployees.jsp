<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="en">

<head>

<!-- Header tag -->
<%@ include file="headertags.jsp"%>
<!-- injecting headertag -->
<!-- <style>
th {
	font-size: 50px;
	color: red;
}
</style> -->
<style>
table {
	border-collapse: collapse;
	border-spacing: 0;
	width: 100%;
	border: 1px solid #ddd;
}

th, td {
	text-align: left;
	padding: 16px;
}

tr:nth-child(even) {
	background-color: #f2f2f2
}
</style>
<title>All Employee Page</title>

</head>

<body>
	<!-- Navbar -->
	<!-- Injecting navbar -->
	<%@ include file="navbar.jsp"%>


	<!-- Start your project here-->
	<!--------------------------Table ----------------------------------- -->
	<br>
	<br>
	<security:authorize access="hasRole('ROLE_USER')">
	<h5 style="color: red">Not authorized to view this page!</h5>
	</security:authorize>
	<security:authorize access="hasRole('ROLE_ADMIN')">
	<div class="container">
		<h2>Employee Profiles:</h2>

		<div class="table-responsive">

			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
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
					<c:forEach items="${employeeList}" var="employee">
						<tr>
							<td>${employee.id}</td>
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
							<td>${employee.address.zipCode}</td>
							<td><fmt:formatDate value="${employeeJobBasic.joinDate}"
									pattern="MM/dd/yyyy" /></td>
							<td><a href="/CaseStudy/editEmployee/${employee.id}">Edit</a>
								&nbsp;&nbsp;&nbsp; <a href="/CaseStudy/delete?id=${employee.id}">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

			<input type="button" class="btn btn-dark"
				onclick="location.href= '${pageContext.request.contextPath}/employeeregistration.jsp'"
				value="Add Another Application" />
		</div>
	</div>

	<!-- /Start your project here-->


	<!-- Footer -->
	<%@ include file="footer.jsp"%>
	<!-- injecting footer -->

</security:authorize>
</body>

</html>
