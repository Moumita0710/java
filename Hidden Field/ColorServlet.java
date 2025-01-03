package MyPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ColorServlet
 */
@WebServlet("/ColorServlet")
public class ColorServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String color=request.getParameter("color");
		out.println("<b>testing</b>");
		out.println("<b> favourite color is</b> <font color="+color+">color</font>");
		out.println("<form action='GetColor'>");
		out.println("<input type='hidden' name='mycolor' value='"+color+"'>");
		out.println("<input type='hidden' name='mysize' value='5'>");
		out.println("<input type='submit'  value='change color'>");
		out.println("</form>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}