

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/** SQL File
 * 
 *  create database java9;
 *  use java9;
 *  create table Telephone_Directory (phone int not null primary key, name varchar(32), address varchar(100), company varchar(15), pincode varchar(10));
 *  desc Telephone_Directory;
 *  insert into Telephone_Directory values (1234, 'Mahesh', 'BLR', 'RITB', '560000');
 *  insert into Telephone_Directory values (83948, 'Satya', 'Redmond', 'MS', '540000');
 *  insert into Telephone_Directory values (24556, 'Sunder', 'Mountain View', 'Google', '74000');
 *  insert into Telephone_Directory values (541253, 'Eshwaran', 'Apple Park', 'Apple', '90000');
 *  insert into Telephone_Directory values (425234, 'Ramesh', 'mg road', 'TCS', '320000');
 *  select * from Telephone_Directory;
 *  
 */

/**
 * Servlet implementation class Telephone
 */
@WebServlet("/Telephone")
public class Telephone extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Telephone() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html>\n" +
		         "<head><title>Telephone Directory Application</title></head>\n"+
		         "<body>\n" +
		         "<h1 align=\"center\">Telephone Directory Application</h1>\n");
		

		String method = request.getParameter("method");
		String search_string = request.getParameter("search_string");
		
//		out.println("<p>" + method +" : " + search_string +"</p>");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java9", "apeksha", "password");
			
			Statement st = conn.createStatement();
			
			if(method.equals("phone")){
				ResultSet rs = st.executeQuery("select * from Telephone_Directory where phone like '%" + search_string+ "%'");
				out.println("<table>");
				out.println("<tr> <th>Phone Number</th> <th>Name</th> <th>Address</th> <th>Company</th> <th>Pincode</th> </tr>");
				while(rs.next()){
					out.println("<tr>");
					out.println("<td>" + rs.getString(1) + "</td>");
					out.println("<td>" + rs.getString(2) + "</td>");
					out.println("<td>" + rs.getString(3) + "</td>");
					out.println("<td>" + rs.getString(4) + "</td>");
					out.println("<td>" + rs.getString(5) + "</td>");
					out.println("</tr>");
				}
				out.println("</table>");
			}
			else if(method.equals("name")){
				ResultSet rs = st.executeQuery("select * from Telephone_Directory where name like '%" + search_string+ "%'");
				out.println("<table>");
				out.println("<tr> <th>Phone Number</th> <th>Name</th> <th>Address</th> <th>Company</th> <th>Pincode</th> </tr>");
				while(rs.next()){
					out.println("<tr>");
					out.println("<td>" + rs.getString(1) + "</td>");
					out.println("<td>" + rs.getString(2) + "</td>");
					out.println("<td>" + rs.getString(3) + "</td>");
					out.println("<td>" + rs.getString(4) + "</td>");
					out.println("<td>" + rs.getString(5) + "</td>");
					out.println("</tr>");
				}
				out.println("</table>");
			}
			else{
				out.println("Something is wrong");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
