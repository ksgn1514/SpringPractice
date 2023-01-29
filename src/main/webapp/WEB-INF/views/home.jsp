<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<title>Home</title>
	</head>

	<body>
		<h1>
			Hello world!
		</h1>

		<P>  The time on the server is ${serverTime}. </P>
		<form action="login_check" method="post">
  			ID: <input type="text" name="login_id"><br>
  			PS: <input type="password" name="login_password"><br>
  			<input type="submit" value="Submit">
		</form>
	</body>
</html>
