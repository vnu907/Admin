<%@ include file="jspf/header.jspf"%>
<title>Search Result</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<c:choose>
					<c:when test='${flightData}'>
						<div class="flightDataAvailable">
							<p>Sorry No Any Flights Available</p>
						</div>
					</c:when>
					<c:otherwise>
						<div class="search-header">
							<div class="child-search-header1_1">Departure</div>
							<div class="child-search-header1_2">Duration</div>
							<div class="child-search-header1_3">Arrival</div>
						</div>
						<c:forEach items="${searchedFlightDetailList.flightList}"
							var="flightDetails" varStatus="status">
							<div class="spidy-hook">
								<div class="ticket_search">
									<div class="div-ticket1">
										<img class="child-div-ticket-1_1_search"
											src="images/icons/${flightDetails.imageName}" />
										<p class="child-div-ticket-1_2_search">${flightDetails.flightName}</p>
									</div>
									<div class="div-ticket2">
										<p class="child-div-t1_search">${flightDetails.source}</p>

										<h3 class="child-div-t2_search">
											${flightDetails.returnDepartureHourAndMinute()}</h3>
									</div>
									<div class="div-ticket3">
										<p class="child-div-ticket-3_1_search">${flightDetails.duration}</p>
										<hr class="child-div-ticket-3_4_search">
										<span class="material-icons child-div-ticket-3_2_search">
											flight</span>
										<p class="child-div-ticket-3_3_search">Non Stop</p>
									</div>
									<div class="div-ticket4">
										<p class="child-div-t1_search">${flightDetails.destination}</p>
										<h3 class="child-div-t2_search">${flightDetails.returnArrivalHourAndMinute()}</h3>
									</div>
									<div class="div-ticket5">
										<h3 class="child-div-ticket5_1_search">&#8377
											${searchedFlightDetailList.seatList[status.index].priceforbooking}</h3>
										<div class="btn-dropdown-de">
											<a class="drop-click child-div-ticket5_2_search">More
												Details</a>
										</div>
									</div>
								</div>
								<div class="ticket-drop">
									<div class="ticket">
										<div class="div-ticket6">
											<c:choose>
												<c:when
													test="${flightDetails.extraFacility.contains('Wifi')}">
													<span><img
														src="https://img.icons8.com/material/24/000000/wifi--v1.png" /></span>
												</c:when>
												<c:otherwise>
													<span><img
														src="https://img.icons8.com/material/24/000000/wifi-off.png" /></span>
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when
													test="${flightDetails.extraFacility.contains('Meal')}">
													<img
														src="https://img.icons8.com/material/24/000000/food-bar.png" />
												</c:when>
												<c:otherwise>
													<img
														src="https://img.icons8.com/material/24/000000/no-food.png" />
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when
													test="${flightDetails.extraFacility.contains('Plug')}">
													<img
														src="https://img.icons8.com/material-outlined/24/000000/phone-disconnected.png" />
												</c:when>
												<c:otherwise>
													<img
														src="https://img.icons8.com/material/24/000000/no-phones.png" />
												</c:otherwise>
											</c:choose>
										</div>
										<div class="div-ticket7">
											<span>M</span>&nbsp; <span>T</span>&nbsp; <span>W</span>&nbsp;
											<span>Th</span>&nbsp; <span>F</span>&nbsp; <span>S</span>&nbsp;
											<span>Su</span>
											<div>
												<c:choose>
													<c:when test="${flightDetails.days.contains('Mon')}">
														<img src="images/icons/check-square-fill.svg" />
													</c:when>
													<c:otherwise>
														<img src="images/icons/check-square.svg" />
													</c:otherwise>
												</c:choose>
												<c:choose>
													<c:when test="${flightDetails.days.contains('Tue')}">
														<img src="images/icons/check-square-fill.svg" />
													</c:when>
													<c:otherwise>
														<img src="images/icons/check-square.svg" />
													</c:otherwise>
												</c:choose>
												<c:choose>
													<c:when test="${flightDetails.days.contains('Wed')}">
														<img src="images/icons/check-square-fill.svg" />
													</c:when>
													<c:otherwise>
														<img src="images/icons/check-square.svg" />
													</c:otherwise>
												</c:choose>
												<c:choose>
													<c:when test="${flightDetails.days.contains('Thrus')}">
														<img src="images/icons/check-square-fill.svg" />
													</c:when>
													<c:otherwise>
														<img src="images/icons/check-square.svg" />
													</c:otherwise>
												</c:choose>
												<c:choose>
													<c:when test="${flightDetails.days.contains('Fri')}">
														<img src="images/icons/check-square-fill.svg" />
													</c:when>
													<c:otherwise>
														<img src="images/icons/check-square.svg" />
													</c:otherwise>
												</c:choose>
												<c:choose>
													<c:when test="${flightDetails.days.contains('Sat')}">
														<img src="images/icons/check-square-fill.svg" />
													</c:when>
													<c:otherwise>
														<img src="images/icons/check-square.svg" />
													</c:otherwise>
												</c:choose>
												<c:choose>
													<c:when test="${flightDetails.days.contains('Sun')}">
														<img src="images/icons/check-square-fill.svg" />
													</c:when>
													<c:otherwise>
														<img src="images/icons/check-square.svg" />
													</c:otherwise>
												</c:choose>
											</div>

										</div>
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
											<p class="child-div-t4">${searchedFlightDetailList.airportSourceList[status.index].nameofairport}</p>
										</div>
										<div class="div-ticket3">
											<p class="child-div-ticket-3_1">${flightDetails.duration}</p>
											<hr class="child-div-ticket-3_4">
											<span class="material-icons child-div-ticket-3_2">flight</span>
											<p class="child-div-ticket-3_3">Non Stop</p>
										</div>
										<div class="div-ticket4">
											<p class="child-div-t1">${flightDetails.destination}</p>
											<h3 class="child-div-t2">${flightDetails.returnArrivalHourAndMinute()}</h3>
											<p class="child-div-t3">${flightDetails.getArrivalFormatedDate()}</p>
											<p class="child-div-t4">${searchedFlightDetailList.airportDestinationList[status.index].nameofairport}</p>
										</div>

										<div class="div-ticket8">
											<span>Base Fare :- &#8377
												${searchedFlightDetailList.seatList[status.index].priceforbooking}</span>
											<br> <span>Tax :- &#8377
												${searchedFlightDetailList.seatList[status.index].tax}</span> <br>
											<span>Other Discounts :- No</span> <br> <span>Total
												Fare :- &#8377
												${searchedFlightDetailList.seatList[status.index].priceforbooking
											+ searchedFlightDetailList.seatList[status.index].tax}</span>
											<br>
										</div>
										<div class="div-ticket9">
											<span><i class="fa-solid fa-bag-shopping"></i> Cabin:
												7 kg</span> <br> <span><i
												class="fa-solid fa-suitcase-rolling"></i> Luggage:
												${flightDetails.luggage}</span> <br>
										</div>
										<div class="div-ticket10">
											<span>Cancellation Cost :- &#8377
												${searchedFlightDetailList.seatList[status.index].priceforcancel}</span>
										</div>
										<div class="div-ticket12">
											<span>Note:- Due to Covid, flights schedule may
												change. Plan your journey according to that.</span>
										</div>
										<div class="div-ticket13">
											<a href="/moredetails?id=${flightDetails.flightId}"
												class="btn btn-primary">Book Ticket</a>
										</div>
									</div>


								</div>
							</div>
						</c:forEach>
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