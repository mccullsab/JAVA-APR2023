<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring demo</title>
</head>
<body>
	<h1> Details Pages</h1>
	<h3> ID: <c:out value="${oneDonation.id }"></c:out></h3>
	<h3> Donation name: <c:out value="${oneDonation.donationName }"></c:out></h3>
	<h3> Donor: <c:out value="${oneDonation.donor }"></c:out></h3>
	<h3> quantiy: <c:out value="${oneDonation.quantity }"></c:out></h3>
	<h3> Description: <c:out value="${oneDonation.description }"></c:out></h3>
</body>
</html>