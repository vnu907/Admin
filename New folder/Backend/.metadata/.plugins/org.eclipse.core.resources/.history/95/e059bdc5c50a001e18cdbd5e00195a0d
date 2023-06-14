<%@ include file="jspf/header.jspf"%>
<title>All Customer</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="admin-customer-page">
					<c:choose>
						<c:when test="${empty customerList}">
							<div class="flightDataAvailable">
								<p>Sorry No Customer Details Available</p>
							</div>
						</c:when>
						<c:otherwise>
							<table>
								<tr>
									<th>FirstName</th>
									<th>LastName</th>
									<th>UserName</th>
									<th>Email Id</th>
									<th>Password</th>
									<th>Phone Number</th>
									<th>Country</th>
									<th></th>
									<th></th>
								</tr>
								<c:forEach items="${customerList}" var="customer">
									<tr>
										<td>${customer.firstname}</td>
										<td>${customer.lastname}</td>
										<td>${customer.username}</td>
										<td>${customer.emailid}</td>
										<td>${customer.password}</td>
										<td>${customer.phonenumber}</td>
										<td>${customer.country}</td>
										<td><a type="button" class="btn btn-success"
											href="/updatecustomer?id=${customer.customerid}">Update</a></td>
										<td><a type="button" class="btn btn-danger"
											href="/deletecustomer?id=${customer.customerid}">Delete</a></td>
									</tr>

								</c:forEach>
							</table>
						</c:otherwise>
					</c:choose>
					<a type="button" class="btn btn-primary" href="/addcustomer">Add
						Customer</a>
				</div>
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