<%@ include file="jspf/header.jspf"%>
<title>Email Verification</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<!-- <div class="process-page"> -->
		<div class="inner-page-email">
			<div class="email-verify-design">
				<h2>Verify Your Email</h2>
				<form action="/verify" method="post">
					<div>
						<input type="text" id="verifyemail" name="verifyemail"
							placeholder="Enter verification code" class="textbox-design" />
					</div>
					<div>
						<p class="warning-message-ver" id="errorcode">Please Enter
							Correct Code.</p>
					</div>
					<div>
						<input type="submit" id="btnval" value="Click to verify"
							class="btnverify" disabled="disabled">
					</div>
				</form>

			</div>
		</div>

	</div>

	<!-- </div> -->
	<script>
		$(function() {
			var error = $("#errorcode");
			error.hide();
			var code = '${code}';
			console.log("code:" + code);
			var verifyEmail = $("#verifyemail");
			var buttonEvent = $(".btnverify");
			verifyEmail.blur(function(event) {
				var emailCode = verifyEmail.val();
				if (!(emailCode === code)) {
					error.show();
					event.preventDefault();
					buttonEvent.prop('disabled', true);
					
				} else {
					error.hide();
					buttonEvent.prop('disabled', false);
					
					buttonEvent.removeClass('disabled').addClass('enabled');

				}
			});
		});
	</script>
	<%@ include file="jspf/footer.jspf"%>
</body>
</html>