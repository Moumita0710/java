package beans;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class First extends TagSupport{
	public First() {
		
	}
	public int doStartTag() throws JspException{
		JspWriter out=pageContext.getOut();
		try {
			out.println("<h1>Testing cutom tag </h1>");
		}catch(IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
		
	}

}
