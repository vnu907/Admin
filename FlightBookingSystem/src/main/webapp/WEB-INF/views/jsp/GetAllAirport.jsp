<%@ include file="jspf/header.jspf"%>
<title>All Airport Data</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="admin-customer-page">
					<c:choose>
						<c:when test="${empty airportList}">
							<div class="flightDataAvailable">
								<p>Sorry No Airport Details Available</p>
							</div>
						</c:when>
						<c:otherwise>
							<table>
								<tr>
									<th>Airport id</th>
									<th>Airport Name</th>
									<th>Flight id</th>
									<th>Country</th>
									<th>City</th>
									<th></th>
									<th></th>
								</tr>
								<c:forEach items="${airportList}" var="airport">
									<tr>
										<td>${airport.id}</td>
										<td>${airport.nameofairport}</td>
										<td>${airport.flightid}</td>
										<td>${airport.country}</td>
										<td>${airport.city}</td>
										<td><a type="button" class="btn btn-success"
											href="/updateairport?id=${airport.id}">Update</a></td>
										<td><a type="button" class="btn btn-danger"
											href="/deleteairport?id=${airport.id}">Delete</a></td>
									</tr>

								</c:forEach>
							</table>
						</c:otherwise>
					</c:choose>
				</div>
				<a type="button" class="btn btn-primary" href="/addairport">Add
					Airport Data</a>
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