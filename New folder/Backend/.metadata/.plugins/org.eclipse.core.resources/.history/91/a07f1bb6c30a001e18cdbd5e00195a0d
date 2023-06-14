<%@ include file="jspf/header.jspf"%>
<title>Add User Details</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="container-edit-user">
					<h3>Add User Details</h3>
					<form:form method="post" modelAttribute="customer">
						<form:hidden path="customerid" />

						<div class="form-group">
							<div class="row">
								<div class="col">
									<form:label path="firstname" name="">First Name</form:label>
								</div>
								<div class="col">
									<form:input path="firstname" type="text" class="form-control"
										required="true" />
									<form:errors path="firstname" cssClass="text-warning" />
								</div>
							</div>

							<div class="row pt-3">
								<div class="col">
									<form:label path="lastname">Last Name</form:label>
								</div>
								<div class="col">
									<form:input path="lastname" type="text" class="form-control"
										required="true" />
									<form:errors path="lastname" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="emailid">Email</form:label>
								</div>
								<div class="col">
									<form:input path="emailid" type="text" class="form-control"
										required="true" />
									<form:errors path="emailid" cssClass="text-warning" />
								</div>

							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="username">User Name</form:label>
								</div>
								<div class="col">
									<form:input path="username" type="text" class="form-control"
										required="true" />
									<form:errors path="username" cssClass="text-warning" />
								</div>

							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="enabled">Enabled</form:label>
								</div>
								<div class="col">
									<form:select path="enabled" class="form-control">
										<form:option value="true" label="Enabled" />
										<form:option value="false" label="Disabled" />
									</form:select>
									<form:errors path="enabled" cssClass="text-warning" />
								</div>

							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="phonenumber">Phone Number</form:label>
								</div>
								<div class="col">
									<form:input path="phonenumber" type="text" class="form-control"
										pattern="^([789])([0-9]{9})$" title="Enter valid phonenumber"
										required="true" />
									<form:errors path="phonenumber" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="password">Password</form:label>
								</div>
								<div class="col">
									<form:input path="password" type="text" class="form-control"
										required="true" />
									<form:errors path="password" cssClass="text-warning" />
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
							<div class="form-row pt-4">
								<div class="">
									<button type="submit" value="Add" id="submit"
										class="btn btn-success">Add User</button>
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