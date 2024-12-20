package MyPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigDemo
 */
//@WebServlet("/ConfigDemo")
@WebServlet(
		urlPatterns= {"/MyPack.Config"},
		initParams= {
				@WebInitParam(name="Bank",value="SBI"),
				@WebInitParam(name="password",value="2024")
		}
		)
public class ConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<h1> Servlet config Interface...</h1>");
		ServletConfig ob=getServletConfig();
		String name=ob.getServletName();
		out.println("<h2> Working in servlet "+name+"</h2>");
		out.println("<font color=red> Hello user your otp for "+ob.getInitParameter("Bank")+" is");
		String pass=ob.getInitParameter("password");
		if(pass.equals("2024"))
			out.println("9978");
		else
			out.println("Please enter correct password");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
