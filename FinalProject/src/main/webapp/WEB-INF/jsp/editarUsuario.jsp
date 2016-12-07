<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Manager</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<spring:url value="/resources/css/home.css"/>" type="text/css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	<jsp:include page="../jsp/fragments/header.jsp"></jsp:include>

	<div class="container">

		<div class="row">
			<h1>Crear nuevo usuario:</h1>
		</div>

		<spring:url value="/Users/GuardarCambios/${user.id}" var="formUrl" />

		<form:form id="forma" action="${formUrl}" method="POST"
			modelAttribute="user">

			<div class="row">

				<div class="form-group">
					<label for="username">Username:</label>
					<form:input path="username" cssClass="form-control" id="username" value="${user.username}"/>
				</div>

				<div class="form-group">
					<label for="hobbies">Hobbies:</label>
					<form:input path="hobbies" cssClass="form-control"
						id="hobbies" value="${user.hobbies}"/>
				</div>

				<button id="submitBtn" type="submit" class="btn btn-default">Submit</button>

			</div>

		</form:form>



	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script
		src="<spring:url value="/resources/javascript/bootstrap.min.js"/>"></script>
	<script
		src="<spring:url value="/resources/javascript/bootstrap-select.min.js"/>"></script>
	<script>
		$(document).ready(function() {
			checkField();
		});

		function checkField() {
			var value = $("#codigo").val();
			if (value == "") {
				$("#submitBtn").prop("disabled", true);
			} else {
				$("#submitBtn").prop("disabled", false);
			}
		}
	</script>
</body>
</html>