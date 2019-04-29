<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Apply Success</title>


</head>
<body>

	<h2>Congratulations! BNYM has processed your application
		successfully!</h2>
	
	<h4>Applicant Details</h4>
	
	<hr>
	<br>
		<table>
			<tr>
				<td>Name :</td>
				<td>${applicant.sName}</td>
			</tr>
			<tr>
				<td>Course :</td>
				<td>${applicant.sCourse}</td>
			</tr>
			<tr>
				<td>Mobile :</td>
				<td>${applicant.sMobile}</td>
			</tr>
			
			<tr>
				<td>Date Of Birth :</td>
				<td><fmt:formatDate value=${applicant.sDOB} pattern="MM/dd/yyyy"/></td>
				
			</tr>
			<tr>
				<td>Skills :</td>
				<td>${applicant.sSkills}</td>
			</tr>
			<tr>
				<td>Address :</td>
			</tr>
			<tr>
				<td>Street :</td>
				<td>${applicant.sAddress.street}</td>
			</tr>
				<tr>
				<td>City :</td>
				<td>${applicant.sAddress.city}</td>
			</tr>
				<tr>
				<td>State :</td>
				<td>${applicant.sAddress.state}</td>
			</tr>
				<tr>
				<td>ZipCode :</td>
				<td>${applicant.sAddress.zipcode}</td>
			</tr>
		</table>
		

</body>
</html>