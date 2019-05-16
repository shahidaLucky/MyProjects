<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Header tag -->
<%@ include file="headertags.jsp"%>
<!-- injecting headertag -->

</head>
<body>
	<!-- Navbar -->
	<!-- Injecting navbar -->
	<%@ include file="navbar.jsp"%>

	<!-- main content of the page-->

	<div class="row">
		<div class="col">
		<img src="/CaseStudy/images/book.jpg" alt="GlobalWell" width="800"
				height="500">
		</div>
		<div class="col">
			<h3>
				Congratulations!
			</h3>
			<h4>Your Application has been Submitted Successfully for Approval!</h4>
			<hr>
			<div class="container">
		<h2>Employee Applications:</h2>

		<div class="table-responsive">

			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Employee ID</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Designation</th>
						
					</tr>
				</thead>
				<tbody>

						<tr>
							<td>${employee.id}</td>
							<td>${employee.firstName}</td>
							<td>${employee.lastName}</td>
							<td>${employee.getEmployeeJobBasic().getDesignation()}</td>
						</tr>

				</tbody>
			</table>

		</div>
	</div>

		</div>
		</div>

		<!--/main content of the page-->

</body>

		<!-- Footer -->
		<%@ include file="footer.jsp"%>
		<!-- injecting footer -->
</html>
