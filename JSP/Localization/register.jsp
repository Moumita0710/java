<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,java.text.*" %>
    <%
      String ln=request.getParameter("lan");
      Locale l=new Locale(ln,"IN");
      ResourceBundle bundle=ResourceBundle.getBundle("Message",l);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><%out.println(bundle.getString("welcomemessage")); %></h1>
<form>
<table>
<tr>
<td><%out.println(bundle.getString("firstName")); %></td>
<td><input type="text"/></td>
</tr>
<tr>
<td><%out.println(bundle.getString("lastname")); %></td>
<td><input type="text"/></td>
</tr>
<tr>
<td><%out.println(bundle.getString("birthday")); %></td>
<td><input type="text"/></td>
</tr>
<tr>
<td><%out.println(bundle.getString("gender")); %></td>
<td><input type="text"/></td>
</tr>
<tr>
<td><%out.println(bundle.getString("location")); %></td>
<td><input type="text"/></td>
</tr>
<tr>
<td>&nbsp;</td>
<td>&nbsp;</td>
</tr>
<tr>
<td>&nbsp;</td>
<td><input type="submit" value="<% out.println(bundle.getString("submit")); %>">
</td></tr>
</table>
</form>
</body>
</html>