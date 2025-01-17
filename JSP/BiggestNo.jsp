<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int x=50;
int y=120; %>
<% if(x>y){
	out.print(x+" is greater than "+y);
	}
else{
	out.println(y+" is greater than "+x);
}
	
	%>

</body>
</html>