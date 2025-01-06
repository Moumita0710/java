      package MyPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class FilterApp
 */
@WebFilter("/FilterApp")
public class FilterApp extends HttpFilter implements Filter {
     FilterConfig config;
     public void init(FilterConfig fConfig) throws ServletException {
 	this.config=fConfig;
 	}

  
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		String con=config.getInitParameter("construction");
		System.out.println(con);
		if(con.equals("yes")) {
			out.println("<br> <font color='red'> this site is under construction</font><br>");
			
		}
		else {
			out.println("<br><b>Servlet via Filter</b><br>");
			chain.doFilter(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	
}
