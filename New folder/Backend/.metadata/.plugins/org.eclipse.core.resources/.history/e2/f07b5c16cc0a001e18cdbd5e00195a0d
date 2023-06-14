<%@ include file="jspf/header.jspf"%>
<title>Traveling Customers</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="admin-customer-page">
					<c:choose>
						<c:when test="${empty ticketBookingDetailstraveler}">
							<div class="flightDataAvailable">
								<p>Sorry No User Available</p>
							</div>
						</c:when>
						<c:otherwise>
							<table>
								<tr>
									<th>Id</th>
									<th>First Name</th>
									<th>Last Name</th>
									<th>Gender</th>
									<th>Seat Number</th>
									<th>Check In</th>
									<th>Cabin</th>


								</tr>
								<c:forEach items="${ticketBookingDetailstraveler}"
									var="travelCustomer">
									<tr>
										<td>${travelCustomer.id}</td>
										<td>${travelCustomer.firstName}</td>
										<td>${travelCustomer.lastName}</td>
										<td>${travelCustomer.gender}</td>
										<td>${travelCustomer.seatNumber}</td>
										<td>${travelCustomer.cabin}</td>
										<td>${travelCustomer.checkIn}</td>

									</tr>

								</c:forEach>
							</table>
						</c:otherwise>
					</c:choose>
				</div>
				<c:choose>
					<c:when test="${role}">
						<a type="button" class="btn btn-primary"
							href="/getallticketbooking">Click Here To Go Back</a>
					</c:when>
					<c:otherwise>
						<a type="button" class="btn btn-primary"
							href="/userinfo">Click Here To Go Back</a>
					</c:otherwise>
				</c:choose>

			</div>
			<div class="inner-page-2">
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