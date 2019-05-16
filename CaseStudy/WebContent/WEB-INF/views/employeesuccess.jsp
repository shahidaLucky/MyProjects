<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
<!-- Header tag -->
<%@ include file="headertags.jsp"%>
<!-- injecting headertag -->

<title>Employee Profile Success Page</title>

</head>

<body>
	<!-- Navbar -->
	<!-- Injecting navbar -->
	<%@ include file="navbar.jsp"%>


	<!-- Start your project here-->

	<div class="row">
		<div class="col">
			<img src="./images/hamiltonPic.jpg" alt="GlobalWell" width="800"
				height="700">
		</div>

		<div class="col">
			<br> <br> <br> <br>
			<h2 style= "color: purple;"><b>Global Well Employee Registration!</b></h2>
			<hr>
			<h3>
				<mark>Congratulations!</mark> <br> Your Profile has been Successfully
				Created!
			</h3>
			<br>
			<h4>
				To get Affordable Tuition Assistance click on the "Apply" button
				below
				</h>
				<hr>
				<br>
				<br>
				<div class="container">
					<input type="button" class="btn btn-dark"
						onclick="location.href= '${pageContext.request.contextPath}/employee/${employeeID}/apply'"
						value="Apply" />
				</div>
		</div>

	</div>
	</div>

	<!-- /Start your project here-->


	<!-- Footer -->
	<%@ include file="footer.jsp"%>
	<!-- injecting footer -->


</body>

</html>
