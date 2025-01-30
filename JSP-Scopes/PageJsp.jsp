<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String color=request.getParameter("mycolor");
int size=Integer.parseInt(request.getParameter("size"));
String s=String.valueOf(size);
pageContext.setAttribute("format",s,PageContext.SESSION_SCOPE);
pageContext.setAttribute("color",color,PageContext.APPLICATION_SCOPE);
%>
<a href="pageses.jsp">Please visit session page</a><br><br>
<a href="applicationses.jsp">Please visit to check application session </a><br><br>

</body>
</html>