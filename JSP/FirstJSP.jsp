<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>I am in JSP Page</h1>
<%! int i=10,j=89;
int sum=0;%>  <!-- declaration tag -->
<br>
<%=sum=i+j %> <!-- expression tag -->
<br>
<%out.println("sum="+sum); %> <!-- scriplet tag -->
<br>
<%="Hello welcome to JSP" %>
<br>
<%="sum="+sum %>
<br>

</body>
</html>