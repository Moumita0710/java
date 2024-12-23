package MyPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReqLink
 */
@WebServlet("/ReqLink")
public class ReqLink extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReqLink() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fname");
		out.println("<b>Hello </b>"+fname);
		out.println("<br>Please click below button to know your ID");
		out.println("<br> Only Moumita id generated");
		out.println("<br> <a href='ReqServ2'>Click</a>");
		if(fname.equals("Moumita"))
		{
			RequestDispatcher req=request.getRequestDispatcher("ReqServ2");
			req.forward(request, response);
		}
		else
		{
			RequestDispatcher req=request.getRequestDispatcher("request.html");
			req.include(request, response);
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
