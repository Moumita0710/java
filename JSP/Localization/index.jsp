<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Choose your language</h1>
<form action="/JSP_Project/register.jsp">
<input type="radio" name="lan" value="hi"/>हिन्दी
<input type="radio" name="lan" value="mr"/>मराठी
<input type="radio" name="lan" value="en"/>English
<input type="submit">
</form>
</body>
</html>