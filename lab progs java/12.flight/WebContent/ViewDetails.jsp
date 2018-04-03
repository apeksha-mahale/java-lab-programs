<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flight Details</title>
</head>
<body>
	<h3>Welcome <% out.print(request.getParameter("name")); %></h3>
	<h4>Your booking details are: </h4>
	
	<p> Name: <% out.print(request.getParameter("name")); %></p>
	<p> Phone: <% out.print(request.getParameter("phone")); %></p>
	<p> Flight Number: <% out.print(request.getParameter("flight")); %></p>
	<p> Seat Number: <% out.print(request.getParameter("seat")); %></p>
	<p> Date: <% out.print(request.getParameter("date")); %></p>
</body>
</html>