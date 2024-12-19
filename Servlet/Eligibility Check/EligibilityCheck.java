package com.MyPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EligibleCheck
 */
@WebServlet("/EligibleCheck")
public class EligibleCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EligibleCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String Fname=request.getParameter("Fname");
		String Lname=request.getParameter("Lname");
		int Age=Integer.parseInt(request.getParameter("Age"));
		String res="";
		if(Age>=18)
			res=Fname+" "+Lname+" You are eligible for voting";
		else
			res=Fname+" "+Lname+"You are not eligible for voting. You can vote after "+(18-Age)+"Years";
		out.print("<b>"+res);
		
		//-----getparameternames----
		out.print("<h2> Using getParameter Name Method</h2><br>");
		Enumeration<String>Eob=request.getParameterNames();
		while(Eob.hasMoreElements()) {
			String str=Eob.nextElement();
			out.println(str+"---->"+request.getParameter(str)+"<br>");
			
		}
		out.print("<h2> Using getParameter Names method></h2><br>");
		Enumeration<String>paraname=request.getParameterNames();
		while(paraname.hasMoreElements()) {
			String pname=paraname.nextElement();
			String value=request.getParameter(pname);
			out.println(pname+":"+value+"<br>");	
		}
		//-----getparametermap----
		
		out.println("<b>Using get parameter map method </b><br>");
		Map<String,String[]>map=request.getParameterMap();
		Set<String>paramap=map.keySet();
		for(String p:paramap) {
			out.println(p+":");
			String[] value=map.get(p);
			System.out.println(value.length);
			for(String v:value) {
				out.println(v+"<br>");
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
