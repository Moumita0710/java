<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%session.invalidate(); %>
<%HttpSession nsession=request.getSession(false);
String color=(String)pageContext.getAttribute("color",PageContext.APPLICATION_SCOPE);
out.println(color);
int size=5;
if(nsession!=null){
	String str=(String)pageContext.getAttribute("format",PageContext.SESSION_SCOPE);
	color=(String)pageContext.getAttribute("color",pageContext.APPLICATION_SCOPE);
	size=Integer.parseInt(str);
	out.println("font size="+size+" color="+color+">Entered font size is(session scope)"+size+"</font>");
}
else{
	out.println("<font color="+color+"size="+size+">Session is not active</font>");

}
%>
</body>
</html>