<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flight Reservation</title>
</head>
<body>
	<h3>Flight Resevation</h3>
	<form method="post" action="Reserve">
		<label>Flight</label>
		<select name="flight">
			<%
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Java12", "apeksha", "password");
				Statement st= conn.createStatement();
				
				ResultSet rs = st.executeQuery("select * from flight");
				while(rs.next()){
					out.print("<option value='" + rs.getString(1)+ "'>" + rs.getString(1) +"</option>");
				}
			%>
		</select>
		
		<br>
		<label>Date</label>
		<input type="date" name="date" placeholder="YYYY-MM-DD" >
		
		<br>
		<label>Name: </label>
		<input type="text" name="name">
		
		<br>
		<label>Phone: </label>
		<input type="text" name="phone">
		
		<br>
		<button type="submit">Reserve</button>
	</form>
	
	
	<hr>
	<form method="post" action="check.jsp">
		Check flights running on: 
		<select name="day">
			<option value="M______">Monday</option>
			<option value="_T_____">Tuesday</option>
			<option value="__W____">Wednesday</option>
			<option value="___T___">Thursday</option>
			<option value="____F__">Friday</option>
			<option value="_____S_">Saturday</option>
			<option value="______S">Sunday</option>
		</select>
		<button type="submit">Check</button>
	</form>
</body>
</html>