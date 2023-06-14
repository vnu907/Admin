<%@ include file="jspf/header.jspf"%>
<title>Edit Airport Details</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="container-edit-user">
					<h3>Edit Airport Details</h3>

					<form:form method="post" modelAttribute="airport">
						<form:hidden path="id" />
						<form:hidden path="flightid" />

						<div class="form-group">
							<div class="row">
								<div class="col">
									<form:label path="nameofairport" name="">Name Of Airport</form:label>
								</div>
								<div class="col">
									<form:input path="nameofairport" type="text"
										class="form-control" required="true" />
									<form:errors path="nameofairport" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="flightid">Flight Id</form:label>
								</div>
								<div class="col">
									<form:input path="flightid" type="text" class="form-control"
										disabled="true" />
									<form:errors path="flightid" cssClass="text-warning" />
								</div>
							</div>

							<div class="row pt-3">
								<div class="col">
									<form:label path="country">Country</form:label>
								</div>
								<div class="col">
									<form:input path="country" type="text" class="form-control"
										required="true" />
									<form:errors path="country" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="city">City</form:label>
								</div>
								<div class="col">
									<form:input path="city" type="text" class="form-control"
										required="true" />
									<form:errors path="city" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-4">
								<div class="">
									<button type="submit" value="Update" id="submit"
										class="btn btn-success">Update</button>
								</div>
							</div>
						</div>
					</form:form>
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