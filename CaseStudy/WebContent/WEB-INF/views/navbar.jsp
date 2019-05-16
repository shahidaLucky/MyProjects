<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<!-- Grid row -->
<div class="container-fluid"></div>
<div class="row">
	<!-- Grid column -->
	<div class="col-md-6 "
		style="background-color: #99ff33; text-align: left;">
		<img src="/CaseStudy/images/globaWellLogo.png" alt="GlobalWell"
			width="150" height="50">

		<h6 class="darkblue-text">
			<b>Employee Resource Center</b>
		</h6>

	</div>
	<div style="background-color: #99ff33" class="col-md-6 "
		style="background-color:  #99ff33; text-align: left;">

		<h2 class="darkblue-text">
			<b>Affordable Tuition Assistance Program</b>
		</h2>

	</div>
</div>
<!-- Grid column -->
<!-- Grid row -->

<!--Navbar -->

<div class="topnav" id="myTopnav">
	<a href="/CaseStudy/" class="active">Home</a> <a
		href="/CaseStudy/about">About</a> <a href="javascript:void(0);"
		class="icon" onclick="myFunction()"> <i class="fa fa-bars"></i>
	</a>
	
	<!-- ************* Security Role User ************************* -->
	<security:authorize access="hasRole('ROLE_USER')">
		<a href="${pageContext.request.contextPath}/eligibility">Eligibility
			Test</a>
	</security:authorize>
	
		<!-- ************* Security Role Admin ************************* -->
	<security:authorize access="hasRole('ROLE_ADMIN')">
		<a href="${pageContext.request.contextPath}/admin/AllEmployees">All
			Employees</a>
	</security:authorize>

	<security:authorize access="isAuthenticated()">
		<a href="${pageContext.request.contextPath}/logout">Logout</a>
	</security:authorize>
</div>

<div style="padding-left: 16px">
	<h2></h2>
	<p></p>
</div>


<!-- <nav class="navbar navbar-expand-lg navbar-dark indigo">
	<a class="navbar-brand" href="#"> </a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarText" aria-controls="navbarText"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarText">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="index">Home
					<span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item"><a class="nav-link" href="about">About</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="apply">Apply</a></li>
			<li class="nav-item"><a class="nav-link" href="logout">Logout</a></li>
		</ul>
		<span class="navbar-text white-text"> Global Well Employee
			Resource Center </span>
	</div>
</nav> -->
<!--/.Navbar -->
