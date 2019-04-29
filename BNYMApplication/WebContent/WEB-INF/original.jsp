<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h2>BNYM Application Page!</h2>

${msg}
	<form action="/BNYMApplication/submit" method="POST">
		<table>
			<tr>
			<tr>
				<h3>Login :</h3>
				<td><h4>
						<mark>email :</mark>
					</h4></td>
				<td><input type="email" name="email" required />*</td>
			</tr>

			<tr>
				<td><mark>Password :</mark></td>
				<td><input type="password" name="password" required />*</td>
			</tr>

			<tr>
				<td><input type="submit" name="submit" value="Submit" /></td>
			</tr>
			<tr>
				<td><input type="button"
					onclick="location.href= '${pageContext.request.contextPath}/registration'"
					value="Create New User" /></td>
			</tr>

		</table>
	</form>
</body>
</html>