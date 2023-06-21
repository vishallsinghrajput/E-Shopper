<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">


</head>
<body>

	<div class="container">

		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="card">
					<header class="card-header">
						<a href="login.jsp"
							class="float-right btn btn-outline-primary mt-1">Log in</a>
						<h4 class="card-title mt-2">Sign up</h4>
					</header>
					<article class="card-body">
						<form action="RegisterServlet" method="post">
							<div class="form-row">
								<div class="col form-group">
									<label>First name </label> <input type="text" name="fname"
										class="form-control" placeholder="">
								</div>
								<!-- form-group end.// -->
								<div class="col form-group">
									<label>Last name</label> <input type="text" name="lname"
										class="form-control" placeholder=" ">
								</div>
								<!-- form-group end.// -->
							</div>
							<!-- form-row end.// -->
							<div class="form-group">
								<label>Email address</label> <input type="email" name="email"
									class="form-control" placeholder=""> <small
									class="form-text text-muted">We'll never share your
									email with anyone else.</small>
							</div>
							<!-- form-group end.// -->
							<div class="form-group">
								<label class="form-check form-check-inline"> <input
									class="form-check-input" type="radio" name="gender"
									value="Male"> <span class="form-check-label">
										Male </span>
								</label> <label class="form-check form-check-inline"> <input
									class="form-check-input" type="radio" name="gender"
									value="Female"> <span class="form-check-label">
										Female</span>
								</label>
							</div>
							<!-- form-group end.// -->
							<div class="form-row">
								<div class="form-group col-md-6">
									<label>City</label> <input type="text" name="city"
										class="form-control">
								</div>
								<!-- form-group end.// -->
								<div class="form-group col-md-6">
									<label>Country</label> <select id="inputState" name="country"
										class="form-control">
										<option>Choose...</option>
										<option>Uzbekistan</option>
										<option>Russia</option>
										<option>United States</option>
										<option selected="">India</option>
										<option>Afganistan</option>
									</select>
								</div>
								<!-- form-group end.// -->
							</div>
							<!-- form-row.// -->
							<div class="form-group">
								<label>Create password</label> <input class="form-control"
									name="password" type="password">
							</div>
							<!-- form-group end.// -->

							<div class="form-group">
								<div class="custom-control custom-checkbox">
									<input type="checkbox" name="label" value="admin"
										class="custom-control-input" id="customControlInline">
									<label class="custom-control-label" for="customControlInline">Admin</label>
								</div>
							</div>


							<div class="form-group">
								<button type="submit" class="btn btn-primary btn-block">
									Register</button>
							</div>
							<!-- form-group// -->
							<small class="text-muted">By clicking the 'Sign Up'
								button, you confirm that you accept our <br> Terms of use
								and Privacy Policy.
							</small>
						</form>
					</article>
					<!-- card-body end .// -->
					<!-- <div class="border-top card-body text-center">Have an account? <a href="login.jsp">Log In</a></div>
 -->
				</div>
				<!-- card.// -->
			</div>
			<!-- col.//-->

		</div>
		<!-- row.//-->


	</div>
	<!--container end.//-->

	<br>
	<br>
	<article class="bg-secondary mb-3">
		<div class="card-body text-center">
			<h3 class="text-white mt-3">Bootstrap 4 UI KIT</h3>
			<p class="h5 text-white">
				Components and templates <br> for Ecommerce, marketplace,
				booking websites and product landing pages
			</p>
			<br>
			<p>
				<a class="btn btn-warning" target="_blank"
					href="http://bootstrap-ecommerce.com/"> Bootstrap-ecommerce.com
					<i class="fa fa-window-restore "></i>
				</a>
			</p>
		</div>
		<br>
		<br>
	</article>

</body>
</html>