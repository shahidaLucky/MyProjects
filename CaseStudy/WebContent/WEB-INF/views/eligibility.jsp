<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Header tag -->
<%@ include file="headertags.jsp"%>
<!-- injecting headertag -->

<title>Employee Eligibility Test</title>
</head>

<body>
	<!-- Navbar -->
	<!-- Injecting navbar -->
	<%@ include file="navbar.jsp"%>
	<!-- end Navbar -->

	<!-- Start your project here-->
	<!-- ------------Form --------------------- -->
	<br><br>
	<h2>Eligibility Questions for Loan :</h2><hr><br><br>
	
	<div class="container">
		<p>
		Please review the eligibility questions
		below carefully. Please select your answers from the drop-down menu
		and take a print. If the answer of each statement is “YES” for you,
		you can consider yourself as Primarily Eligible to participate to the
		Tuition Assistance from Global Well. We recommend you to apply with
		confidence.
		</p>
		
		<table class="table">
		<thead>
			<tr>
				<th><b><mark>Eligibility Questionnaire</mark></b></th>
				<th><b><mark>Answer</mark></b></th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>I am working at Global Well for at least 1 year</td>
				<td>
					<select class="form-control" id="q1">
						<option value="yes" selected>Yes</option>
						<option value="no">No</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>My last yearly Performance Assessment score is >=4.00</td>
				<td>
					<select class="form-control" id="q2">
						<option value="yes" selected>Yes</option>
						<option value="no">No</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>My current job location is in USA</td>
				<td>
					<select class="form-control" id="q3">
						<option value="yes" selected>Yes</option>
						<option value="no">No</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>I do not require relocation to complete/attend the degree program</td>
				<td>
					<select class="form-control" id="q4">
						<option value="yes" selected>Yes</option>
						<option value="no">No</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>I have a promise to work for Global Well for longer time, at least 5+ years</td>
				<td>
					<select class="form-control" id="q5">
						<option value="yes" selected>Yes</option>
						<option value="no">No</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>The expected degree program is Bachelor or higher</td>
				<td>
					<select class="form-control" id="q6">
						<option value="yes" selected>Yes</option>
						<option value="no">No</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>I strongly believe that the expected degree program will help me to gain new skills set that requires to perform the advanced duties of Global Well </td>
				<td>
					<select class="form-control" id="q7">
						<option value="yes" selected>Yes</option>
						<option value="no">No</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>After completion of the degree program, I will not claim any promotion or career growth intensive from Global Well</td>
				<td>
					<select class="form-control" id="q8">
						<option value="yes" selected>Yes</option>
						<option value="no">No</option>
					</select>
				</td>
			</tr>
		</tbody>	
	</table>
	
	<p>
Please sign and date in the printed copy and preserve it. If you become finally selected, you have to upload this signed form to the document vault. However, please
keep in mind that your primary eligibility based on this form doesn’t guarantee your final enrollment to the program. Your final selection depends on the information
you have provided in the application form, the verification of the enrollment documents of the expected degree program, the availability of the fund and full
compliance of all other required internal and external regulations and procedures.	
	</p><br>
		<p class="alert alert-danger" id="error">You are not Eligible. Please review the "Know your Tuition Assistance Program" documents</p>		
		<button type="button" class="btn btn-dark" id="download">Submit</button>
		</div><br><br><br>
	

	<!-- /Start your project here-->
    <script type="text/javascript" src="js/eligibility/script.js"></script>

	<!-- Footer -->
	<%@ include file="footer.jsp"%>
	<!-- injecting footer -->


</body>

</html>
