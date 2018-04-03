<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ORDERS</title>
</head>
	<table>
		<tr>
			<th>Order No.</th>
			<th>Accessory</th>
			<th>Tagline</th>
			<th>Chest Pocket</th>
			<th>Colour</th>
		</tr>
	<body>
	<%
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java8", "apeksha", "password");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("Select * from tshirt");
		while (rs.next()) {
			out.println("<tr>");
			out.println("<td>" + rs.getInt(1) + "</td>");
			out.println("<td>" + rs.getString(2) + "</td>");
			out.println("<td>" + rs.getString(3) + "</td>");
			out.println("<td>" + rs.getString("colour") + "</td>");
			out.println("<td>" + rs.getString("chest") + "</td>");
			out.println("</tr>");
		}
	%>
	</table>

</body>
</html>