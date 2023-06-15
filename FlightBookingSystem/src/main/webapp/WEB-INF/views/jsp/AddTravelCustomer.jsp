<%@ include file="jspf/header.jspf"%>
<title>Add Traveling Customer Details</title>
</head>

<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<c:forEach var="i" begin="0" end="${listOfPassengar-1}">
					<h3>Add Customer #${i+1}</h3>
					<div class="form">
						<form method="post" id="customer-form">
							<div class="row pt-3 input-group">
								<div class="col">
									<label class="label-text"> Enter FirstName: </label>
								</div>
								<div class="col">
									<input id="firstName${i}" name="firstName"
										class="form-control col-md-2" placeholder="Enter FirstName" />
								</div>

							</div>
							<div class="row pt-3 input-group">
								<div class="col">
									<label class="label-text"> Enter LastName: </label>
								</div>
								<div class="col">
									<input id="lastName${i}" class="form-control col-md-2 "
										placeholder="Enter LastName" name="lastName" />
								</div>
							</div>
							<div class="row pt-3 input-group">
								<div class="col">
									<label class="label-text"> Gender: </label>
								</div>
								<div class="col">
									<select id="gender${i}" name="gender"
										class="form-control col-md-2 ">
										<option value="Male">Male</option>
										<option value="Female">Female</option>
									</select>
								</div>

							</div>
						</form>
					</div>
				</c:forEach>
			</div>
			<div class="inner-page-2">
				<div class="price-details">
					<h1>Total Fare</h1>
					<div class="row">
						<div class="col-3">Base Fare</div>
						<div class="col-9 text-right">&#8377 ${seat.priceforbooking}
							X ${listOfPassengar} Passengar</div>
					</div>
					<div class="row">
						<div class="col-3">Tax</div>
						<div class="col-9 text-right">&#8377 ${seat.tax} X
							${listOfPassengar} Passengar</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-3">Discount</div>
						<div class="col-9 text-right">&#8377 0.0</div>
					</div>
					<div class="row">
						<div class="col-5">Other Cost</div>
						<div class="col-7 text-right">&#8377 0.0</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-3">Total</div>
						<div class="col-9 text-right">&#8377
							${seat.priceforbooking*listOfPassengar +
						seat.tax*listOfPassengar}</div>
					</div>

				</div>
			</div>

			<div class="inner-page">
				<div class="spidy-cool">
					<h1>
						<strong>Contact Details</strong>
					</h1>
					<div class="form">
						<form action="#" method="post">
							<div class="row pt-3 input-group">
								<div class="col-2">
									<label class="label-text"> Enter Email: </label>
								</div>
								<div class="col-4">
									<p class="error float-end" id="email-info"></p>
								</div>
								<div class="col">
									<input type="text" id="email" name="email"
										class="form-control col-md-2" placeholder="Enter Email"
										value="" />
								</div>
							</div>
							<div class="row pt-3 input-group">
								<div class="col-2">
									<label class="label-text"> Enter Phone: </label>
								</div>
								<div class="col-4">
									<p class="error float-end" id="phone-info"></p>
								</div>
								<div class="col">
									<input type="text" id="phoneNumber"
										class="form-control col-md-2" placeholder="Enter phoneNumber"
										name="phoneNumber" value="" />
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		<div class="button-spidy">
			<button id="button-event" class="spidy-button-design"
				onclick="location.href='/paymentProcess';" disabled="disabled">Process For
				Payment</button>
		</div>
	</div>
	<script type="text/javascript">
		$(function() {
			var ticketBooking = {};
			var myJson;
			var emailField = $("#email");
			var phoneNumberField = $("#phoneNumber");
			var buttonEvent  = $("#button-event");
			
			validateEmail(emailField,buttonEvent,ticketBooking);
			validatePhone(phoneNumberField,buttonEvent,emailField,ticketBooking);

		});
		function validateEmail(emailField,buttonEvent,ticketBooking){
			emailField.blur(function(event) {
				var email = emailField.val();
				if (!isValidEmail(email)) {
					$("#email-info").text("Not Valid Email")
							.css("color", "red");
					event.preventDefault();
					buttonEvent.prop('disabled', true);
				} else {
					$("#email-info").text(" ");
					ticketBooking.email = email;
				}
			});
		}
		function validatePhone(phoneNumberField,buttonEvent,emailField,ticketBooking){
			phoneNumberField.blur(function(event) {
				var phoneNumber = phoneNumberField.val();
				if (!isValidPhoneNumber(phoneNumber)) {
					$("#phone-info").text("Not Valid Phone Number").css(
							"color", "red");
					event.preventDefault();
					buttonEvent.prop('disabled', true);
				} else {
					$("#phone-info").text(" ");
					ticketBooking.phoneNumber = phoneNumber;
					var length = ${listOfPassengar};
					console.log(length);
					var travelCustomerList = [];
					for (let i = 0; i < length; i++) {
						var firstName = $("#firstName" + i);
						var lastName = $("#lastName" + i);
						var gender = $("#gender" + i);
						var travelCustomer = {
							firstName : firstName.val(),
							lastName : lastName.val(),
							gender : gender.val()
						};
						travelCustomerList.push(travelCustomer);
					}
					ticketBooking.travelCustomer = travelCustomerList;
					myJson = JSON.stringify(ticketBooking);
					buttonEvent.prop('disabled', false);
					buttonEvent.removeClass('disabled').addClass('enabled');
					validateEmail(emailField,buttonEvent,ticketBooking);
					send(myJson);
				}
			});
		}
		function send(myJson) {

			$.ajax({
				url : '/payment',
				type : 'post',
				dataType : 'json',
				contentType : 'application/json',
				success : function(data) {

				},
				data : myJson
			});

		}

		function isValidEmail(email) {
			return email.trim().length >= 2;
		}

		function isValidPhoneNumber(phoneNumber) {
			var pattern = /^([789])([0-9]{9})$/;
			return pattern.test(phoneNumber);
		}

		function isValidTextField(textField) {
			return textField.trim().length >= 2;
		}
	</script>
	<%@ include file="jspf/footer.jspf"%>
</body>

</html>