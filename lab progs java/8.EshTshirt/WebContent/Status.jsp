<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Status</title>
</head>
<body>
	
		<%
			String i = request.getParameter("id");
			if(i!=null){
				if(i.equals("1"))
				{
					out.println("<h3>Thank you for buying the T Shirt</h3>");
					/* String orderno = request.getParameter("orderno");
					out.println("<h3>Your order Number is: " + orderno + "</h3>"); */
				}
				else if(i.equals("2"))
				{
					out.println("<h3>Sorry! We couldn't complete your order</h3>");
				}
				else{
					out.println("<h3>Sorry! We donno what went wrong</h3>");
				}
			}
		
		%>
		<br>
		<hr>
		<br>
		<p>See all orders <a href="Display.jsp">here</a></p>
	
</body>
</html>