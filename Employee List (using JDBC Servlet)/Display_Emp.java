package myPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Display_Emp
 */
@WebServlet("/Display_Emp")
public class Display_Emp extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("after get");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			Statement st=con.createStatement();	          
			ResultSet rs = st.executeQuery("SELECT * FROM empinfo");

	            out.println("<!DOCTYPE html>");
	            out.println("<html>");
	            out.println("<head><title>Employee List</title></head>");
	            out.println("<body>");
	            out.println("<h1>Employee List</h1>");
	            out.println("<a href='/ServletProject/Employee List/addEmp.html'>Add New Employee</a><br><br>");
	            out.println("<table border='1'>");
	            out.println("<tr><th>ID</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");

	            while (rs.next()) {
	                out.println("<tr>");
	                out.println("<td>" + rs.getString("id") + "</td>");
	                out.println("<td>" + rs.getString("name") + "</td>");
	                out.println("<td>" + rs.getString("password") + "</td>");
	                out.println("<td>" + rs.getString("email") + "</td>");
	                out.println("<td>" + rs.getString("country") + "</td>");
	                out.println("<td><a href='Edit_Emp?id=" + rs.getString("ID") + "'>Edit</a></td>");
	                out.println("<td><a href='Delete_Emp?id=" + rs.getString("ID") + "'>Delete</a></td>");
	                out.println("</tr>");
	            }
	            out.println("</table>");
	            out.println("</body>");
	            out.println("</html>");
	        } catch (Exception e) {
	            e.printStackTrace(out);
	        }
	    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
