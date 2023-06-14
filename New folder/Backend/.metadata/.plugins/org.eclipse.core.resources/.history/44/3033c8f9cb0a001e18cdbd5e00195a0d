<%@ include file="jspf/header.jspf"%>
<title>All Ticket Booking Details</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="admin-customer-page">
					<c:choose>
						<c:when test="${empty ticketBookingDetails}">
							<div class="flightDataAvailable">
								<p>Sorry No Booking Details Available</p>
							</div>
						</c:when>
						<c:otherwise>
							<table>
								<tr>
									<th>Ticket Id</th>
									<th>Booking Id</th>
									<th>Customer Id</th>
									<th>Email</th>
									<th>Phone Number</th>
									<th>PNR Number</th>
									<th>User Email</th>
									<th></th>
									<th></th>
								</tr>
								<c:forEach items="${ticketBookingDetails}" var="ticketBooking">
									<tr>
										<td>${ticketBooking.ticketid}</td>
										<td>${ticketBooking.bookingId}</td>
										<td>${ticketBooking.customerid}</td>
										<td>${ticketBooking.email}</td>
										<td>${ticketBooking.phoneNumber}</td>
										<td>${ticketBooking.pnrNumber}</td>
										<td>${ticketBooking.useremail}</td>
										<td><a type="button" class="btn btn-danger"
											href="/deleteticketbooking?id=${ticketBooking.ticketid}">Delete</a></td>
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
					<iframe width="320" height="201"
						src="https://www.youtube.com/embed/Q7oWlIps5WU"> </iframe>
				</div>
				<div class="inner-page-2-sub1">
					<iframe
						src="https://www.facebook.com/plugins/page.php?href=https%3A%2F%2Fwww.facebook.com%2Ffacebook&tabs=timeline&width=320&height=201&small_header=false&adapt_container_width=true&hide_cover=false&show_facepile=true&appId"
						width="320" height="201" style="border: none; overflow: hidden"
						scrolling="no" frameborder="0" allowfullscreen="true"
						allow="autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share"></iframe>
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