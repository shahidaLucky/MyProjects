

<!-- Form Error -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admission Form</title>
<style>
body {
	background-color: #cce6ff;
}

td {
	color: #400080
}

h1, h2 {
	color: #26004d
}
</style>
</head>
<body>
	<h1>
		Welcome To BNY
		<h2>${msg}</h2>
	</h1>
	<hr>
	<br>
	<h1>Welcome To BNY !</h1>
	
	<form:errors path = "applicant.*" style = "color:red" />

	<form action="/BNYMApplication/submitform" method="POST">
		<table>

			<tr>
				<td><h4>Applicant Name :</h4></td>
				<td><input type="text" name="sName" required/>*</td>
			</tr>

			<tr>
				<td><mark>Course :</mark></td>
				<td><input type="text" name="sCourse" required />*</td>
			</tr>
			<tr>
				<td><mark>Mobile :</mark></td>
				<td><input type="text" name="sMobile" required />*</td>
			</tr>
			<tr>
				<td><mark>Date of birth :</mark></td>
				<td><input type="date" name="sDOB" required/>*</td>
			</tr>
			<tr>
				<td><mark>Skills :</mark></td>
				<td><select name="sSkills" id="skills" multiple="multiple">
						<option value="Java">Core Java</option>
						<option value="sql">SQL</option>
						<option value="Spring">Spring MVC</option>
						<option value="JavaScript">JavaScript</option>
				</select></td>
			</tr>

			<tr>
				<td colspan="2"><mark>Address :</mark></td>
			<tr>
				<td><mark>Street :</mark></td>
				<td><input type="text" name="sAddress.street" /></td>
			</tr>

			<tr>
				<td><mark>City :</mark></td>
				<td><input type="text" name="sAddress.city" /></td>
			</tr>
			<tr>
				<td><mark>State :</mark></td>
				<td><input type="text" name="sAddress.state" /></td>
			</tr>
			<tr>
				<td><mark>ZipCode :</mark></td>
				<td><input type="text" name="sAddress.zipcode" /></td>
			</tr>

			<tr>
				<td><input type="submit"
					name="submit" value="Apply" /></td>
			</tr>

		</table>
		
		
	</form>

	<p>
		<b>Thanks for your visit!</b>
	</p>


</body>
</html>