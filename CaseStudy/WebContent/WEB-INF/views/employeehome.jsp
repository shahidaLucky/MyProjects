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
<body>
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
			<li>Employees who scored ≥4.00 on their last
				yearly5+4.00000000000 performance appraisal</li>
			<li>The repayment interest rate for Global Well employees is
				2.99%</li>
			<li>In case of separation either by the Employee or by the
				Global Well prior to the projected repayment dateline, the employee
				has to repay the remaining balance on 15.99% interest rate</li>
			<br>
			</p>
			<a href="seemore">see more...</a>
		</div>
		<div class="col" style= "background-color: white;">
		
			<div>
			<button class="btn success" onclick="window.location = 'eligibility'">Am I Eligible?</button>
			</div>

			<div>
			<button class="btn warning">Program Policies</button>
			</div>
			<div>
			<button class="btn warning">Project Repayment Calculator</button>
			</div>
			
			<div>
			<button class="btn success" onclick="window.location = 'employee/apply'">Interested? Apply</button>
			</div>
			
			<div>
			<button class="btn warning">Mailbox</button>
			</div>
			<div>
			<button class="btn warning">Document Vault</button>
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
