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
	<h1> Search form</h1>
	<form action="/search/result" method="GET">
		<div>
		<label> Search for</label>
		<input type="text" name="keyword" />
		</div>
		<button type="submit"> Search</button>
		
	
	</form>
	
</body>
</html>