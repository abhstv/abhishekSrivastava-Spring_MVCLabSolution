<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<title>Save Student</title>
</head>
<body>
	<div class="container">

		<hr>

		<p class="h4 mb-4">Add Student</p>

		<form action="save" method="POST">

			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="studentId" value="${Student.studentId}" />

			<div class="form-inline">
				<input type="text" name="studentName" value="${Student.studentName}"
					class="form-control mb-4 col-4" placeholder="Name">
			</div>

			<div class="form-inline">
				<input type="text" name="department" value="${Student.department}"
					class="form-control mb-4 col-4" placeholder="Department">
			</div>

			<div class="form-inline">
				<input type="text" name="country" value="${Student.country}"
					class="form-control mb-4 col-4" placeholder="Country">
			</div>
			<button type="submit" class="btn btn-info col-2">Submit</button>

		</form>

		<hr>
		<a href="/CollegeFest/">Back to Student List</a>

	</div>


</body>
</html>