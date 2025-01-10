package MyPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertData
 */
@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int status=0;
		String empno=request.getParameter("empno");
		String ename=request.getParameter("ename");
		String sal=request.getParameter("sal");
		String deptno=request.getParameter("deptno");
		out.print("empno="+empno);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("after get");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			Statement st=con.createStatement();
			PreparedStatement ps=con.prepareStatement("insert into empinfo(empno,ename,sal,deptno) values (?,?,?,?)");
			ps.setString(1, empno);
			ps.setString(2, ename);
			ps.setString(3, sal);
			ps.setString(4, deptno);
			status=ps.executeUpdate();
			con.close();
			out.println("<b>Record inserted</b>");
		}
		catch(Exception e) {
			System.out.println(e);
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
