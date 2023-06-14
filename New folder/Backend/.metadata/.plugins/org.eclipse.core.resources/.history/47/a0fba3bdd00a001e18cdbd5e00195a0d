<%@ include file="jspf/header.jspf"%>
<title>Payment Success</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div id="pdfpage" class="inner-page-success">

			<div class="booking-header">
				<p>Booking Id: ${ticketBooking.bookingId}</p>
			</div>
			<div class="ticket">
				<div class="div-ticket1">
					<img class="child-div-ticket-1_1"
						src="images/icons/${flightDetails.imageName}" />
					<p class="child-div-ticket-1_2">${flightDetails.flightName}</p>
					<p class="child-div-ticket-1_3">${flightDetails.flightNumber}</p>
				</div>
				<div class="div-ticket2">
					<p class="child-div-t1">${flightDetails.source}</p>
					<h3 class="child-div-t2">${flightDetails.returnDepartureHourAndMinute()}</h3>
					<p class="child-div-t3">${flightDetails.getDepartureFormatedDate()}</p>
					<p class="child-div-t4">${sourceairport.nameofairport}</p>
				</div>
				<div class="div-ticket3">
					<p class="child-div-ticket-3_1">${flightDetails.duration}</p>
					<hr class="child-div-ticket-3_4">
					<span class="material-icons child-div-ticket-3_2"> flight</span>
					<p class="child-div-ticket-3_3">Non Stop</p>
				</div>
				<div class="div-ticket4">
					<p class="child-div-t1">${flightDetails.destination}</p>
					<h3 class="child-div-t2">${flightDetails.returnArrivalHourAndMinute()}</h3>
					<p class="child-div-t3">${flightDetails.getArrivalFormatedDate()}</p>
					<p class="child-div-t4">${destinationairport.nameofairport}</p>
				</div>
			</div>
			<div class="customer-travel">
				<div class="passengar-name">Passengar Name</div>
				<div class="gender">Gender</div>
				<div class="seat-ticket-info">Seat</div>
				<div class="seat-ticket-info">Cabin</div>
				<div class="seat-ticket-info">Check-in</div>
				<c:forEach items="${ticketBooking.travelCustomer}"
					var="travelCustomer" varStatus="status">
					<div class="passengar-name-value">${travelCustomer.firstName}
						${travelCustomer.lastName}</div>
					<div class="gender-value">${travelCustomer.gender}</div>
					<div class="seat-ticket-info-value">${travelCustomer.seatNumber}</div>
					<div class="seat-ticket-info-value">${travelCustomer.cabin}</div>
					<div class="seat-ticket-info-value">${travelCustomer.checkIn}</div>
				</c:forEach>
			</div>

			<div class="other-info">
				<div class="other-info_1">
					<h3>Please Have A Look Before You Go In Sky</h3>
				</div>
				<div class="other-info_2">
					<ul>
						<li>Make Sure You are fully/partially vaccinated. Or Must
							carry CRP test report of last 72 hrs.</li>
						<li>Mask is mandatory.</li>
						<li>Must carry valid ID proof (Driver Licence, Aadhar Card,
							Pan Card or any other Government recognised photo identification)</li>
						<li>Check-in desks will close 1 hour before departure.</li>
						<li>Don't carry any harmful gadget.</li>
					</ul>
				</div>
				<div class="other-info_3">
					<p class="pnr-info">Pnr:- ${ticketBooking.pnrNumber}</p>
					<p>Ticket Cost: ${seat.priceforbooking*listOfPassengar +
						seat.tax*listOfPassengar}</p>
					<p>Cancellation Charge: &#8377 ${seat.priceforcancel}</p>
					<p>Card Number: ${credit.cardnumber}</p>
					<p>Cvv: ${credit.cvv}</p>
					<p>Expiry Details: ${credit.expiryMonth} / ${credit.expiryYear}</p>
					<p>Booking email: ${ticketBooking.email}</p>
					<p>Booking phoneNumber: ${ticketBooking.phoneNumber}</p>
				</div>
				<div class="other-info_4">
					<p>Other Information:-</p>
					<p>Website:- codespy.com</p>
					<p>Email:-codespy@gmail.com</p>
					<p>Customer care:-+9199999999</p>
					<span> <a href="#"><img
							src="images/icons/facebook-28.png" alt=""
							style="width: 28px; height: 28px;"></a> <a href="#"><img
							src="images/icons/instagram-28.png" alt=""
							style="width: 28px; height: 28px;"></a> <a href="#"><img
							src="images/icons/telegram-28.png" alt=""
							style="width: 28px; height: 28px;"></a> <a
						href="https://www.youtube.com/channel/UCpLDXIR0YRRGV7ajTLv-41w"><img
							src="images/icons/youtube-28.png" alt=""
							style="width: 28px; height: 28px;"></a>
					</span>
				</div>
			</div>
			<div class="pdf-image-design">
				<span> <a href="filedownload/${flightDetails.flightName}${ticketBooking.bookingId}"><img src="images/icons/pdf-90.png"
						alt="" style="width: 60px; height: 60px;"></a>
				</span>
			</div>
		</div>

	</div>

	<script type="text/javascript">
		
	</script>
	<%@ include file="jspf/footer.jspf"%>
</body>
</html>