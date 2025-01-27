<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <jsp:useBean class="beans.Emp" id="Emp">
 <jsp:setProperty property="empno" name="Emp"/>
 <jsp:setProperty property="ename" name="Emp"/>
 
 <!-- <jsp:setProperty property="*" name="Emp"/>-->  <!-- property="*" is use to set property for all -->
 </jsp:useBean>
 Hello<jsp:getProperty property="ename" name="Emp"/>your Id 
 <jsp:getProperty property="empno" name="Emp"/>is registered in our Portel.
 <% out.print(Emp.getEname()); %>
</body>
</html>