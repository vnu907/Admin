<%@ include file="jspf/header.jspf"%>
<title>User Info</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="admin-customer-page">
					<c:choose>
						<c:when test="${empty ticketBookingHistory}">
							<div class="flightDataAvailable">
								<p>Sorry No Booking Details Available</p>
							</div>
						</c:when>
						<c:otherwise>
							<table>
								<tr>
									<th>TicketId</th>
									<th>Booking Id</th>
									<th>Customer Id</th>
									<th>Email Id</th>
									<th>Phone Number</th>
									<th>PNR Number</th>
									<th>Oauth2 User Id</th>
									<th></th>
									<th></th>
								</tr>
								<c:forEach items="${ticketBookingHistory}" var="ticketBooking">
									<tr>
										<td>${ticketBooking.ticketid}</td>
										<td>${ticketBooking.bookingId}</td>
										<td>${ticketBooking.customerid}</td>
										<td>${ticketBooking.email}</td>
										<td>${ticketBooking.phoneNumber}</td>
										<td>${ticketBooking.pnrNumber}</td>
										<td>${ticketBooking.useremail}</td>
										<td><a type="button" class="btn btn-danger"
											href="/deletebooking?id=${ticketBooking.ticketid}">Delete</a></td>
										<td><a type="button" class="btn btn-primary"
											href="/getticketbookingcustomerinfo?id=${ticketBooking.ticketid}">Travelers</a></td>
									</tr>

								</c:forEach>
							</table>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
			<div class="inner-page-2-exception">
				<div class="inner-page-2-sub1">
					<img width="320" height="201"
						src="images/ammie-ngo-vcu-OZBxxRk-unsplash.jpg"> 
				</div>
				<div class="inner-page-2-sub1">
					<img
						src="images/ammie-ngo-vcu-OZBxxRk-unsplash.jpg"
						width="320" height="201" style="border: none; overflow: hidden"
						scrolling="no" frameborder="0" allowfullscreen="true"
						allow="autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share">
				</div>
				<div class="inner-page-2-sub1">
					<img width="320" height="201"
						src="images/ammie-ngo-vcu-OZBxxRk-unsplash.jpg" />
				</div>
			</div>
		</div>
	</div>
	<%@ include file="jspf/footer.jspf"%>
</body>
</html>