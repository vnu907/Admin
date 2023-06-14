<%@ include file="jspf/header.jspf"%>
<title>Customer Login</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="page-design">
			<div class="login-page-design" id="login">
				<form action="/processLogin" method="post">
					<c:if test="${param.verifyemail}">
						<div id="error">
							<p class="warning-message">
								Please Verify Your Identity <br>Email/Username does not
								exists.
							</p>
						</div>
					</c:if>
					<c:if test="${param.error}">
						<div id="error">
							<p class="warning-message">User Does Not Exists.</p>
						</div>
					</c:if>
					<div class="log-in-disp">
						<div class="login-header">
							<p>Login Form</p>
						</div>
						<div class="login-1">
							<label>User Id:</label>
						</div>
						<div class="login-2">
							<input type="text" name="username" size="28" />
						</div>
						<div class="login-3">
							<label>Password:</label>
						</div>
						<div class="login-4">
							<input type="password" name="password" size="28" />
						</div>

						<div class="login-5">
							<div>
								<button class="login-button-design" type="submit" value="submit">
									<i class="fas fa-sign-in-alt"> </i> <span>Log in</span>
								</button>
							</div>
						</div>
						<div class="login-6">
							<div class="login-button-design-div-google">
								<a href="/oauth2/authorization/google"
									class="login-button-design-google"> <i class="fa-brands fa-google">
								</i>
								</a>
							</div>
						</div>
					</div>
				</form>
				<div class="login-7">
					<button onclick="location.href='/signup';"
						class="signup-button-design" value="">
						<i class="fa-solid fa-user-plus"></i> <span>Sign up</span>
					</button>
				</div>
			</div>
		</div>
		<%@ include file="jspf/footer.jspf"%>

	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#signup').hide();
		});
	</script>
</body>
</html>