<%@ include file="jspf/header.jspf"%>
<title>Airline Reservation System</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<!-- <div> -->
		<div class="spidy-container">
			<div class="first-section">
				<h2>Plan your Journey</h2>
				<div class="form">
					<form:form modelAttribute="search" method="post">

						<input type="radio" id="one-way" name="Plan_your_Journey"
							value="1">
						<label for="one-way">One-Way</label>

						<input type="radio" id="round-trip" name="Plan_your_Journey"
							value="2" checked="checked">
						<label for="round-trip">Round Trip</label>

						<div class="row">
							<div class="col-md-5">
								<form:input path="source" class="form-control col-md-2"
									placeholder="Source" />
								<form:errors path="source" cssClass="text-warning" />
							</div>
							<div class="col-md-5">
								<form:input path="destination" class="form-control col-md-2 "
									placeholder="Destination" />
								<form:errors path="destination" cssClass="text-warning" />
							</div>
						</div>

						<div class="row">
							<div class="col-md-5">
								<form:label path="journeyDate" for="datepicker1">Date Of Journey</form:label>
								<form:input path="journeyDate" type="datetime-local"
									value="2022-02-26T19:30" min="2022-02-26T00:00"
									max="2022-04-26T00:00" class="form-control" id="datepicker1" />
								<form:errors path="journeyDate" cssClass="text-warning" />
							</div>

							<div class="col-md-5">
								<form:label path="returnDate" for="datepicker2"
									id="label-datepicker1">Return Date Of Journey</form:label>
								<form:input path="returnDate" type="datetime-local"
									value="2022-02-26T19:30" min="2022-02-26T00:00"
									max="2022-04-26T00:00" class="form-control" id="datepicker2" />
								<form:errors path="returnDate" cssClass="text-warning" />
							</div>
						</div>

						<div class="row">
							<div class="col-md-10">
								<form:select path="passenger" class="form-control spidySpace"
									placeholder="List of Passengar">
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
								</form:select>
								<form:errors path="passenger" cssClass="text-warning" />
							</div>
						</div>
						<div class="row">
							<div class="col-md-10">
								<form:select path="classOfjourney"
									class="form-control spidySpace" name="classOfjourney"
									id="classOfjourney">
									<option value="ECONOMY">ECONOMY</option>
									<option value="BASIC_ECONOMY">BASIC_ECONOMY</option>
									<option value="PREMIUM_ECONOMY">PREMIUM_ECONOMY</option>
									<option value="BUSINESS">BUSINESS</option>
									<option value="FIRST">FIRST</option>
								</form:select>
								<form:errors path="classOfjourney" cssClass="text-warning" />


							</div>

						</div>

						<div class="row">
							<div class="mt-4 ">
								<input type="submit" class="btn btn-secondary" value="Search">
							</div>
						</div>
					</form:form>

				</div>
			</div>

			<div class="second-section">
				<div class="image-slideshow">
					<img class="abc71" src="images/adrien-eBKbKMiE03c-unsplash.jpg" />
					<img class="abc71" src="images/ammie-ngo-vcu-OZBxxRk-unsplash.jpg" />
					<img class="abc71"
						src="images/aussieactive-1brtlzDq-o8-unsplash.jpg" /> <img
						class="abc71" src="images/chris-karidis-nnzkZNYWHaU-unsplash.jpg" />
					<img class="abc71"
						src="images/datingscout-BmfXYrGqKJw-unsplash.jpg" /> <img
						class="abc71" src="images/grant-ritchie-HexegS3KB30-unsplash.jpg" />
					<img class="abc71"
						src="images/harold-eggar-oIVpygLFUJg-unsplash.jpg" /> <img
						class="abc71" src="images/il-vagabiondo-8eNt0CQamB0-unsplash.jpg" />
					<img class="abc71"
						src="images/jeremy-bezanger-Bmb4oPUi8pQ-unsplash.jpg" />
				</div>
			</div>



			<div class="spidy-2">
				<h1>Top Places to Visit</h1>
			</div>
			<div class="spidy-3">
				<h1>Best Packages provided by us</h1>
			</div>
			<div class="spidy-2">
				<h1>Quick about website</h1>
			</div>
			<div class="spidy-3">
				<h1>Our Parteners</h1>
			</div>
			<div class="spidy-2">
				<h1>Feedbacks from customers</h1>
			</div>
		</div>
		<!-- </div> -->
		<script>
			$(function() {
				$('input[type=radio][name=Plan_your_Journey]').change(
						function() {
							if (this.value == 1) {
								$('#datepicker2').hide();
								$('#label-datepicker1').hide();
							} else if (this.value == 2) {
								$('#datepicker2').show();
								$('#label-datepicker1').show();
							}
						});
				var current = 0, $imgs = jQuery('.image-slideshow .abc71');
				imgAmount = $imgs.length;
				$($imgs.css('position', 'absolute').hide().get(0)).show();
				window.setInterval(swapImages, 1000);
				function swapImages() {
					var $currentImg = $('.abc71:visible');
					var $nextImg = $('.abc71:hidden').eq(
							Math.floor(Math.random()
									* $('.abc71:hidden').length));
					speed = 2500;
					// animation speed should be the same for both images so we have a smooth change
					$currentImg.fadeOut(speed);
					$nextImg.fadeIn(speed);
				}

			});
		</script>
		<%@ include file="jspf/footer.jspf"%>
	</div>
</body>
</html>