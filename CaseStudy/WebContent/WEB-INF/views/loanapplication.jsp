<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Header tag -->
<%@ include file="headertags.jsp"%>
<!-- injecting headertag -->

<title>Loan Application Page</title>
<!-- My custom styles -->
<link href="/CaseStudy//css/modules/customstyle.css" rel="stylesheet">
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
		<h2>${msg}</h2>
		<h1 class="text-center">ATAP Application Form</h1>
		<div style="background-color: #dadada;" class="container">

			<form:form action="apply" method="POST"
				modelAttribute="applicationForm">


				<div class="form-group">
					<label for="totalTenure">I'm working in Global Well for at
						least 1 year :</label>
					<form:select class="form-control" id="q1" path="totalTenure">
						<option value="1" selected>Yes</option>
						<option value="0">No</option>
					</form:select>
					<!-- Form Error -->
					<small> <form:errors path="totalTenure" cssClass="errormsg" />
					</small>
				</div>

				<div class="form-group">
					<label for="pa_core">My last yearly performance assessment
						score is :</label>
					<form:input type="text" id="pa_core" class="form-control"
						path="pa_core" name="pa_core" />
					<!-- Form Error -->
					<small> <form:errors path="pa_core" cssClass="errormsg" />
					</small>
				</div>

				<div class="form-group">
					<label for="currentJobLocation">My current job location is
						in USA :</label>
					<form:select class="form-control" id="currentJobLocation"
						path="currentJobLocation">
						<option value="1" selected>Yes</option>
						<option value="0">No</option>
					</form:select>
					<!-- Form Error -->
					<small> <form:errors path="currentJobLocation"
							cssClass="errormsg" />
					</small>
				</div>
				<div class="form-group">
					<label for="relocationNeed">Do you required relocation to
						complete/attend the degree program :</label>
					<form:select class="form-control" id="relocationNeed"
						path="relocationNeed">
						<option value="1" selected>Yes</option>
						<option value="0">No</option>
					</form:select>
					<!-- Form Error -->
					<small> <form:errors path="relocationNeed"
							cssClass="errormsg" />
					</small>
				</div>

				<div class="form-group">
					<label for="promise">I have a promise to work for Global
						Well for longer time,at least 5+ years :</label>
					<form:select class="form-control" id="promise" path="promise">
						<option value="1" selected>Yes</option>
						<option value="0">No</option>
					</form:select>
					<!-- Form Error -->
					<small> <form:errors path="promise" cssClass="errormsg" />
					</small>
				</div>

				<div class="form-group">
					<label for="loanAmount">The amount of loan you are looking
						from ATAP :</label>
					<%-- 						<form:select class="form-control" id="loanAmount" path="loanAmount">
						<option value="1" selected>Yes</option>
						<option value="0">No</option> --%>
					<%-- 					</form:select> --%>


					<form:input type="text" id="loanAmount" class="form-control"
						path="loanAmount" name="loanAmount" />
					<!-- Form Error -->
					<small> <form:errors path="loanAmount" cssClass="errormsg" />
					</small>
				</div>

				<div class="form-group">
					<label for="currentSkills">What skills set do you poses
						that makes you believe that you are eligible for the Tuition
						Assistance :</label>
					<form:select class="form-control" path="currentSkills"
						multiple="multiple">
						<c:forEach var="skill" items="${skillsList}">
							<form:option value="${skill}">${skill}</form:option>
						</c:forEach>
					</form:select>
					<!-- Form Error -->
					<small> <form:errors path="currentSkills"
							cssClass="errormsg" />
					</small>
				</div>

				<button type="submit" class="btn btn-success btn-block"
					name="submit">Submit</button>
					<br />
			</form:form>
		</div>
	</div>



	<!-- /Start your project here-->
</body>

<!-- Footer -->
<%@ include file="footer.jsp"%>
<!-- injecting footer -->



</html>
