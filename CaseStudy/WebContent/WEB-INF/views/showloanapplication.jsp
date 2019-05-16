<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
	<div class="container">
		<h2>Employee Applications:</h2>

		<div class="table-responsive">

			<table class="table table-bordered">
				<thead>
					<tr>
					<th>Application ID</th>
						<th>Employee ID</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Designation</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${employeeList}" var="apply">
						<tr>
							<td>${apply.id}</td>
							<td>${apply.firstname}</td>
							<td>${apply.lastname}</td>
							<td>${apply.designation}</td>
							
						</tr>
					</c:forEach>
				</tbody>
			</table>

			<input type="button" class="btn btn-dark"
				onclick="location.href= '${pageContext.request.contextPath}/loanapplication.jsp'"
				value="Add Another Application" />
		</div>
	</div>

	<!-- /Start your project here-->


	<!-- Footer -->
	<%@ include file="footer.jsp"%>
	<!-- injecting footer -->


</body>

</html>
