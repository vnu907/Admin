<%@ include file="jspf/header.jspf"%>
<title>All Seat</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="admin-customer-page">
					<c:choose>
						<c:when test="${empty seatList}">
							<div class="flightDataAvailable">
								<p>Sorry No Seat Details Available</p>
							</div>
						</c:when>
						<c:otherwise>
							<table>
								<tr>
									<th>Seat Class</th>
									<th>Flight Id</th>
									<th>Price For Booking</th>
									<th>Price For Cancel</th>
									<th>Tax</th>
									<th></th>
									<th></th>
								</tr>
								<c:forEach items="${seatList}" var="seat">
									<tr>
										<td>${seat.seatclass}</td>
										<td>${seat.flightid}</td>
										<td>${seat.priceforbooking}</td>
										<td>${seat.priceforcancel}</td>
										<td>${seat.tax}</td>
										<td><a type="button" class="btn btn-success"
											href="/updateseat?id=${seat.id}">Update</a></td>
										<td><a type="button" class="btn btn-danger"
											href="/deleteseat?id=${seat.id}">Delete</a></td>
									</tr>

								</c:forEach>
							</table>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
			<div class="inner-page-2">
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