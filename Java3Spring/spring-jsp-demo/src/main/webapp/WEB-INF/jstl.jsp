<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="container mt-5">
	<h1>JSTL demo</h1>
	<h2> Variables</h2>
	<h3 class="redtext"> Name: ${jspName }</h3>
	<h3> Happiness: <c:out value="${jspHappiness }"/></h3>
	<h3> <c:out value="${hackerCode }"/></h3>

	<h2> If-condition</h2>
	<c:if test="${jspHappiness > 5 }">
		<h3> I am happy</h3>
	</c:if>
	
	<h2> If-else condition</h2>
	<c:choose>
		<c:when test="${jspName.length()> 5 }">
			<h3> The name is long</h3>
		</c:when>
		<c:otherwise>
			<h3> The name is short</h3>
		</c:otherwise>
	</c:choose>
	
	<h2> for-loop</h2>
	<ol>
	<c:forEach var="eachSkill" items="${skillList }">
		<li><c:out value="${eachSkill }" /></li>
	</c:forEach>
	</ol>
	</div>
	
</body>
</html>