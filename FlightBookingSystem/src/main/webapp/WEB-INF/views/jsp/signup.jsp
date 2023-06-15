<%@ include file="jspf/header.jspf"%>
<title>Airline Reservation System</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="page-design">
			<div class="signup-page-design" id="signup">
				<form:form modelAttribute="customer" method="post">
					<div class="signup-in-disp">
						<div class="signup-header">
							<p>Signup Form</p>
						</div>
						<div class="sign-1">
							<label>First Name:</label>
						</div>
						<div class="sign-2">
							<form:input path="firstname" placeholder="Enter Firstname"
								size="28" />
						</div>
						<div class="sign-3">
							<label>Last Name:</label>
						</div>
						<div class="sign-4">
							<form:input path="lastname" placeholder="Enter Lastname"
								size="28" />
						</div>
						<div class="sign-5">
							<label>Email Id:</label>
						</div>
						<div class="sign-6">
							<form:input path="emailid" placeholder="Enter Emailid" size="28" />
						</div>
						<div class="sign-7">
							<label>Username:</label>
						</div>
						<div class="sign-8">
							<form:input path="username" placeholder="Enter Username"
								size="28" />
						</div>
						<div class="sign-9">
							<label>Password:</label>
						</div>
						<div class="sign-10">
							<form:input path="password" placeholder="Enter Password"
								size="28" />
						</div>
						<div class="sign-11">
							<label>Phone Number:</label>
						</div>
						<div class="sign-12">
							<form:input path="phonenumber" placeholder="Enter Phonenumber"
								size="28" />
						</div>
						<div class="sign-13">
							<label>Country:</label>
						</div>
						<div class="sign-14">
							<form:input path="country" placeholder="Enter Country" size="28" />
						</div>

						<div class="sign-15">
							<button class="signup-button-design-1" type="submit"
								value="submit">
								<i class="fa-solid fa-user-plus"></i>
							</button>

						</div>
						<div class="sign-16">
							<div class="login-button-design-div-google">
								<a href="/oauth2/authorization/google"
									class="login-button-design-google"> <i class="fa-brands fa-google"></i>
								</a>
							</div>
						</div>
					</div>
				</form:form>
				<div class="sign-17">
					<a class="login-button-design" href="/login"> <i
						class="fas fa-sign-in-alt">  </i>
						<span>Log in</span>
					</a>
				</div>
			</div>
		</div>
		<%@ include file="jspf/footer.jspf"%>

	</div>

</body>
</html>