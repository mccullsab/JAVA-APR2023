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
	<h1>Donation Loop</h1>
	<table>
		<thead>
			<tr>
				<th> ID </th>
				<th> donation name </th>
				<th> Donor </th>
				<th> Quantity </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="eachDonation" items="${donationList }" >
			<tr>
				<td> <c:out value="${eachDonation.id }" /> </td>
				<td> <a href="/donations/${eachDonation.id }"><c:out value="${eachDonation.donationName }" /> </a></td>
				<td> <c:out value="${eachDonation.donor }" /> </td>
				<td> <c:out value="${eachDonation.quantity }" /> </td>
			</tr>
			</c:forEach>
		</tbody>
		
	</table>


</body>
</html>