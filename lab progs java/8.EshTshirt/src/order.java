
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// create database java8;
// use java8;
//create table tshirt ( orderno int not null auto_increment, accessories varchar(20), tag varchar(30), colour varchar(10), chest varchar(10), PRIMARY KEY (orderno) );
//alter table tshirt AUTO_INCREMENT=100;  

/**
 * Servlet implementation class Order
 */
@WebServlet("/order")
public class order extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public order() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java8", "apeksha", "password");
			String accessories = request.getParameter("accessories");
			String tag = request.getParameter("tag");
			String colour = request.getParameter("colour");
			String chest = request.getParameter("chest");
			
			if (conn != null) {
				Statement st = conn.createStatement();

				int rs = st.executeUpdate("insert into tshirt (accessories, tag, colour, chest) values('" + accessories + "','" + tag + "','" +  colour + "','" + chest + "')");
				st.close();
				conn.close();
				response.sendRedirect("Status.jsp?id=1");

			}
			else{
				response.sendRedirect("Status.jsp?id=2");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			response.sendRedirect("Status.jsp?status=1");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
