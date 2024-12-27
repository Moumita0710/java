package MyPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AllAttribute
 */
@WebServlet("/AllAttribute")
public class AllAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		ServletContext con=getServletContext();
		con.setAttribute("Application", lname);
		if(fname.equals("Sachin"))
		{
			request.getRequestDispatcher("ShowAttribute").forward(request,response);
		}
		else
		{
			out.println("Please type name other than Sachin");
			request.getRequestDispatcher("AllAttribute.html").include(request,response);
		}
		out.println("Please click below link for next servlet");
		out.println("<br><a href='ShowAttribute'>Next</a>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
