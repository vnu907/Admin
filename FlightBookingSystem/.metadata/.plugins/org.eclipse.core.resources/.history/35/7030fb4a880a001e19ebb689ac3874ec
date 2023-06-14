<%@ include file="jspf/header.jspf"%>
<title>Contact Us</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
			<c:choose>
			<c:when test='${isSuccess}'>
				<p>Message Sent Successfully</p>
			</c:when>
		</c:choose>		
			<div class="inner-page-sub-1">
				<form:form method="post" modelAttribute="contact">
						<div class="form-group">
							<div class="">
								<form:label path="firstname" name="">First Name</form:label>
								<form:input path="firstname" type="text" class="form-control"
									required="true" placeholder="Enter Firstname"/>
								<form:errors path="firstname" cssClass="text-warning" />
							</div>
						</div>
						<div class="form-row">
							<div class="">
								<form:label path="lastname">Last Name</form:label>
								<form:input path="lastname" type="text" class="form-control"
									required="true" placeholder="Enter Lastname"/>
								<form:errors path="lastname" cssClass="text-warning" />
							</div>
						</div>
						<div class="form-row">
							<div class="">
								<form:label path="email">Email</form:label>
								<form:input path="email" type="text" class="form-control"
									required="true" placeholder="Enter your email"/>
								<form:errors path="email" cssClass="text-warning" />
							</div>
							<div class="">
								<form:label path="subject">Subject</form:label>
								<form:input  path="subject" type="textarea" class="form-control text-area-design"
									required="true" placeholder="Enter Message Here..."/>
								<form:errors path="subject" cssClass="text-warning" />
							</div>
						</div>
						<div class="form-row pt-4">
							<div class="">
								<button type="submit" value="submit" id="submit"
									class="btn btn-primary">Submit</button>
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