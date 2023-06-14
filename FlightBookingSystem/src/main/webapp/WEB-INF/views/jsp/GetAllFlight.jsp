<%@ include file="jspf/header.jspf"%>
<title>All Flight</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page-exception">
				<div class="admin-customer-page">
					<c:choose>
						<c:when test="${empty flightList}">
							<div class="flightDataAvailable">
								<p>Sorry No Flight Details Available</p>
							</div>
						</c:when>
						<c:otherwise>
							<table>
								<tr>
									<th>Flight Icon</th>
									<th>Flight Number</th>
									<th>Flight Name</th>
									<th>Source</th>
									<th>Destination</th>
									<th>Distance</th>
									<th>Days</th>
									<th>Luggage</th>
									<th>Departure</th>
									<th>Arrival</th>
									<th>Duration</th>
									<th></th>
									<th></th>
								</tr>
								<c:forEach items="${flightList}" var="flightDetails">
									<tr>
										<td><img class="admin-flight-icon"
											src="images/icons/${flightDetails.imageName}" /></td>
										<td>${flightDetails.flightNumber}</td>
										<td>${flightDetails.flightName}</td>
										<td>${flightDetails.source}</td>
										<td>${flightDetails.destination}</td>
										<td>${flightDetails.distance}</td>
										<td>${flightDetails.days}</td>
										<td>${flightDetails.luggage}</td>
										<td>${flightDetails.departure}</td>
										<td>${flightDetails.arrival}</td>
										<td>${flightDetails.duration}</td>
										<td><a type="button" class="btn btn-success"
											href="/updateflight?id=${flightDetails.flightId}">Update</a></td>
										<td><a type="button" class="btn btn-danger"
											href="/deleteflight?id=${flightDetails.flightId}">Delete</a></td>
									</tr>
								</c:forEach>
							</table>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="jspf/footer.jspf"%>
</body>
</html>