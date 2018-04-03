<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Airline Reservation</title>
</head>
<body>
	<h3>Flights running on: <% out.print(request.getParameter("day")); %></h3>

	<table>
	<tr>
		<th>Flight Number</th>
		<th>Airline</th>
		<th>Days</th>
	</tr>
	<% 
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java12", "apeksha", "password");
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from flight where weekdays like '"+ request.getParameter("day") + "'");
		while(rs.next()){
			out.println("<tr>");
			out.println("<td>" + rs.getString(1) +"</td>");
			out.println("<td>" + rs.getString(2) +"</td>");
			out.println("<td>" + rs.getString(3) +"</td>");
			out.println("</tr>");
		}
	%>
	</table>
</body>
</html>