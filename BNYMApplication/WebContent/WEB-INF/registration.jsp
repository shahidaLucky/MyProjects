<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<h2>Welcome To Registration Page! </h2>
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
${msg}
	
	
	<form action="/BNYMApplication/submitNewUser" method="POST">
		
		<table>
			<tr>
				<td><mark>Email :<mark></td>
				<td><input type="email" name="email" placeholder="email" required />*</td>
			</tr>

			<tr>
				<td><mark>Password :</mark></td>
				<td><input type="password" name="password"  placeholder="password" required />*</td>
			</tr>
			<tr>
				<td><mark>Confirm Password :</mark></td>
				<td><input type="password" name="confirmPassword"  placeholder="confirmPassword" required />*</td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value = "Submit" /></td>
			</tr>
			<tr>
		</table>
	</form>
</body>
</html>