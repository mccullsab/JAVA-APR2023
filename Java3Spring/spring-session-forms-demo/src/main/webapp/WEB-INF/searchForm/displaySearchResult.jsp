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
	<h1> You searched for 
	<c:out value="${keyword }" />
	</h1>
</body>
</html>