package MyPack.CookieJan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiePro
 */
@WebServlet("/CookiePro")
public class CookiePro extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname=request.getParameter("pname");
		String qty=request.getParameter("qty");
		String add=request.getParameter("add");
		String list=request.getParameter("list");
		PrintWriter out=response.getWriter();
		System.out.println(add);
		if(add!=null) {
			Cookie cookie=new Cookie(pname,qty);
			response.addCookie(cookie);
			response.sendRedirect("CookieHtml/CookiePro.html");
		}
		else if(list!=null) {
			Cookie cookie[]=request.getCookies();
			for(Cookie c:cookie) {
				out.println(c.getName()+"\t:\t"+c.getValue()+"<br><br>");
			}
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
